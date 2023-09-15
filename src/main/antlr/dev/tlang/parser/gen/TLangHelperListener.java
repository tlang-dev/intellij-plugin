// Generated from /home/joel/EventManager/intellij-lsp-client/intellij-lsp-client/src/main/antlr/dev/tlang/parser/TLangHelper.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TLangHelperParser}.
 */
public interface TLangHelperListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TLangHelperParser#helperBlock}.
	 * @param ctx the parse tree
	 */
	void enterHelperBlock(TLangHelperParser.HelperBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangHelperParser#helperBlock}.
	 * @param ctx the parse tree
	 */
	void exitHelperBlock(TLangHelperParser.HelperBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangHelperParser#helperFunc}.
	 * @param ctx the parse tree
	 */
	void enterHelperFunc(TLangHelperParser.HelperFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangHelperParser#helperFunc}.
	 * @param ctx the parse tree
	 */
	void exitHelperFunc(TLangHelperParser.HelperFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangHelperParser#helperCurrying}.
	 * @param ctx the parse tree
	 */
	void enterHelperCurrying(TLangHelperParser.HelperCurryingContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangHelperParser#helperCurrying}.
	 * @param ctx the parse tree
	 */
	void exitHelperCurrying(TLangHelperParser.HelperCurryingContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangHelperParser#helperParam}.
	 * @param ctx the parse tree
	 */
	void enterHelperParam(TLangHelperParser.HelperParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangHelperParser#helperParam}.
	 * @param ctx the parse tree
	 */
	void exitHelperParam(TLangHelperParser.HelperParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangHelperParser#helperParamType}.
	 * @param ctx the parse tree
	 */
	void enterHelperParamType(TLangHelperParser.HelperParamTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangHelperParser#helperParamType}.
	 * @param ctx the parse tree
	 */
	void exitHelperParamType(TLangHelperParser.HelperParamTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangHelperParser#helperFuncType}.
	 * @param ctx the parse tree
	 */
	void enterHelperFuncType(TLangHelperParser.HelperFuncTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangHelperParser#helperFuncType}.
	 * @param ctx the parse tree
	 */
	void exitHelperFuncType(TLangHelperParser.HelperFuncTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangHelperParser#helperContent}.
	 * @param ctx the parse tree
	 */
	void enterHelperContent(TLangHelperParser.HelperContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangHelperParser#helperContent}.
	 * @param ctx the parse tree
	 */
	void exitHelperContent(TLangHelperParser.HelperContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangHelperParser#helperStatement}.
	 * @param ctx the parse tree
	 */
	void enterHelperStatement(TLangHelperParser.HelperStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangHelperParser#helperStatement}.
	 * @param ctx the parse tree
	 */
	void exitHelperStatement(TLangHelperParser.HelperStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangHelperParser#helperIf}.
	 * @param ctx the parse tree
	 */
	void enterHelperIf(TLangHelperParser.HelperIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangHelperParser#helperIf}.
	 * @param ctx the parse tree
	 */
	void exitHelperIf(TLangHelperParser.HelperIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangHelperParser#helperElse}.
	 * @param ctx the parse tree
	 */
	void enterHelperElse(TLangHelperParser.HelperElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangHelperParser#helperElse}.
	 * @param ctx the parse tree
	 */
	void exitHelperElse(TLangHelperParser.HelperElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangHelperParser#helperFor}.
	 * @param ctx the parse tree
	 */
	void enterHelperFor(TLangHelperParser.HelperForContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangHelperParser#helperFor}.
	 * @param ctx the parse tree
	 */
	void exitHelperFor(TLangHelperParser.HelperForContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangHelperParser#assignVar}.
	 * @param ctx the parse tree
	 */
	void enterAssignVar(TLangHelperParser.AssignVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangHelperParser#assignVar}.
	 * @param ctx the parse tree
	 */
	void exitAssignVar(TLangHelperParser.AssignVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangHelperParser#valueType}.
	 * @param ctx the parse tree
	 */
	void enterValueType(TLangHelperParser.ValueTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangHelperParser#valueType}.
	 * @param ctx the parse tree
	 */
	void exitValueType(TLangHelperParser.ValueTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangHelperParser#objType}.
	 * @param ctx the parse tree
	 */
	void enterObjType(TLangHelperParser.ObjTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangHelperParser#objType}.
	 * @param ctx the parse tree
	 */
	void exitObjType(TLangHelperParser.ObjTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangHelperParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(TLangHelperParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangHelperParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(TLangHelperParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangHelperParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(TLangHelperParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangHelperParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(TLangHelperParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangHelperParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(TLangHelperParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangHelperParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(TLangHelperParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangHelperParser#complexValueType}.
	 * @param ctx the parse tree
	 */
	void enterComplexValueType(TLangHelperParser.ComplexValueTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangHelperParser#complexValueType}.
	 * @param ctx the parse tree
	 */
	void exitComplexValueType(TLangHelperParser.ComplexValueTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangHelperParser#primitiveValue}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveValue(TLangHelperParser.PrimitiveValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangHelperParser#primitiveValue}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveValue(TLangHelperParser.PrimitiveValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangHelperParser#lazyValue}.
	 * @param ctx the parse tree
	 */
	void enterLazyValue(TLangHelperParser.LazyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangHelperParser#lazyValue}.
	 * @param ctx the parse tree
	 */
	void exitLazyValue(TLangHelperParser.LazyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangHelperParser#stringValue}.
	 * @param ctx the parse tree
	 */
	void enterStringValue(TLangHelperParser.StringValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangHelperParser#stringValue}.
	 * @param ctx the parse tree
	 */
	void exitStringValue(TLangHelperParser.StringValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangHelperParser#numberValue}.
	 * @param ctx the parse tree
	 */
	void enterNumberValue(TLangHelperParser.NumberValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangHelperParser#numberValue}.
	 * @param ctx the parse tree
	 */
	void exitNumberValue(TLangHelperParser.NumberValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangHelperParser#textValue}.
	 * @param ctx the parse tree
	 */
	void enterTextValue(TLangHelperParser.TextValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangHelperParser#textValue}.
	 * @param ctx the parse tree
	 */
	void exitTextValue(TLangHelperParser.TextValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangHelperParser#boolValue}.
	 * @param ctx the parse tree
	 */
	void enterBoolValue(TLangHelperParser.BoolValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangHelperParser#boolValue}.
	 * @param ctx the parse tree
	 */
	void exitBoolValue(TLangHelperParser.BoolValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangHelperParser#arrayValue}.
	 * @param ctx the parse tree
	 */
	void enterArrayValue(TLangHelperParser.ArrayValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangHelperParser#arrayValue}.
	 * @param ctx the parse tree
	 */
	void exitArrayValue(TLangHelperParser.ArrayValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangHelperParser#callObj}.
	 * @param ctx the parse tree
	 */
	void enterCallObj(TLangHelperParser.CallObjContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangHelperParser#callObj}.
	 * @param ctx the parse tree
	 */
	void exitCallObj(TLangHelperParser.CallObjContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangHelperParser#callObjType}.
	 * @param ctx the parse tree
	 */
	void enterCallObjType(TLangHelperParser.CallObjTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangHelperParser#callObjType}.
	 * @param ctx the parse tree
	 */
	void exitCallObjType(TLangHelperParser.CallObjTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangHelperParser#callArray}.
	 * @param ctx the parse tree
	 */
	void enterCallArray(TLangHelperParser.CallArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangHelperParser#callArray}.
	 * @param ctx the parse tree
	 */
	void exitCallArray(TLangHelperParser.CallArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangHelperParser#callFunc}.
	 * @param ctx the parse tree
	 */
	void enterCallFunc(TLangHelperParser.CallFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangHelperParser#callFunc}.
	 * @param ctx the parse tree
	 */
	void exitCallFunc(TLangHelperParser.CallFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangHelperParser#curryParams}.
	 * @param ctx the parse tree
	 */
	void enterCurryParams(TLangHelperParser.CurryParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangHelperParser#curryParams}.
	 * @param ctx the parse tree
	 */
	void exitCurryParams(TLangHelperParser.CurryParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangHelperParser#setAttribute}.
	 * @param ctx the parse tree
	 */
	void enterSetAttribute(TLangHelperParser.SetAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangHelperParser#setAttribute}.
	 * @param ctx the parse tree
	 */
	void exitSetAttribute(TLangHelperParser.SetAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangHelperParser#callVariable}.
	 * @param ctx the parse tree
	 */
	void enterCallVariable(TLangHelperParser.CallVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangHelperParser#callVariable}.
	 * @param ctx the parse tree
	 */
	void exitCallVariable(TLangHelperParser.CallVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangHelperParser#entityValue}.
	 * @param ctx the parse tree
	 */
	void enterEntityValue(TLangHelperParser.EntityValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangHelperParser#entityValue}.
	 * @param ctx the parse tree
	 */
	void exitEntityValue(TLangHelperParser.EntityValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangHelperParser#impl}.
	 * @param ctx the parse tree
	 */
	void enterImpl(TLangHelperParser.ImplContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangHelperParser#impl}.
	 * @param ctx the parse tree
	 */
	void exitImpl(TLangHelperParser.ImplContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangHelperParser#multiValue}.
	 * @param ctx the parse tree
	 */
	void enterMultiValue(TLangHelperParser.MultiValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangHelperParser#multiValue}.
	 * @param ctx the parse tree
	 */
	void exitMultiValue(TLangHelperParser.MultiValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangHelperParser#complexAttribute}.
	 * @param ctx the parse tree
	 */
	void enterComplexAttribute(TLangHelperParser.ComplexAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangHelperParser#complexAttribute}.
	 * @param ctx the parse tree
	 */
	void exitComplexAttribute(TLangHelperParser.ComplexAttributeContext ctx);
}