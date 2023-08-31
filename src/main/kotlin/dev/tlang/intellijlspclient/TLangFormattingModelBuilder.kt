package dev.tlang.intellijlspclient

import com.intellij.formatting.*
import dev.tlang.intellijlspclient.block.TLangBlock

class TLangFormattingModelBuilder : FormattingModelBuilder {
    override fun createModel(formattingContext: FormattingContext): FormattingModel {
        val codeStyleSettings = formattingContext.codeStyleSettings
        return FormattingModelProvider.createFormattingModelForPsiFile(
            formattingContext.containingFile,
            TLangBlock(
                formattingContext.node,
                Wrap.createWrap(WrapType.NONE, false),
                SpacingBuilder(codeStyleSettings, TLangLanguage.INSTANCE)
            ),
            codeStyleSettings
        )
    }
}