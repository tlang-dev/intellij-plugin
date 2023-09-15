package dev.tlang.intellijlspclient

import com.intellij.application.options.CodeStyleAbstractConfigurable
import com.intellij.application.options.CodeStyleAbstractPanel
import com.intellij.application.options.TabbedLanguageCodeStylePanel
import com.intellij.psi.codeStyle.CodeStyleConfigurable
import com.intellij.psi.codeStyle.CodeStyleSettings
import com.intellij.psi.codeStyle.CodeStyleSettingsProvider
import com.intellij.psi.codeStyle.CustomCodeStyleSettings
import org.jetbrains.annotations.NotNull

class TLangCodeStyleSettingsProvider : CodeStyleSettingsProvider() {
    override fun createCustomSettings(settings: CodeStyleSettings): CustomCodeStyleSettings =
        TLangCodeStyleSettings(settings)

    override fun getConfigurableDisplayName(): String = "TLang"

    //    override fun createConfigurable(
//        settings: CodeStyleSettings,
//        modelSettings: CodeStyleSettings
//    ): CodeStyleConfigurable {
//        return object : CodeStyleAbstractConfigurable(settings, modelSettings, configurableDisplayName) {
//            override fun createPanel(settings: CodeStyleSettings): CodeStyleAbstractPanel =
//                TLangCodeStyleMainPanel(currentSettings, settings)
//        }
//    }

    override fun createConfigurable(
        @NotNull settings: CodeStyleSettings,
        @NotNull modelSettings: CodeStyleSettings
    ): CodeStyleConfigurable {
        return object : CodeStyleAbstractConfigurable(settings, modelSettings!!, getConfigurableDisplayName()) {
            @NotNull
            override fun createPanel(@NotNull settings: CodeStyleSettings): CodeStyleAbstractPanel {
                return SimpleCodeStyleMainPanel(currentSettings, settings)
            }
        }
    }
}


private class SimpleCodeStyleMainPanel(currentSettings: CodeStyleSettings?, settings: CodeStyleSettings) :
    TabbedLanguageCodeStylePanel(TLangLanguage.INSTANCE, currentSettings, settings) {
    init {
        // Add your custom code style options to the panel
        addSpacesOption()
        addWrappingAndBracesOptions()
        // Add more options as needed
    }

    private fun addSpacesOption() {
        // Add code style options related to spaces
        // For example:
//            addIndentOptions()
//            addMethodParenthesesOptions()
        // Add more spaces options as needed
    }

    private fun addWrappingAndBracesOptions() {
        // Add code style options related to wrapping and braces
        // For example:
//            ad
//            addWrapOptions()
//            addBraceOptions()
        // Add more wrapping and braces options as needed
    }
}


//private class TLangCodeStyleMainPanel(current: CodeStyleSettings, settings: CodeStyleSettings) :
//    TabbedLanguageCodeStylePanel(TLangLanguage.INSTANCE, current, settings) {
//    override fun getEditor(): Editor {
//        return super.getEditor()
//    }
//}