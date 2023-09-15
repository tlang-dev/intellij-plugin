// Generated from /home/joel/EventManager/intellij-lsp-client/intellij-lsp-client/src/main/antlr/dev/tlang/parser/TLangHelper.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TLangHelperParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TLangHelperVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TLangHelperParser#helperBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHelperBlock(TLangHelperParser.HelperBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangHelperParser#helperFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHelperFunc(TLangHelperParser.HelperFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangHelperParser#helperCurrying}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHelperCurrying(TLangHelperParser.HelperCurryingContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangHelperParser#helperParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHelperParam(TLangHelperParser.HelperParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangHelperParser#helperParamType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHelperParamType(TLangHelperParser.HelperParamTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangHelperParser#helperFuncType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHelperFuncType(TLangHelperParser.HelperFuncTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangHelperParser#helperContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHelperContent(TLangHelperParser.HelperContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangHelperParser#helperStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHelperStatement(TLangHelperParser.HelperStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangHelperParser#helperIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHelperIf(TLangHelperParser.HelperIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangHelperParser#helperElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHelperElse(TLangHelperParser.HelperElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangHelperParser#helperFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHelperFor(TLangHelperParser.HelperForContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangHelperParser#assignVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignVar(TLangHelperParser.AssignVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangHelperParser#valueType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueType(TLangHelperParser.ValueTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangHelperParser#objType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjType(TLangHelperParser.ObjTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangHelperParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(TLangHelperParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangHelperParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(TLangHelperParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangHelperParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(TLangHelperParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangHelperParser#complexValueType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexValueType(TLangHelperParser.ComplexValueTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangHelperParser#primitiveValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveValue(TLangHelperParser.PrimitiveValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangHelperParser#lazyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLazyValue(TLangHelperParser.LazyValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangHelperParser#stringValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringValue(TLangHelperParser.StringValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangHelperParser#numberValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberValue(TLangHelperParser.NumberValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangHelperParser#textValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextValue(TLangHelperParser.TextValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangHelperParser#boolValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolValue(TLangHelperParser.BoolValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangHelperParser#arrayValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayValue(TLangHelperParser.ArrayValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangHelperParser#callObj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallObj(TLangHelperParser.CallObjContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangHelperParser#callObjType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallObjType(TLangHelperParser.CallObjTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangHelperParser#callArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallArray(TLangHelperParser.CallArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangHelperParser#callFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFunc(TLangHelperParser.CallFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangHelperParser#curryParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurryParams(TLangHelperParser.CurryParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangHelperParser#setAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetAttribute(TLangHelperParser.SetAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangHelperParser#callVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallVariable(TLangHelperParser.CallVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangHelperParser#entityValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntityValue(TLangHelperParser.EntityValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangHelperParser#impl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpl(TLangHelperParser.ImplContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangHelperParser#multiValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiValue(TLangHelperParser.MultiValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TLangHelperParser#complexAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexAttribute(TLangHelperParser.ComplexAttributeContext ctx);
}