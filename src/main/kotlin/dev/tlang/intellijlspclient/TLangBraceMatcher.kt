package dev.tlang.intellijlspclient

import com.intellij.lang.BracePair
import com.intellij.lang.PairedBraceMatcher
import com.intellij.psi.PsiFile
import com.intellij.psi.tree.IElementType
import dev.tlang.intellijlspclient.TLangParserDefinition.TLangParserDefinitionObject.TOKEN_ELEMENT_TYPES
import dev.tlang.parser.TLangLexer

class TLangBraceMatcher : PairedBraceMatcher {
    override fun getPairs(): Array<out BracePair> = arrayOf(
        BracePair(TOKEN_ELEMENT_TYPES[TLangLexer.INTEPRETED], TOKEN_ELEMENT_TYPES[TLangLexer.RBRACE], false),
        BracePair(TOKEN_ELEMENT_TYPES[TLangLexer.LPARENT], TOKEN_ELEMENT_TYPES[TLangLexer.RPARENT], false),
        BracePair(TOKEN_ELEMENT_TYPES[TLangLexer.LSQUARE], TOKEN_ELEMENT_TYPES[TLangLexer.RSQUARE], false),
        BracePair(TOKEN_ELEMENT_TYPES[TLangLexer.LBRACE], TOKEN_ELEMENT_TYPES[TLangLexer.RBRACE], true),
    )

    override fun isPairedBracesAllowedBeforeType(lbraceType: IElementType, contextType: IElementType?) = true

    override fun getCodeConstructStart(file: PsiFile?, openingBraceOffset: Int) = openingBraceOffset
}