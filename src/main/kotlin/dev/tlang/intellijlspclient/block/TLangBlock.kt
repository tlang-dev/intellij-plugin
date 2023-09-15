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
                ruleType(TLangParser.RULE_helperIf) -> TLangGenericIndentedBlock(child, spacingBuilder)
                ruleType(TLangParser.RULE_helperFor) -> TLangGenericIndentedBlock(child, spacingBuilder)
                ruleType(TLangParser.RULE_tmplImpl) -> TLangGenericIndentedBlock(child, spacingBuilder)
                ruleType(TLangParser.RULE_tmplIf) -> TLangGenericIndentedBlock(child, spacingBuilder)
                ruleType(TLangParser.RULE_tmplFor) -> TLangGenericIndentedBlock(child, spacingBuilder)
                ruleType(TLangParser.RULE_tmplWhile) -> TLangGenericIndentedBlock(child, spacingBuilder)
                ruleType(TLangParser.RULE_tmplDoWhile) -> TLangGenericIndentedBlock(child, spacingBuilder)
                ruleType(TLangParser.RULE_tmplPkg) -> TLangGenericIndentedBlock(child, spacingBuilder)
                ruleType(TLangParser.RULE_tmplUse) -> TLangGenericIndentedBlock(child, spacingBuilder)
                ruleType(TLangParser.RULE_modelContent) -> TLangGenericIndentedBlock(child, spacingBuilder)
                ruleType(TLangParser.RULE_modelSetAttribute) -> TLangGenericIndentedBlock(child, spacingBuilder)
                ruleType(TLangParser.RULE_operation) -> TLangGenericIndentedBlock(child, spacingBuilder)
                ruleType(TLangParser.RULE_complexAttribute) -> TLangGenericIndentedBlock(child, spacingBuilder)
                ruleType(TLangParser.RULE_tmplExpression) -> TLangGenericIndentedBlock(child, spacingBuilder)
                ruleType(TLangParser.RULE_tmplFunc) -> TLangGenericIndentedBlock(child, spacingBuilder)
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