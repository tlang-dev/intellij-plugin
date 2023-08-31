package dev.tlang.intellijlspclient

import com.intellij.application.options.IndentOptionsEditor
import com.intellij.application.options.SmartIndentOptionsEditor
import com.intellij.lang.Language
import com.intellij.psi.codeStyle.CodeStyleSettingsCustomizable
import com.intellij.psi.codeStyle.LanguageCodeStyleSettingsProvider

class TLangLanguageCodeStyleSettingsProvider : LanguageCodeStyleSettingsProvider() {
    override fun getLanguage(): Language = TLangLanguage.INSTANCE
    override fun getCodeSample(settingsType: SettingsType): String = ""
    override fun getIndentOptionsEditor(): IndentOptionsEditor = SmartIndentOptionsEditor()

    override fun customizeSettings(consumer: CodeStyleSettingsCustomizable, settingsType: SettingsType) {
        when (settingsType) {
            SettingsType.SPACING_SETTINGS -> {
                consumer.showStandardOptions(
                    "SPACE_AFTER_COMMA",
                    "SPACE_BEFORE_COMMA",
                )
            }

            SettingsType.WRAPPING_AND_BRACES_SETTINGS -> {
                consumer.showStandardOptions(
                    "RIGHT_MARGIN",
                    "WRAP_ON_TYPING",
                    "KEEP_FIRST_COLUMN_COMMENT",
                    "KEEP_LINE_BREAKS",
                    "CALL_PARAMETERS_WRAP",
                    "EXTENDS_LIST_WRAP",
                    "METHOD_ANNOTATION_WRAP",
                    "CLASS_ANNOTATION_WRAP",
                    "PARAMETER_ANNOTATION_WRAP",
                    "VARIABLE_ANNOTATION_WRAP",
                    "FIELD_ANNOTATION_WRAP",
                )
            }

            SettingsType.BLANK_LINES_SETTINGS -> {
                consumer.showStandardOptions(
                    "KEEP_BLANK_LINES_IN_CODE",
                    "KEEP_BLANK_LINES_IN_DECLARATIONS",
                    "KEEP_BLANK_LINES_BEFORE_RBRACE",
                    "BLANK_LINES_AFTER_CLASS_HEADER"
                )
            }

            SettingsType.COMMENTER_SETTINGS -> {
                consumer.showAllStandardOptions()
            }

            else -> consumer.showStandardOptions()
        }
    }
}