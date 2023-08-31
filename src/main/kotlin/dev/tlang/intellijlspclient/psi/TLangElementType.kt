package dev.tlang.intellijlspclient.psi

import com.intellij.psi.tree.IElementType
import dev.tlang.intellijlspclient.TLangLanguage

class TLangElementType(debugName: String) : IElementType(debugName, TLangLanguage.INSTANCE)