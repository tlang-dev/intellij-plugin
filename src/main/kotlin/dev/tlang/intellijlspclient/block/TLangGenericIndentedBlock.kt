package dev.tlang.intellijlspclient.block

import com.intellij.formatting.Indent
import com.intellij.formatting.SpacingBuilder
import com.intellij.formatting.Wrap
import com.intellij.formatting.WrapType
import com.intellij.lang.ASTNode

class TLangGenericIndentedBlock(node: ASTNode, spacingBuilder: SpacingBuilder) :
    TLangBlock(node, Wrap.createWrap(WrapType.ALWAYS, false), spacingBuilder) {
    override fun getIndent(): Indent? {
        return Indent.getNormalIndent()
    }
}