package dev.tlang.intellijlspclient

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import dev.tlang.parser.TLangLexer
import dev.tlang.parser.TLangParser
import org.antlr.intellij.adaptor.lexer.ANTLRLexerAdaptor
import org.antlr.intellij.adaptor.lexer.PSIElementTypeFactory
import org.antlr.intellij.adaptor.lexer.TokenIElementType


class TLangSyntaxHighlighter : SyntaxHighlighterBase() {
    companion object {
        val ID: TextAttributesKey
                = createTextAttributesKey("TLANG_ID", DefaultLanguageHighlighterColors.IDENTIFIER)
        val KEYWORD: TextAttributesKey
                = createTextAttributesKey("TLANG_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD)
        val STRING: TextAttributesKey
                = createTextAttributesKey("TLANG_STRING", DefaultLanguageHighlighterColors.STRING)
        val LINE_COMMENT: TextAttributesKey
                = createTextAttributesKey("TLANG_LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
        val BLOCK_COMMENT: TextAttributesKey
                = createTextAttributesKey("TLANG_BLOCK_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT)
        val COMMA: TextAttributesKey
                = createTextAttributesKey("TLANG_COMMA", DefaultLanguageHighlighterColors.COMMA)
        val PARENS: TextAttributesKey
                = createTextAttributesKey("TLANG_PARENS", DefaultLanguageHighlighterColors.PARENTHESES)
        val BRACKETS: TextAttributesKey
                = createTextAttributesKey("TLANG_BRACKETS", DefaultLanguageHighlighterColors.BRACKETS)
        val BRACES: TextAttributesKey
                = createTextAttributesKey("TLANG_BRACES", DefaultLanguageHighlighterColors.BRACES)
        val DOT: TextAttributesKey
                = createTextAttributesKey("TLANG_DOT", DefaultLanguageHighlighterColors.DOT)
        val SIGN: TextAttributesKey
                = createTextAttributesKey("TLANG_OPERATOR_SIGN", DefaultLanguageHighlighterColors.OPERATION_SIGN)
        val NUMBER: TextAttributesKey
                = createTextAttributesKey("TLANG_NUMBER", DefaultLanguageHighlighterColors.NUMBER)
        val OPCODE: TextAttributesKey
                = createTextAttributesKey("TLANG_OPCODE", DefaultLanguageHighlighterColors.FUNCTION_CALL)
        val ANNOTATION: TextAttributesKey
                = createTextAttributesKey("TLANG_ANNOTATION", DefaultLanguageHighlighterColors.METADATA)

        init {
            PSIElementTypeFactory.defineLanguageIElementTypes(
                TLangLanguage.INSTANCE,
                TLangLexer.tokenNames,
                TLangParser.ruleNames
            )
        }
    }

    private val emptyKeys = emptyArray<TextAttributesKey>()
    private val badToken: TextAttributesKey
            = createTextAttributesKey("TLANG_BAD_TOKEN", HighlighterColors.BAD_CHARACTER)

    override fun getHighlightingLexer() = ANTLRLexerAdaptor(TLangLanguage.INSTANCE, TLangLexer(null))

    override fun getTokenHighlights(tokenType: IElementType): Array<TextAttributesKey> {
        if (tokenType !is TokenIElementType) return emptyKeys
        val attrKey: TextAttributesKey = when (tokenType.antlrTokenType) {
            TLangLexer.Tmpl -> KEYWORD
            TLangLexer.Model -> KEYWORD
            TLangLexer.Helper -> KEYWORD
            TLangLexer.Use -> KEYWORD
            TLangLexer.Expose -> KEYWORD
            TLangLexer.Func -> KEYWORD
            TLangLexer.If -> KEYWORD
            TLangLexer.Else -> KEYWORD
            TLangLexer.For -> KEYWORD
            TLangLexer.In -> KEYWORD
            TLangLexer.To -> KEYWORD
            TLangLexer.Until -> KEYWORD
            TLangLexer.Set -> KEYWORD
            TLangLexer.Ext -> KEYWORD
            TLangLexer.Impl -> KEYWORD
            TLangLexer.Spec -> KEYWORD
            TLangLexer.Pkg -> KEYWORD
            TLangLexer.While -> KEYWORD
            TLangLexer.Do -> KEYWORD
            TLangLexer.Var -> KEYWORD
            TLangLexer.Return -> KEYWORD
            TLangLexer.STRING -> STRING
            TLangLexer.COMMENT -> BLOCK_COMMENT
            TLangLexer.LINE_COMMENT -> LINE_COMMENT
//            TLangLexer.ID -> ID
            TLangLexer.NUMBER -> NUMBER
            else -> return emptyKeys
        }
        //testStringKey(tokenType)
        return arrayOf(attrKey)
    }

    fun testStringKey(tokenType: TokenIElementType):Array<TextAttributesKey> {
        println( tokenType.antlrTokenType.toString() + ":" + tokenType.toString())
        return TextAttributesKey.EMPTY_ARRAY;
    }
}