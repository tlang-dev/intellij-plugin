package dev.tlang.intellijlspclient

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNamedElement
import org.antlr.intellij.adaptor.SymtabUtils
import org.antlr.intellij.adaptor.psi.ScopeNode
import javax.swing.Icon


class TLangPsiFileRoot(theViewProvider: FileViewProvider) : PsiFileBase(theViewProvider, TLangLanguage.INSTANCE), ScopeNode {
    override fun getContext(): ScopeNode? = null

    override fun resolve(element: PsiNamedElement?): PsiElement?
            = SymtabUtils.resolve(this, TLangLanguage.INSTANCE, element, "/domainModel")

    override fun getFileType(): FileType = TLangFileType.INSTANCE

    override fun getIcon(flags: Int): Icon = TLangIcons.FILE

    override fun toString(): String {
        return "TLang Source file"
    }
}