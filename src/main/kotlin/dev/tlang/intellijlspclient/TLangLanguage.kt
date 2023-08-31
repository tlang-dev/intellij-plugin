package dev.tlang.intellijlspclient

import com.intellij.lang.Language

class TLangLanguage : Language("TLang") {
    private fun readResolve(): Any = TLangLanguage

    companion object {
        @JvmStatic
        val INSTANCE = TLangLanguage()
    }
}
