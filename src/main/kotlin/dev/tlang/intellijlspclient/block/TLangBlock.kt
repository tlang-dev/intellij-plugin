package dev.tlang.intellijlspclient.block

import com.intellij.formatting.*
import com.intellij.lang.ASTNode
import com.intellij.psi.TokenType
import com.intellij.psi.formatter.common.AbstractBlock
import dev.tlang.intellijlspclient.TLangParserDefinition.TLangParserDefinitionObject.RULE_ELEMENT_TYPES
import dev.tlang.parser.TLangParser

open class TLangBlock(node: ASTNode, wrap: Wrap?, private val spacingBuilder: SpacingBuilder) :
    AbstractBlock(node, wrap, null) {
    override fun getSpacing(child1: Block?, child2: Block): Spacing? = spacingBuilder.getSpacing(this, child1, child2)

    override fun isLeaf(): Boolean = myNode.firstChildNode == null

    override fun buildChildren(): MutableList<Block> {
        val blocks: MutableList<Block> = ArrayList()
        var child = myNode.firstChildNode
        while (child != null) {
            val block = when (child.elementType) {
                TokenType.WHITE_SPACE -> null
                ruleType(TLangParser.RULE_helperBlock) -> TLangHelperBlock(child, spacingBuilder)
                ruleType(TLangParser.RULE_modelBlock) -> TLangModelBlock(child, spacingBuilder)
                ruleType(TLangParser.RULE_tmplBlock) -> TLangTmplBlock(child, spacingBuilder)
                ruleType(TLangParser.RULE_helperFunc) -> TLangFuncBlock(child, spacingBuilder)
                else -> TLangBlock(
                    child,
                    Wrap.createWrap(WrapType.NORMAL, false),
                    spacingBuilder
                )
            }

            if (block != null) {
                blocks.add(block)
            }

            child = child.treeNext
        }
        return blocks
    }

    override fun getIndent(): Indent? {
        return Indent.getNoneIndent()
    }

    private fun ruleType(parserType: Int) = RULE_ELEMENT_TYPES[parserType]
}