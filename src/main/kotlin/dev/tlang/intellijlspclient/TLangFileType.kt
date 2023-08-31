package dev.tlang.intellijlspclient

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

class TLangFileType private constructor() : LanguageFileType(TLangLanguage.INSTANCE) {
    override fun getName(): String {
        return "TLang File"
    }

    override fun getDescription(): String {
        return "TLang language file"
    }

    override fun getDefaultExtension(): String {
        return "tlang"
    }

    override fun getIcon(): Icon {
        return TLangIcons.FILE
    }

    companion object {
        val INSTANCE = TLangFileType()
    }
}