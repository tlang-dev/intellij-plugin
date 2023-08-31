package dev.tlang.intellijlspclient

import com.intellij.application.options.CodeStyleAbstractConfigurable
import com.intellij.application.options.CodeStyleAbstractPanel
import com.intellij.application.options.TabbedLanguageCodeStylePanel
import com.intellij.psi.codeStyle.CodeStyleConfigurable
import com.intellij.psi.codeStyle.CodeStyleSettings
import com.intellij.psi.codeStyle.CodeStyleSettingsProvider
import com.intellij.psi.codeStyle.CustomCodeStyleSettings

class TLangCodeStyleSettingsProvider : CodeStyleSettingsProvider() {
    override fun createCustomSettings(settings: CodeStyleSettings): CustomCodeStyleSettings =
        TLangCodeStyleSettings(settings)

    override fun getConfigurableDisplayName(): String = "TLang"

    override fun createConfigurable(
        settings: CodeStyleSettings,
        modelSettings: CodeStyleSettings
    ): CodeStyleConfigurable {
        return object : CodeStyleAbstractConfigurable(settings, modelSettings, configurableDisplayName) {
            override fun createPanel(settings: CodeStyleSettings): CodeStyleAbstractPanel =
                TLangCodeStyleMainPanel(currentSettings, settings)
        }
    }
}

private class TLangCodeStyleMainPanel(current: CodeStyleSettings, settings: CodeStyleSettings) :
    TabbedLanguageCodeStylePanel(TLangLanguage.INSTANCE, current, settings)