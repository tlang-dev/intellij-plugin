// Generated from dev/tlang/parser/TLangModel.g4 by ANTLR 4.13.0
package dev.tlang.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TLangModelParser}.
 */
public interface TLangModelListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TLangModelParser#modelBlock}.
	 * @param ctx the parse tree
	 */
	void enterModelBlock(TLangModelParser.ModelBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangModelParser#modelBlock}.
	 * @param ctx the parse tree
	 */
	void exitModelBlock(TLangModelParser.ModelBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangModelParser#modelContent}.
	 * @param ctx the parse tree
	 */
	void enterModelContent(TLangModelParser.ModelContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangModelParser#modelContent}.
	 * @param ctx the parse tree
	 */
	void exitModelContent(TLangModelParser.ModelContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangModelParser#modelSetEntity}.
	 * @param ctx the parse tree
	 */
	void enterModelSetEntity(TLangModelParser.ModelSetEntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangModelParser#modelSetEntity}.
	 * @param ctx the parse tree
	 */
	void exitModelSetEntity(TLangModelParser.ModelSetEntityContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangModelParser#modelSetAttribute}.
	 * @param ctx the parse tree
	 */
	void enterModelSetAttribute(TLangModelParser.ModelSetAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangModelParser#modelSetAttribute}.
	 * @param ctx the parse tree
	 */
	void exitModelSetAttribute(TLangModelParser.ModelSetAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangModelParser#modelSetValueType}.
	 * @param ctx the parse tree
	 */
	void enterModelSetValueType(TLangModelParser.ModelSetValueTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangModelParser#modelSetValueType}.
	 * @param ctx the parse tree
	 */
	void exitModelSetValueType(TLangModelParser.ModelSetValueTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangModelParser#modelSetType}.
	 * @param ctx the parse tree
	 */
	void enterModelSetType(TLangModelParser.ModelSetTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangModelParser#modelSetType}.
	 * @param ctx the parse tree
	 */
	void exitModelSetType(TLangModelParser.ModelSetTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangModelParser#modelSetArray}.
	 * @param ctx the parse tree
	 */
	void enterModelSetArray(TLangModelParser.ModelSetArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangModelParser#modelSetArray}.
	 * @param ctx the parse tree
	 */
	void exitModelSetArray(TLangModelParser.ModelSetArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangModelParser#modelSetFuncDef}.
	 * @param ctx the parse tree
	 */
	void enterModelSetFuncDef(TLangModelParser.ModelSetFuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangModelParser#modelSetFuncDef}.
	 * @param ctx the parse tree
	 */
	void exitModelSetFuncDef(TLangModelParser.ModelSetFuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangModelParser#modelSetRef}.
	 * @param ctx the parse tree
	 */
	void enterModelSetRef(TLangModelParser.ModelSetRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangModelParser#modelSetRef}.
	 * @param ctx the parse tree
	 */
	void exitModelSetRef(TLangModelParser.ModelSetRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangModelParser#modelSetRefCurrying}.
	 * @param ctx the parse tree
	 */
	void enterModelSetRefCurrying(TLangModelParser.ModelSetRefCurryingContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangModelParser#modelSetRefCurrying}.
	 * @param ctx the parse tree
	 */
	void exitModelSetRefCurrying(TLangModelParser.ModelSetRefCurryingContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangModelParser#modelSetRefValue}.
	 * @param ctx the parse tree
	 */
	void enterModelSetRefValue(TLangModelParser.ModelSetRefValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangModelParser#modelSetRefValue}.
	 * @param ctx the parse tree
	 */
	void exitModelSetRefValue(TLangModelParser.ModelSetRefValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangModelParser#modelSetImpl}.
	 * @param ctx the parse tree
	 */
	void enterModelSetImpl(TLangModelParser.ModelSetImplContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangModelParser#modelSetImpl}.
	 * @param ctx the parse tree
	 */
	void exitModelSetImpl(TLangModelParser.ModelSetImplContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangModelParser#modelSetImplArray}.
	 * @param ctx the parse tree
	 */
	void enterModelSetImplArray(TLangModelParser.ModelSetImplArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangModelParser#modelSetImplArray}.
	 * @param ctx the parse tree
	 */
	void exitModelSetImplArray(TLangModelParser.ModelSetImplArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangModelParser#assignVar}.
	 * @param ctx the parse tree
	 */
	void enterAssignVar(TLangModelParser.AssignVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangModelParser#assignVar}.
	 * @param ctx the parse tree
	 */
	void exitAssignVar(TLangModelParser.AssignVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangModelParser#valueType}.
	 * @param ctx the parse tree
	 */
	void enterValueType(TLangModelParser.ValueTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangModelParser#valueType}.
	 * @param ctx the parse tree
	 */
	void exitValueType(TLangModelParser.ValueTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangModelParser#objType}.
	 * @param ctx the parse tree
	 */
	void enterObjType(TLangModelParser.ObjTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangModelParser#objType}.
	 * @param ctx the parse tree
	 */
	void exitObjType(TLangModelParser.ObjTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangModelParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(TLangModelParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangModelParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(TLangModelParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangModelParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(TLangModelParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangModelParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(TLangModelParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangModelParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(TLangModelParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangModelParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(TLangModelParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangModelParser#complexValueType}.
	 * @param ctx the parse tree
	 */
	void enterComplexValueType(TLangModelParser.ComplexValueTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangModelParser#complexValueType}.
	 * @param ctx the parse tree
	 */
	void exitComplexValueType(TLangModelParser.ComplexValueTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangModelParser#primitiveValue}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveValue(TLangModelParser.PrimitiveValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangModelParser#primitiveValue}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveValue(TLangModelParser.PrimitiveValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangModelParser#lazyValue}.
	 * @param ctx the parse tree
	 */
	void enterLazyValue(TLangModelParser.LazyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangModelParser#lazyValue}.
	 * @param ctx the parse tree
	 */
	void exitLazyValue(TLangModelParser.LazyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangModelParser#stringValue}.
	 * @param ctx the parse tree
	 */
	void enterStringValue(TLangModelParser.StringValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangModelParser#stringValue}.
	 * @param ctx the parse tree
	 */
	void exitStringValue(TLangModelParser.StringValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangModelParser#numberValue}.
	 * @param ctx the parse tree
	 */
	void enterNumberValue(TLangModelParser.NumberValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangModelParser#numberValue}.
	 * @param ctx the parse tree
	 */
	void exitNumberValue(TLangModelParser.NumberValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangModelParser#textValue}.
	 * @param ctx the parse tree
	 */
	void enterTextValue(TLangModelParser.TextValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangModelParser#textValue}.
	 * @param ctx the parse tree
	 */
	void exitTextValue(TLangModelParser.TextValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangModelParser#boolValue}.
	 * @param ctx the parse tree
	 */
	void enterBoolValue(TLangModelParser.BoolValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangModelParser#boolValue}.
	 * @param ctx the parse tree
	 */
	void exitBoolValue(TLangModelParser.BoolValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangModelParser#arrayValue}.
	 * @param ctx the parse tree
	 */
	void enterArrayValue(TLangModelParser.ArrayValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangModelParser#arrayValue}.
	 * @param ctx the parse tree
	 */
	void exitArrayValue(TLangModelParser.ArrayValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangModelParser#callObj}.
	 * @param ctx the parse tree
	 */
	void enterCallObj(TLangModelParser.CallObjContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangModelParser#callObj}.
	 * @param ctx the parse tree
	 */
	void exitCallObj(TLangModelParser.CallObjContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangModelParser#callObjType}.
	 * @param ctx the parse tree
	 */
	void enterCallObjType(TLangModelParser.CallObjTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangModelParser#callObjType}.
	 * @param ctx the parse tree
	 */
	void exitCallObjType(TLangModelParser.CallObjTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangModelParser#callArray}.
	 * @param ctx the parse tree
	 */
	void enterCallArray(TLangModelParser.CallArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangModelParser#callArray}.
	 * @param ctx the parse tree
	 */
	void exitCallArray(TLangModelParser.CallArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangModelParser#callFunc}.
	 * @param ctx the parse tree
	 */
	void enterCallFunc(TLangModelParser.CallFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangModelParser#callFunc}.
	 * @param ctx the parse tree
	 */
	void exitCallFunc(TLangModelParser.CallFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangModelParser#curryParams}.
	 * @param ctx the parse tree
	 */
	void enterCurryParams(TLangModelParser.CurryParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangModelParser#curryParams}.
	 * @param ctx the parse tree
	 */
	void exitCurryParams(TLangModelParser.CurryParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangModelParser#setAttribute}.
	 * @param ctx the parse tree
	 */
	void enterSetAttribute(TLangModelParser.SetAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangModelParser#setAttribute}.
	 * @param ctx the parse tree
	 */
	void exitSetAttribute(TLangModelParser.SetAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangModelParser#callVariable}.
	 * @param ctx the parse tree
	 */
	void enterCallVariable(TLangModelParser.CallVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangModelParser#callVariable}.
	 * @param ctx the parse tree
	 */
	void exitCallVariable(TLangModelParser.CallVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangModelParser#entityValue}.
	 * @param ctx the parse tree
	 */
	void enterEntityValue(TLangModelParser.EntityValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangModelParser#entityValue}.
	 * @param ctx the parse tree
	 */
	void exitEntityValue(TLangModelParser.EntityValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangModelParser#impl}.
	 * @param ctx the parse tree
	 */
	void enterImpl(TLangModelParser.ImplContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangModelParser#impl}.
	 * @param ctx the parse tree
	 */
	void exitImpl(TLangModelParser.ImplContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangModelParser#multiValue}.
	 * @param ctx the parse tree
	 */
	void enterMultiValue(TLangModelParser.MultiValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangModelParser#multiValue}.
	 * @param ctx the parse tree
	 */
	void exitMultiValue(TLangModelParser.MultiValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangModelParser#complexAttribute}.
	 * @param ctx the parse tree
	 */
	void enterComplexAttribute(TLangModelParser.ComplexAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangModelParser#complexAttribute}.
	 * @param ctx the parse tree
	 */
	void exitComplexAttribute(TLangModelParser.ComplexAttributeContext ctx);
}