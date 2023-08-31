package dev.tlang.intellijlspclient

import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage


class TLangColorSettingsPage : ColorSettingsPage {
    companion object {
        val DESCRIPTORS = arrayOf(
            AttributesDescriptor("Identifier", TLangSyntaxHighlighter.ID),
            AttributesDescriptor("Keyword", TLangSyntaxHighlighter.KEYWORD),
            AttributesDescriptor("Opcode", TLangSyntaxHighlighter.OPCODE),
            AttributesDescriptor("Number", TLangSyntaxHighlighter.NUMBER),
            AttributesDescriptor("String", TLangSyntaxHighlighter.STRING),
            AttributesDescriptor("Comment", TLangSyntaxHighlighter.LINE_COMMENT),
            AttributesDescriptor("Block comment", TLangSyntaxHighlighter.BLOCK_COMMENT),
            AttributesDescriptor("Comma", TLangSyntaxHighlighter.COMMA),
            AttributesDescriptor("Parenthesis", TLangSyntaxHighlighter.PARENS),
            AttributesDescriptor("Brackets", TLangSyntaxHighlighter.BRACKETS),
            AttributesDescriptor("Braces", TLangSyntaxHighlighter.BRACES),
            AttributesDescriptor("Unary sign", TLangSyntaxHighlighter.SIGN),
            AttributesDescriptor("Dot", TLangSyntaxHighlighter.DOT),
        )
    }

    override fun getAttributeDescriptors() = DESCRIPTORS

    override fun getColorDescriptors(): Array<ColorDescriptor> = ColorDescriptor.EMPTY_ARRAY

    override fun getDisplayName() = "TLANG"

    override fun getIcon() = TLangIcons.FILE

    override fun getHighlighter() = TLangSyntaxHighlighter()

    override fun getDemoText() = ""

    override fun getAdditionalHighlightingTagToDescriptorMap(): MutableMap<String, TextAttributesKey>? = null
}