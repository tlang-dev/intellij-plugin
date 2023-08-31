// Generated from dev/tlang/parser/TLangCommon.g4 by ANTLR 4.13.0
package dev.tlang.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TLangCommonParser}.
 */
public interface TLangCommonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TLangCommonParser#assignVar}.
	 * @param ctx the parse tree
	 */
	void enterAssignVar(TLangCommonParser.AssignVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangCommonParser#assignVar}.
	 * @param ctx the parse tree
	 */
	void exitAssignVar(TLangCommonParser.AssignVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangCommonParser#valueType}.
	 * @param ctx the parse tree
	 */
	void enterValueType(TLangCommonParser.ValueTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangCommonParser#valueType}.
	 * @param ctx the parse tree
	 */
	void exitValueType(TLangCommonParser.ValueTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangCommonParser#objType}.
	 * @param ctx the parse tree
	 */
	void enterObjType(TLangCommonParser.ObjTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangCommonParser#objType}.
	 * @param ctx the parse tree
	 */
	void exitObjType(TLangCommonParser.ObjTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangCommonParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(TLangCommonParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangCommonParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(TLangCommonParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangCommonParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(TLangCommonParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangCommonParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(TLangCommonParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangCommonParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(TLangCommonParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangCommonParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(TLangCommonParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangCommonParser#complexValueType}.
	 * @param ctx the parse tree
	 */
	void enterComplexValueType(TLangCommonParser.ComplexValueTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangCommonParser#complexValueType}.
	 * @param ctx the parse tree
	 */
	void exitComplexValueType(TLangCommonParser.ComplexValueTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangCommonParser#primitiveValue}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveValue(TLangCommonParser.PrimitiveValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangCommonParser#primitiveValue}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveValue(TLangCommonParser.PrimitiveValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangCommonParser#lazyValue}.
	 * @param ctx the parse tree
	 */
	void enterLazyValue(TLangCommonParser.LazyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangCommonParser#lazyValue}.
	 * @param ctx the parse tree
	 */
	void exitLazyValue(TLangCommonParser.LazyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangCommonParser#stringValue}.
	 * @param ctx the parse tree
	 */
	void enterStringValue(TLangCommonParser.StringValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangCommonParser#stringValue}.
	 * @param ctx the parse tree
	 */
	void exitStringValue(TLangCommonParser.StringValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangCommonParser#numberValue}.
	 * @param ctx the parse tree
	 */
	void enterNumberValue(TLangCommonParser.NumberValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangCommonParser#numberValue}.
	 * @param ctx the parse tree
	 */
	void exitNumberValue(TLangCommonParser.NumberValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangCommonParser#textValue}.
	 * @param ctx the parse tree
	 */
	void enterTextValue(TLangCommonParser.TextValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangCommonParser#textValue}.
	 * @param ctx the parse tree
	 */
	void exitTextValue(TLangCommonParser.TextValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangCommonParser#boolValue}.
	 * @param ctx the parse tree
	 */
	void enterBoolValue(TLangCommonParser.BoolValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangCommonParser#boolValue}.
	 * @param ctx the parse tree
	 */
	void exitBoolValue(TLangCommonParser.BoolValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangCommonParser#arrayValue}.
	 * @param ctx the parse tree
	 */
	void enterArrayValue(TLangCommonParser.ArrayValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangCommonParser#arrayValue}.
	 * @param ctx the parse tree
	 */
	void exitArrayValue(TLangCommonParser.ArrayValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangCommonParser#callObj}.
	 * @param ctx the parse tree
	 */
	void enterCallObj(TLangCommonParser.CallObjContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangCommonParser#callObj}.
	 * @param ctx the parse tree
	 */
	void exitCallObj(TLangCommonParser.CallObjContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangCommonParser#callObjType}.
	 * @param ctx the parse tree
	 */
	void enterCallObjType(TLangCommonParser.CallObjTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangCommonParser#callObjType}.
	 * @param ctx the parse tree
	 */
	void exitCallObjType(TLangCommonParser.CallObjTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangCommonParser#callArray}.
	 * @param ctx the parse tree
	 */
	void enterCallArray(TLangCommonParser.CallArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangCommonParser#callArray}.
	 * @param ctx the parse tree
	 */
	void exitCallArray(TLangCommonParser.CallArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangCommonParser#callFunc}.
	 * @param ctx the parse tree
	 */
	void enterCallFunc(TLangCommonParser.CallFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangCommonParser#callFunc}.
	 * @param ctx the parse tree
	 */
	void exitCallFunc(TLangCommonParser.CallFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangCommonParser#curryParams}.
	 * @param ctx the parse tree
	 */
	void enterCurryParams(TLangCommonParser.CurryParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangCommonParser#curryParams}.
	 * @param ctx the parse tree
	 */
	void exitCurryParams(TLangCommonParser.CurryParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangCommonParser#setAttribute}.
	 * @param ctx the parse tree
	 */
	void enterSetAttribute(TLangCommonParser.SetAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangCommonParser#setAttribute}.
	 * @param ctx the parse tree
	 */
	void exitSetAttribute(TLangCommonParser.SetAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangCommonParser#callVariable}.
	 * @param ctx the parse tree
	 */
	void enterCallVariable(TLangCommonParser.CallVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangCommonParser#callVariable}.
	 * @param ctx the parse tree
	 */
	void exitCallVariable(TLangCommonParser.CallVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangCommonParser#entityValue}.
	 * @param ctx the parse tree
	 */
	void enterEntityValue(TLangCommonParser.EntityValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangCommonParser#entityValue}.
	 * @param ctx the parse tree
	 */
	void exitEntityValue(TLangCommonParser.EntityValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangCommonParser#impl}.
	 * @param ctx the parse tree
	 */
	void enterImpl(TLangCommonParser.ImplContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangCommonParser#impl}.
	 * @param ctx the parse tree
	 */
	void exitImpl(TLangCommonParser.ImplContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangCommonParser#multiValue}.
	 * @param ctx the parse tree
	 */
	void enterMultiValue(TLangCommonParser.MultiValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangCommonParser#multiValue}.
	 * @param ctx the parse tree
	 */
	void exitMultiValue(TLangCommonParser.MultiValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangCommonParser#complexAttribute}.
	 * @param ctx the parse tree
	 */
	void enterComplexAttribute(TLangCommonParser.ComplexAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangCommonParser#complexAttribute}.
	 * @param ctx the parse tree
	 */
	void exitComplexAttribute(TLangCommonParser.ComplexAttributeContext ctx);
}