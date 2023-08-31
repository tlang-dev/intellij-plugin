// Generated from dev/tlang/parser/TLangTmpl.g4 by ANTLR 4.13.0
package dev.tlang.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TLangTmplParser}.
 */
public interface TLangTmplListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplBlock}.
	 * @param ctx the parse tree
	 */
	void enterTmplBlock(TLangTmplParser.TmplBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplBlock}.
	 * @param ctx the parse tree
	 */
	void exitTmplBlock(TLangTmplParser.TmplBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplBlockContentType}.
	 * @param ctx the parse tree
	 */
	void enterTmplBlockContentType(TLangTmplParser.TmplBlockContentTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplBlockContentType}.
	 * @param ctx the parse tree
	 */
	void exitTmplBlockContentType(TLangTmplParser.TmplBlockContentTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplFullBlock}.
	 * @param ctx the parse tree
	 */
	void enterTmplFullBlock(TLangTmplParser.TmplFullBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplFullBlock}.
	 * @param ctx the parse tree
	 */
	void exitTmplFullBlock(TLangTmplParser.TmplFullBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplSpecialisedBlock}.
	 * @param ctx the parse tree
	 */
	void enterTmplSpecialisedBlock(TLangTmplParser.TmplSpecialisedBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplSpecialisedBlock}.
	 * @param ctx the parse tree
	 */
	void exitTmplSpecialisedBlock(TLangTmplParser.TmplSpecialisedBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplSpecialisedContent}.
	 * @param ctx the parse tree
	 */
	void enterTmplSpecialisedContent(TLangTmplParser.TmplSpecialisedContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplSpecialisedContent}.
	 * @param ctx the parse tree
	 */
	void exitTmplSpecialisedContent(TLangTmplParser.TmplSpecialisedContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplContent}.
	 * @param ctx the parse tree
	 */
	void enterTmplContent(TLangTmplParser.TmplContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplContent}.
	 * @param ctx the parse tree
	 */
	void exitTmplContent(TLangTmplParser.TmplContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplPkg}.
	 * @param ctx the parse tree
	 */
	void enterTmplPkg(TLangTmplParser.TmplPkgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplPkg}.
	 * @param ctx the parse tree
	 */
	void exitTmplPkg(TLangTmplParser.TmplPkgContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplUse}.
	 * @param ctx the parse tree
	 */
	void enterTmplUse(TLangTmplParser.TmplUseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplUse}.
	 * @param ctx the parse tree
	 */
	void exitTmplUse(TLangTmplParser.TmplUseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplAnnot}.
	 * @param ctx the parse tree
	 */
	void enterTmplAnnot(TLangTmplParser.TmplAnnotContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplAnnot}.
	 * @param ctx the parse tree
	 */
	void exitTmplAnnot(TLangTmplParser.TmplAnnotContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplAnnotParam}.
	 * @param ctx the parse tree
	 */
	void enterTmplAnnotParam(TLangTmplParser.TmplAnnotParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplAnnotParam}.
	 * @param ctx the parse tree
	 */
	void exitTmplAnnotParam(TLangTmplParser.TmplAnnotParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplProps}.
	 * @param ctx the parse tree
	 */
	void enterTmplProps(TLangTmplParser.TmplPropsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplProps}.
	 * @param ctx the parse tree
	 */
	void exitTmplProps(TLangTmplParser.TmplPropsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplImpl}.
	 * @param ctx the parse tree
	 */
	void enterTmplImpl(TLangTmplParser.TmplImplContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplImpl}.
	 * @param ctx the parse tree
	 */
	void exitTmplImpl(TLangTmplParser.TmplImplContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplFunc}.
	 * @param ctx the parse tree
	 */
	void enterTmplFunc(TLangTmplParser.TmplFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplFunc}.
	 * @param ctx the parse tree
	 */
	void exitTmplFunc(TLangTmplParser.TmplFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplCurrying}.
	 * @param ctx the parse tree
	 */
	void enterTmplCurrying(TLangTmplParser.TmplCurryingContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplCurrying}.
	 * @param ctx the parse tree
	 */
	void exitTmplCurrying(TLangTmplParser.TmplCurryingContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplCurryingParam}.
	 * @param ctx the parse tree
	 */
	void enterTmplCurryingParam(TLangTmplParser.TmplCurryingParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplCurryingParam}.
	 * @param ctx the parse tree
	 */
	void exitTmplCurryingParam(TLangTmplParser.TmplCurryingParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplParam}.
	 * @param ctx the parse tree
	 */
	void enterTmplParam(TLangTmplParser.TmplParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplParam}.
	 * @param ctx the parse tree
	 */
	void exitTmplParam(TLangTmplParser.TmplParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplType}.
	 * @param ctx the parse tree
	 */
	void enterTmplType(TLangTmplParser.TmplTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplType}.
	 * @param ctx the parse tree
	 */
	void exitTmplType(TLangTmplParser.TmplTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplGeneric}.
	 * @param ctx the parse tree
	 */
	void enterTmplGeneric(TLangTmplParser.TmplGenericContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplGeneric}.
	 * @param ctx the parse tree
	 */
	void exitTmplGeneric(TLangTmplParser.TmplGenericContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplExprContent}.
	 * @param ctx the parse tree
	 */
	void enterTmplExprContent(TLangTmplParser.TmplExprContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplExprContent}.
	 * @param ctx the parse tree
	 */
	void exitTmplExprContent(TLangTmplParser.TmplExprContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplExprBlock}.
	 * @param ctx the parse tree
	 */
	void enterTmplExprBlock(TLangTmplParser.TmplExprBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplExprBlock}.
	 * @param ctx the parse tree
	 */
	void exitTmplExprBlock(TLangTmplParser.TmplExprBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplExpression}.
	 * @param ctx the parse tree
	 */
	void enterTmplExpression(TLangTmplParser.TmplExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplExpression}.
	 * @param ctx the parse tree
	 */
	void exitTmplExpression(TLangTmplParser.TmplExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplIf}.
	 * @param ctx the parse tree
	 */
	void enterTmplIf(TLangTmplParser.TmplIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplIf}.
	 * @param ctx the parse tree
	 */
	void exitTmplIf(TLangTmplParser.TmplIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplElse}.
	 * @param ctx the parse tree
	 */
	void enterTmplElse(TLangTmplParser.TmplElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplElse}.
	 * @param ctx the parse tree
	 */
	void exitTmplElse(TLangTmplParser.TmplElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplFor}.
	 * @param ctx the parse tree
	 */
	void enterTmplFor(TLangTmplParser.TmplForContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplFor}.
	 * @param ctx the parse tree
	 */
	void exitTmplFor(TLangTmplParser.TmplForContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplWhile}.
	 * @param ctx the parse tree
	 */
	void enterTmplWhile(TLangTmplParser.TmplWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplWhile}.
	 * @param ctx the parse tree
	 */
	void exitTmplWhile(TLangTmplParser.TmplWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplDoWhile}.
	 * @param ctx the parse tree
	 */
	void enterTmplDoWhile(TLangTmplParser.TmplDoWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplDoWhile}.
	 * @param ctx the parse tree
	 */
	void exitTmplDoWhile(TLangTmplParser.TmplDoWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplAnonFunc}.
	 * @param ctx the parse tree
	 */
	void enterTmplAnonFunc(TLangTmplParser.TmplAnonFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplAnonFunc}.
	 * @param ctx the parse tree
	 */
	void exitTmplAnonFunc(TLangTmplParser.TmplAnonFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplVar}.
	 * @param ctx the parse tree
	 */
	void enterTmplVar(TLangTmplParser.TmplVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplVar}.
	 * @param ctx the parse tree
	 */
	void exitTmplVar(TLangTmplParser.TmplVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplOptionalValue}.
	 * @param ctx the parse tree
	 */
	void enterTmplOptionalValue(TLangTmplParser.TmplOptionalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplOptionalValue}.
	 * @param ctx the parse tree
	 */
	void exitTmplOptionalValue(TLangTmplParser.TmplOptionalValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplCallObj}.
	 * @param ctx the parse tree
	 */
	void enterTmplCallObj(TLangTmplParser.TmplCallObjContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplCallObj}.
	 * @param ctx the parse tree
	 */
	void exitTmplCallObj(TLangTmplParser.TmplCallObjContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplCallObjType}.
	 * @param ctx the parse tree
	 */
	void enterTmplCallObjType(TLangTmplParser.TmplCallObjTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplCallObjType}.
	 * @param ctx the parse tree
	 */
	void exitTmplCallObjType(TLangTmplParser.TmplCallObjTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplCallFunc}.
	 * @param ctx the parse tree
	 */
	void enterTmplCallFunc(TLangTmplParser.TmplCallFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplCallFunc}.
	 * @param ctx the parse tree
	 */
	void exitTmplCallFunc(TLangTmplParser.TmplCallFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplCurryParams}.
	 * @param ctx the parse tree
	 */
	void enterTmplCurryParams(TLangTmplParser.TmplCurryParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplCurryParams}.
	 * @param ctx the parse tree
	 */
	void exitTmplCurryParams(TLangTmplParser.TmplCurryParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplSetAttribute}.
	 * @param ctx the parse tree
	 */
	void enterTmplSetAttribute(TLangTmplParser.TmplSetAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplSetAttribute}.
	 * @param ctx the parse tree
	 */
	void exitTmplSetAttribute(TLangTmplParser.TmplSetAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplInclSetAttribute}.
	 * @param ctx the parse tree
	 */
	void enterTmplInclSetAttribute(TLangTmplParser.TmplInclSetAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplInclSetAttribute}.
	 * @param ctx the parse tree
	 */
	void exitTmplInclSetAttribute(TLangTmplParser.TmplInclSetAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplCallArray}.
	 * @param ctx the parse tree
	 */
	void enterTmplCallArray(TLangTmplParser.TmplCallArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplCallArray}.
	 * @param ctx the parse tree
	 */
	void exitTmplCallArray(TLangTmplParser.TmplCallArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplCallVariable}.
	 * @param ctx the parse tree
	 */
	void enterTmplCallVariable(TLangTmplParser.TmplCallVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplCallVariable}.
	 * @param ctx the parse tree
	 */
	void exitTmplCallVariable(TLangTmplParser.TmplCallVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplValueType}.
	 * @param ctx the parse tree
	 */
	void enterTmplValueType(TLangTmplParser.TmplValueTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplValueType}.
	 * @param ctx the parse tree
	 */
	void exitTmplValueType(TLangTmplParser.TmplValueTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplPrimitiveValue}.
	 * @param ctx the parse tree
	 */
	void enterTmplPrimitiveValue(TLangTmplParser.TmplPrimitiveValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplPrimitiveValue}.
	 * @param ctx the parse tree
	 */
	void exitTmplPrimitiveValue(TLangTmplParser.TmplPrimitiveValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplStringValue}.
	 * @param ctx the parse tree
	 */
	void enterTmplStringValue(TLangTmplParser.TmplStringValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplStringValue}.
	 * @param ctx the parse tree
	 */
	void exitTmplStringValue(TLangTmplParser.TmplStringValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplNumberValue}.
	 * @param ctx the parse tree
	 */
	void enterTmplNumberValue(TLangTmplParser.TmplNumberValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplNumberValue}.
	 * @param ctx the parse tree
	 */
	void exitTmplNumberValue(TLangTmplParser.TmplNumberValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplTextValue}.
	 * @param ctx the parse tree
	 */
	void enterTmplTextValue(TLangTmplParser.TmplTextValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplTextValue}.
	 * @param ctx the parse tree
	 */
	void exitTmplTextValue(TLangTmplParser.TmplTextValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplBoolValue}.
	 * @param ctx the parse tree
	 */
	void enterTmplBoolValue(TLangTmplParser.TmplBoolValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplBoolValue}.
	 * @param ctx the parse tree
	 */
	void exitTmplBoolValue(TLangTmplParser.TmplBoolValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplArrayValue}.
	 * @param ctx the parse tree
	 */
	void enterTmplArrayValue(TLangTmplParser.TmplArrayValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplArrayValue}.
	 * @param ctx the parse tree
	 */
	void exitTmplArrayValue(TLangTmplParser.TmplArrayValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplInclAttribute}.
	 * @param ctx the parse tree
	 */
	void enterTmplInclAttribute(TLangTmplParser.TmplInclAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplInclAttribute}.
	 * @param ctx the parse tree
	 */
	void exitTmplInclAttribute(TLangTmplParser.TmplInclAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplAttribute}.
	 * @param ctx the parse tree
	 */
	void enterTmplAttribute(TLangTmplParser.TmplAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplAttribute}.
	 * @param ctx the parse tree
	 */
	void exitTmplAttribute(TLangTmplParser.TmplAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplMultiValue}.
	 * @param ctx the parse tree
	 */
	void enterTmplMultiValue(TLangTmplParser.TmplMultiValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplMultiValue}.
	 * @param ctx the parse tree
	 */
	void exitTmplMultiValue(TLangTmplParser.TmplMultiValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplEntityValue}.
	 * @param ctx the parse tree
	 */
	void enterTmplEntityValue(TLangTmplParser.TmplEntityValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplEntityValue}.
	 * @param ctx the parse tree
	 */
	void exitTmplEntityValue(TLangTmplParser.TmplEntityValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplOperation}.
	 * @param ctx the parse tree
	 */
	void enterTmplOperation(TLangTmplParser.TmplOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplOperation}.
	 * @param ctx the parse tree
	 */
	void exitTmplOperation(TLangTmplParser.TmplOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplInclude}.
	 * @param ctx the parse tree
	 */
	void enterTmplInclude(TLangTmplParser.TmplIncludeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplInclude}.
	 * @param ctx the parse tree
	 */
	void exitTmplInclude(TLangTmplParser.TmplIncludeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplReturn}.
	 * @param ctx the parse tree
	 */
	void enterTmplReturn(TLangTmplParser.TmplReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplReturn}.
	 * @param ctx the parse tree
	 */
	void exitTmplReturn(TLangTmplParser.TmplReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplAffect}.
	 * @param ctx the parse tree
	 */
	void enterTmplAffect(TLangTmplParser.TmplAffectContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplAffect}.
	 * @param ctx the parse tree
	 */
	void exitTmplAffect(TLangTmplParser.TmplAffectContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplCast}.
	 * @param ctx the parse tree
	 */
	void enterTmplCast(TLangTmplParser.TmplCastContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplCast}.
	 * @param ctx the parse tree
	 */
	void exitTmplCast(TLangTmplParser.TmplCastContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplID}.
	 * @param ctx the parse tree
	 */
	void enterTmplID(TLangTmplParser.TmplIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplID}.
	 * @param ctx the parse tree
	 */
	void exitTmplID(TLangTmplParser.TmplIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplIntprID}.
	 * @param ctx the parse tree
	 */
	void enterTmplIntprID(TLangTmplParser.TmplIntprIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplIntprID}.
	 * @param ctx the parse tree
	 */
	void exitTmplIntprID(TLangTmplParser.TmplIntprIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplString}.
	 * @param ctx the parse tree
	 */
	void enterTmplString(TLangTmplParser.TmplStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplString}.
	 * @param ctx the parse tree
	 */
	void exitTmplString(TLangTmplParser.TmplStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplIntprString}.
	 * @param ctx the parse tree
	 */
	void enterTmplIntprString(TLangTmplParser.TmplIntprStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplIntprString}.
	 * @param ctx the parse tree
	 */
	void exitTmplIntprString(TLangTmplParser.TmplIntprStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplText}.
	 * @param ctx the parse tree
	 */
	void enterTmplText(TLangTmplParser.TmplTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplText}.
	 * @param ctx the parse tree
	 */
	void exitTmplText(TLangTmplParser.TmplTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplIntprText}.
	 * @param ctx the parse tree
	 */
	void enterTmplIntprText(TLangTmplParser.TmplIntprTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplIntprText}.
	 * @param ctx the parse tree
	 */
	void exitTmplIntprText(TLangTmplParser.TmplIntprTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#tmplIdOrString}.
	 * @param ctx the parse tree
	 */
	void enterTmplIdOrString(TLangTmplParser.TmplIdOrStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#tmplIdOrString}.
	 * @param ctx the parse tree
	 */
	void exitTmplIdOrString(TLangTmplParser.TmplIdOrStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#assignVar}.
	 * @param ctx the parse tree
	 */
	void enterAssignVar(TLangTmplParser.AssignVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#assignVar}.
	 * @param ctx the parse tree
	 */
	void exitAssignVar(TLangTmplParser.AssignVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#valueType}.
	 * @param ctx the parse tree
	 */
	void enterValueType(TLangTmplParser.ValueTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#valueType}.
	 * @param ctx the parse tree
	 */
	void exitValueType(TLangTmplParser.ValueTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#objType}.
	 * @param ctx the parse tree
	 */
	void enterObjType(TLangTmplParser.ObjTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#objType}.
	 * @param ctx the parse tree
	 */
	void exitObjType(TLangTmplParser.ObjTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(TLangTmplParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(TLangTmplParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(TLangTmplParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(TLangTmplParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(TLangTmplParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(TLangTmplParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#complexValueType}.
	 * @param ctx the parse tree
	 */
	void enterComplexValueType(TLangTmplParser.ComplexValueTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#complexValueType}.
	 * @param ctx the parse tree
	 */
	void exitComplexValueType(TLangTmplParser.ComplexValueTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#primitiveValue}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveValue(TLangTmplParser.PrimitiveValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#primitiveValue}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveValue(TLangTmplParser.PrimitiveValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#lazyValue}.
	 * @param ctx the parse tree
	 */
	void enterLazyValue(TLangTmplParser.LazyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#lazyValue}.
	 * @param ctx the parse tree
	 */
	void exitLazyValue(TLangTmplParser.LazyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#stringValue}.
	 * @param ctx the parse tree
	 */
	void enterStringValue(TLangTmplParser.StringValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#stringValue}.
	 * @param ctx the parse tree
	 */
	void exitStringValue(TLangTmplParser.StringValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#numberValue}.
	 * @param ctx the parse tree
	 */
	void enterNumberValue(TLangTmplParser.NumberValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#numberValue}.
	 * @param ctx the parse tree
	 */
	void exitNumberValue(TLangTmplParser.NumberValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#textValue}.
	 * @param ctx the parse tree
	 */
	void enterTextValue(TLangTmplParser.TextValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#textValue}.
	 * @param ctx the parse tree
	 */
	void exitTextValue(TLangTmplParser.TextValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#boolValue}.
	 * @param ctx the parse tree
	 */
	void enterBoolValue(TLangTmplParser.BoolValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#boolValue}.
	 * @param ctx the parse tree
	 */
	void exitBoolValue(TLangTmplParser.BoolValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#arrayValue}.
	 * @param ctx the parse tree
	 */
	void enterArrayValue(TLangTmplParser.ArrayValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#arrayValue}.
	 * @param ctx the parse tree
	 */
	void exitArrayValue(TLangTmplParser.ArrayValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#callObj}.
	 * @param ctx the parse tree
	 */
	void enterCallObj(TLangTmplParser.CallObjContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#callObj}.
	 * @param ctx the parse tree
	 */
	void exitCallObj(TLangTmplParser.CallObjContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#callObjType}.
	 * @param ctx the parse tree
	 */
	void enterCallObjType(TLangTmplParser.CallObjTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#callObjType}.
	 * @param ctx the parse tree
	 */
	void exitCallObjType(TLangTmplParser.CallObjTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#callArray}.
	 * @param ctx the parse tree
	 */
	void enterCallArray(TLangTmplParser.CallArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#callArray}.
	 * @param ctx the parse tree
	 */
	void exitCallArray(TLangTmplParser.CallArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#callFunc}.
	 * @param ctx the parse tree
	 */
	void enterCallFunc(TLangTmplParser.CallFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#callFunc}.
	 * @param ctx the parse tree
	 */
	void exitCallFunc(TLangTmplParser.CallFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#curryParams}.
	 * @param ctx the parse tree
	 */
	void enterCurryParams(TLangTmplParser.CurryParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#curryParams}.
	 * @param ctx the parse tree
	 */
	void exitCurryParams(TLangTmplParser.CurryParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#setAttribute}.
	 * @param ctx the parse tree
	 */
	void enterSetAttribute(TLangTmplParser.SetAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#setAttribute}.
	 * @param ctx the parse tree
	 */
	void exitSetAttribute(TLangTmplParser.SetAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#callVariable}.
	 * @param ctx the parse tree
	 */
	void enterCallVariable(TLangTmplParser.CallVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#callVariable}.
	 * @param ctx the parse tree
	 */
	void exitCallVariable(TLangTmplParser.CallVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#entityValue}.
	 * @param ctx the parse tree
	 */
	void enterEntityValue(TLangTmplParser.EntityValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#entityValue}.
	 * @param ctx the parse tree
	 */
	void exitEntityValue(TLangTmplParser.EntityValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#impl}.
	 * @param ctx the parse tree
	 */
	void enterImpl(TLangTmplParser.ImplContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#impl}.
	 * @param ctx the parse tree
	 */
	void exitImpl(TLangTmplParser.ImplContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#multiValue}.
	 * @param ctx the parse tree
	 */
	void enterMultiValue(TLangTmplParser.MultiValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#multiValue}.
	 * @param ctx the parse tree
	 */
	void exitMultiValue(TLangTmplParser.MultiValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#complexAttribute}.
	 * @param ctx the parse tree
	 */
	void enterComplexAttribute(TLangTmplParser.ComplexAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#complexAttribute}.
	 * @param ctx the parse tree
	 */
	void exitComplexAttribute(TLangTmplParser.ComplexAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#helperBlock}.
	 * @param ctx the parse tree
	 */
	void enterHelperBlock(TLangTmplParser.HelperBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#helperBlock}.
	 * @param ctx the parse tree
	 */
	void exitHelperBlock(TLangTmplParser.HelperBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#helperFunc}.
	 * @param ctx the parse tree
	 */
	void enterHelperFunc(TLangTmplParser.HelperFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#helperFunc}.
	 * @param ctx the parse tree
	 */
	void exitHelperFunc(TLangTmplParser.HelperFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#helperCurrying}.
	 * @param ctx the parse tree
	 */
	void enterHelperCurrying(TLangTmplParser.HelperCurryingContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#helperCurrying}.
	 * @param ctx the parse tree
	 */
	void exitHelperCurrying(TLangTmplParser.HelperCurryingContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#helperParam}.
	 * @param ctx the parse tree
	 */
	void enterHelperParam(TLangTmplParser.HelperParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#helperParam}.
	 * @param ctx the parse tree
	 */
	void exitHelperParam(TLangTmplParser.HelperParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#helperParamType}.
	 * @param ctx the parse tree
	 */
	void enterHelperParamType(TLangTmplParser.HelperParamTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#helperParamType}.
	 * @param ctx the parse tree
	 */
	void exitHelperParamType(TLangTmplParser.HelperParamTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#helperFuncType}.
	 * @param ctx the parse tree
	 */
	void enterHelperFuncType(TLangTmplParser.HelperFuncTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#helperFuncType}.
	 * @param ctx the parse tree
	 */
	void exitHelperFuncType(TLangTmplParser.HelperFuncTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#helperContent}.
	 * @param ctx the parse tree
	 */
	void enterHelperContent(TLangTmplParser.HelperContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#helperContent}.
	 * @param ctx the parse tree
	 */
	void exitHelperContent(TLangTmplParser.HelperContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#helperStatement}.
	 * @param ctx the parse tree
	 */
	void enterHelperStatement(TLangTmplParser.HelperStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#helperStatement}.
	 * @param ctx the parse tree
	 */
	void exitHelperStatement(TLangTmplParser.HelperStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#helperIf}.
	 * @param ctx the parse tree
	 */
	void enterHelperIf(TLangTmplParser.HelperIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#helperIf}.
	 * @param ctx the parse tree
	 */
	void exitHelperIf(TLangTmplParser.HelperIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#helperElse}.
	 * @param ctx the parse tree
	 */
	void enterHelperElse(TLangTmplParser.HelperElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#helperElse}.
	 * @param ctx the parse tree
	 */
	void exitHelperElse(TLangTmplParser.HelperElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangTmplParser#helperFor}.
	 * @param ctx the parse tree
	 */
	void enterHelperFor(TLangTmplParser.HelperForContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangTmplParser#helperFor}.
	 * @param ctx the parse tree
	 */
	void exitHelperFor(TLangTmplParser.HelperForContext ctx);
}