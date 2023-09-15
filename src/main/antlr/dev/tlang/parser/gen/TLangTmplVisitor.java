// Generated from /home/joel/EventManager/intellij-lsp-client/intellij-lsp-client/src/main/antlr/dev/tlang/parser/TLangTmpl.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TLangTmplParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TLangTmplVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplBlock(TLangTmplParser.TmplBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplBlockContentType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplBlockContentType(TLangTmplParser.TmplBlockContentTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplFullBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplFullBlock(TLangTmplParser.TmplFullBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplSpecialisedBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplSpecialisedBlock(TLangTmplParser.TmplSpecialisedBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplSpecialisedContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplSpecialisedContent(TLangTmplParser.TmplSpecialisedContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplContent(TLangTmplParser.TmplContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplPkg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplPkg(TLangTmplParser.TmplPkgContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplUse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplUse(TLangTmplParser.TmplUseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplAnnot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplAnnot(TLangTmplParser.TmplAnnotContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplAnnotParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplAnnotParam(TLangTmplParser.TmplAnnotParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplProps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplProps(TLangTmplParser.TmplPropsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplImpl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplImpl(TLangTmplParser.TmplImplContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplFunc(TLangTmplParser.TmplFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplCurrying}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplCurrying(TLangTmplParser.TmplCurryingContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplCurryingParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplCurryingParam(TLangTmplParser.TmplCurryingParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplParam(TLangTmplParser.TmplParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplType(TLangTmplParser.TmplTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplGeneric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplGeneric(TLangTmplParser.TmplGenericContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplExprContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplExprContent(TLangTmplParser.TmplExprContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplExprBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplExprBlock(TLangTmplParser.TmplExprBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplExpression(TLangTmplParser.TmplExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplIf(TLangTmplParser.TmplIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplElse(TLangTmplParser.TmplElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplFor(TLangTmplParser.TmplForContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplWhile(TLangTmplParser.TmplWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplDoWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplDoWhile(TLangTmplParser.TmplDoWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplAnonFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplAnonFunc(TLangTmplParser.TmplAnonFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplVar(TLangTmplParser.TmplVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplOptionalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplOptionalValue(TLangTmplParser.TmplOptionalValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplCallObj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplCallObj(TLangTmplParser.TmplCallObjContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplCallObjType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplCallObjType(TLangTmplParser.TmplCallObjTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplCallFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplCallFunc(TLangTmplParser.TmplCallFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplCurryParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplCurryParams(TLangTmplParser.TmplCurryParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplSetAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplSetAttribute(TLangTmplParser.TmplSetAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplInclSetAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplInclSetAttribute(TLangTmplParser.TmplInclSetAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplCallArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplCallArray(TLangTmplParser.TmplCallArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplCallVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplCallVariable(TLangTmplParser.TmplCallVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplValueType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplValueType(TLangTmplParser.TmplValueTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplPrimitiveValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplPrimitiveValue(TLangTmplParser.TmplPrimitiveValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplStringValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplStringValue(TLangTmplParser.TmplStringValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplNumberValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplNumberValue(TLangTmplParser.TmplNumberValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplTextValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplTextValue(TLangTmplParser.TmplTextValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplBoolValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplBoolValue(TLangTmplParser.TmplBoolValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplArrayValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplArrayValue(TLangTmplParser.TmplArrayValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplInclAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplInclAttribute(TLangTmplParser.TmplInclAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplAttribute(TLangTmplParser.TmplAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplMultiValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplMultiValue(TLangTmplParser.TmplMultiValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplEntityValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplEntityValue(TLangTmplParser.TmplEntityValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplOperation(TLangTmplParser.TmplOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplInclude}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplInclude(TLangTmplParser.TmplIncludeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplReturn(TLangTmplParser.TmplReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplAffect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplAffect(TLangTmplParser.TmplAffectContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplCast}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplCast(TLangTmplParser.TmplCastContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplID(TLangTmplParser.TmplIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplIntprID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplIntprID(TLangTmplParser.TmplIntprIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplString(TLangTmplParser.TmplStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplIntprString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplIntprString(TLangTmplParser.TmplIntprStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplText(TLangTmplParser.TmplTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplIntprText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplIntprText(TLangTmplParser.TmplIntprTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#tmplIdOrString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTmplIdOrString(TLangTmplParser.TmplIdOrStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#assignVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignVar(TLangTmplParser.AssignVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#valueType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueType(TLangTmplParser.ValueTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#objType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjType(TLangTmplParser.ObjTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(TLangTmplParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(TLangTmplParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(TLangTmplParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#complexValueType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexValueType(TLangTmplParser.ComplexValueTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#primitiveValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveValue(TLangTmplParser.PrimitiveValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#lazyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLazyValue(TLangTmplParser.LazyValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#stringValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringValue(TLangTmplParser.StringValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#numberValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberValue(TLangTmplParser.NumberValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#textValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextValue(TLangTmplParser.TextValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#boolValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolValue(TLangTmplParser.BoolValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#arrayValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayValue(TLangTmplParser.ArrayValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#callObj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallObj(TLangTmplParser.CallObjContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#callObjType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallObjType(TLangTmplParser.CallObjTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#callArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallArray(TLangTmplParser.CallArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#callFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFunc(TLangTmplParser.CallFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#curryParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurryParams(TLangTmplParser.CurryParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#setAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetAttribute(TLangTmplParser.SetAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#callVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallVariable(TLangTmplParser.CallVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#entityValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntityValue(TLangTmplParser.EntityValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#impl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpl(TLangTmplParser.ImplContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#multiValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiValue(TLangTmplParser.MultiValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#complexAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexAttribute(TLangTmplParser.ComplexAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#helperBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHelperBlock(TLangTmplParser.HelperBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#helperFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHelperFunc(TLangTmplParser.HelperFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#helperCurrying}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHelperCurrying(TLangTmplParser.HelperCurryingContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#helperParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHelperParam(TLangTmplParser.HelperParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#helperParamType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHelperParamType(TLangTmplParser.HelperParamTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#helperFuncType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHelperFuncType(TLangTmplParser.HelperFuncTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#helperContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHelperContent(TLangTmplParser.HelperContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#helperStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHelperStatement(TLangTmplParser.HelperStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#helperIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHelperIf(TLangTmplParser.HelperIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#helperElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHelperElse(TLangTmplParser.HelperElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangTmplParser#helperFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHelperFor(TLangTmplParser.HelperForContext ctx);
}