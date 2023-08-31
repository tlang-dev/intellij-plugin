package dev.tlang.intellijlspclient

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IElementType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import dev.tlang.intellijlspclient.psi.RulePsiNode
import dev.tlang.parser.TLangLexer
import dev.tlang.parser.TLangParser
import org.antlr.intellij.adaptor.lexer.ANTLRLexerAdaptor
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory
import org.antlr.intellij.adaptor.lexer.RuleIElementType
import org.antlr.intellij.adaptor.lexer.TokenIElementType
import org.antlr.intellij.adaptor.parser.ANTLRParserAdaptor
import org.antlr.intellij.adaptor.psi.ANTLRPsiNode
import org.antlr.v4.runtime.*


class TLangParserDefinition : ParserDefinition {

    object TLangParserDefinitionObject {
        val TOKEN_ELEMENT_TYPES: List<TokenIElementType>
        val RULE_ELEMENT_TYPES: List<RuleIElementType>

        // N.B. This must be done before the createTokenSet stuff below!
        init {
            PSIElementTypeFactory.defineLanguageIElementTypes(
                TLangLanguage.INSTANCE,
                TLangParser.tokenNames,
                TLangParser.ruleNames
            )

            TOKEN_ELEMENT_TYPES = PSIElementTypeFactory.getTokenIElementTypes(TLangLanguage.INSTANCE)
            RULE_ELEMENT_TYPES = PSIElementTypeFactory.getRuleIElementTypes(TLangLanguage.INSTANCE)
        }

        val FILE = IFileElementType(TLangLanguage.INSTANCE)

        val COMMENTS: TokenSet = PSIElementTypeFactory.createTokenSet(
            TLangLanguage.INSTANCE,
            TLangLexer.COMMENT,
            TLangLexer.LINE_COMMENT
        )

        val WHITESPACE: TokenSet = PSIElementTypeFactory.createTokenSet(
            TLangLanguage.INSTANCE,
            TLangLexer.WHITE_SPACES,
            TLangLexer.WS
//            TLangLexer.SPACE
        )

        val STRINGS: TokenSet = PSIElementTypeFactory.createTokenSet(
            TLangLanguage.INSTANCE,
            TLangLexer.STRING,
            TLangLexer.TEXT
        )
    }

    override fun createLexer(project: Project) = ANTLRLexerAdaptor(TLangLanguage.INSTANCE, TLangLexer(null))

    //    override fun createParser(project: Project) =
//        object : ANTLRParserAdaptor(TLangLanguage.INSTANCE, TLangParser(null)) {
//            override fun parse(parser: Parser?, root: IElementType?): ParseTree {
//                parser!!.removeErrorListeners()
//                parser.addErrorListener(object : SyntaxErrorListener() {
//                    override fun syntaxError(
//                        recognizer: Recognizer<*, *>?,
//                        offendingSymbol: Any,
//                        line: Int,
//                        charPositionInLine: Int,
//                        msg: String?,
//                        e: RecognitionException?
//                    ) {
//                        var msg = msg
//                        val offendingToken: Token = offendingSymbol as Token
//                        if (e is NoViableAltException) {
//                            msg = ("unexpected token '" + offendingToken.getText()).toString() + "'"
//                        }
//                        syntaxErrors.add(object :
//                            SyntaxError(recognizer, offendingToken, line, charPositionInLine, msg, e) {
//                            val offendingSymbol: Token
//                                get() = offendingToken
//                        })
//                    }
//                })
//
//                return (parser as TLangParser).domainModel()
//            }
//
//        }
    override fun createParser(project: Project) =
        object : ANTLRParserAdaptor(TLangLanguage.INSTANCE, TLangParser(null)) {
            override fun parse(parser: Parser?, root: IElementType?) = (parser as TLangParser).domainModel()
        }

    override fun getFileNodeType(): IFileElementType = TLangParserDefinitionObject.FILE

    override fun createElement(node: ASTNode): PsiElement = when (val elementType = node.elementType) {
        is TokenIElementType -> ANTLRPsiNode(node)
        !is RuleIElementType -> ANTLRPsiNode(node)
        else -> {
            when (elementType.ruleIndex) {
//                TLangParser.RULE_impl           -> FieldSubtree(node)
//                TLangParser.RULE_method          -> MethodSubtree(node)
                else -> RulePsiNode(node)
            }
        }
    }

    override fun createFile(viewProvider: FileViewProvider): PsiFile = TLangPsiFileRoot(viewProvider)

    override fun spaceExistenceTypeBetweenTokens(left: ASTNode?, right: ASTNode?): ParserDefinition.SpaceRequirements =
        ParserDefinition.SpaceRequirements.MAY

    override fun getCommentTokens(): TokenSet = TLangParserDefinitionObject.COMMENTS

    override fun getStringLiteralElements(): TokenSet = TLangParserDefinitionObject.STRINGS

    override fun getWhitespaceTokens(): TokenSet = TLangParserDefinitionObject.WHITESPACE
}