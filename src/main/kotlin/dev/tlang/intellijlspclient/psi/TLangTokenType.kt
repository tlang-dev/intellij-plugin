package dev.tlang.intellijlspclient.psi

import com.intellij.psi.tree.IElementType
import dev.tlang.intellijlspclient.TLangLanguage

class TLangTokenType(debugName: String) : IElementType(debugName, TLangLanguage.INSTANCE)