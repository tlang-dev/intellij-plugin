// Generated from dev/tlang/parser/TLang.g4 by ANTLR 4.13.0
package dev.tlang.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TLangParser}.
 */
public interface TLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TLangParser#domainModel}.
	 * @param ctx the parse tree
	 */
	void enterDomainModel(TLangParser.DomainModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#domainModel}.
	 * @param ctx the parse tree
	 */
	void exitDomainModel(TLangParser.DomainModelContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#domainHeader}.
	 * @param ctx the parse tree
	 */
	void enterDomainHeader(TLangParser.DomainHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#domainHeader}.
	 * @param ctx the parse tree
	 */
	void exitDomainHeader(TLangParser.DomainHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#domainUse}.
	 * @param ctx the parse tree
	 */
	void enterDomainUse(TLangParser.DomainUseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#domainUse}.
	 * @param ctx the parse tree
	 */
	void exitDomainUse(TLangParser.DomainUseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#domainExpose}.
	 * @param ctx the parse tree
	 */
	void enterDomainExpose(TLangParser.DomainExposeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#domainExpose}.
	 * @param ctx the parse tree
	 */
	void exitDomainExpose(TLangParser.DomainExposeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#domainBlock}.
	 * @param ctx the parse tree
	 */
	void enterDomainBlock(TLangParser.DomainBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#domainBlock}.
	 * @param ctx the parse tree
	 */
	void exitDomainBlock(TLangParser.DomainBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#modelBlock}.
	 * @param ctx the parse tree
	 */
	void enterModelBlock(TLangParser.ModelBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#modelBlock}.
	 * @param ctx the parse tree
	 */
	void exitModelBlock(TLangParser.ModelBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#modelContent}.
	 * @param ctx the parse tree
	 */
	void enterModelContent(TLangParser.ModelContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#modelContent}.
	 * @param ctx the parse tree
	 */
	void exitModelContent(TLangParser.ModelContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#modelSetEntity}.
	 * @param ctx the parse tree
	 */
	void enterModelSetEntity(TLangParser.ModelSetEntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#modelSetEntity}.
	 * @param ctx the parse tree
	 */
	void exitModelSetEntity(TLangParser.ModelSetEntityContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#modelSetAttribute}.
	 * @param ctx the parse tree
	 */
	void enterModelSetAttribute(TLangParser.ModelSetAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#modelSetAttribute}.
	 * @param ctx the parse tree
	 */
	void exitModelSetAttribute(TLangParser.ModelSetAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#modelSetValueType}.
	 * @param ctx the parse tree
	 */
	void enterModelSetValueType(TLangParser.ModelSetValueTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#modelSetValueType}.
	 * @param ctx the parse tree
	 */
	void exitModelSetValueType(TLangParser.ModelSetValueTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#modelSetType}.
	 * @param ctx the parse tree
	 */
	void enterModelSetType(TLangParser.ModelSetTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#modelSetType}.
	 * @param ctx the parse tree
	 */
	void exitModelSetType(TLangParser.ModelSetTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#modelSetArray}.
	 * @param ctx the parse tree
	 */
	void enterModelSetArray(TLangParser.ModelSetArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#modelSetArray}.
	 * @param ctx the parse tree
	 */
	void exitModelSetArray(TLangParser.ModelSetArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#modelSetFuncDef}.
	 * @param ctx the parse tree
	 */
	void enterModelSetFuncDef(TLangParser.ModelSetFuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#modelSetFuncDef}.
	 * @param ctx the parse tree
	 */
	void exitModelSetFuncDef(TLangParser.ModelSetFuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#modelSetRef}.
	 * @param ctx the parse tree
	 */
	void enterModelSetRef(TLangParser.ModelSetRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#modelSetRef}.
	 * @param ctx the parse tree
	 */
	void exitModelSetRef(TLangParser.ModelSetRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#modelSetRefCurrying}.
	 * @param ctx the parse tree
	 */
	void enterModelSetRefCurrying(TLangParser.ModelSetRefCurryingContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#modelSetRefCurrying}.
	 * @param ctx the parse tree
	 */
	void exitModelSetRefCurrying(TLangParser.ModelSetRefCurryingContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#modelSetRefValue}.
	 * @param ctx the parse tree
	 */
	void enterModelSetRefValue(TLangParser.ModelSetRefValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#modelSetRefValue}.
	 * @param ctx the parse tree
	 */
	void exitModelSetRefValue(TLangParser.ModelSetRefValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#modelSetImpl}.
	 * @param ctx the parse tree
	 */
	void enterModelSetImpl(TLangParser.ModelSetImplContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#modelSetImpl}.
	 * @param ctx the parse tree
	 */
	void exitModelSetImpl(TLangParser.ModelSetImplContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#modelSetImplArray}.
	 * @param ctx the parse tree
	 */
	void enterModelSetImplArray(TLangParser.ModelSetImplArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#modelSetImplArray}.
	 * @param ctx the parse tree
	 */
	void exitModelSetImplArray(TLangParser.ModelSetImplArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#assignVar}.
	 * @param ctx the parse tree
	 */
	void enterAssignVar(TLangParser.AssignVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#assignVar}.
	 * @param ctx the parse tree
	 */
	void exitAssignVar(TLangParser.AssignVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#valueType}.
	 * @param ctx the parse tree
	 */
	void enterValueType(TLangParser.ValueTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#valueType}.
	 * @param ctx the parse tree
	 */
	void exitValueType(TLangParser.ValueTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#objType}.
	 * @param ctx the parse tree
	 */
	void enterObjType(TLangParser.ObjTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#objType}.
	 * @param ctx the parse tree
	 */
	void exitObjType(TLangParser.ObjTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(TLangParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(TLangParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(TLangParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(TLangParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(TLangParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(TLangParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#complexValueType}.
	 * @param ctx the parse tree
	 */
	void enterComplexValueType(TLangParser.ComplexValueTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#complexValueType}.
	 * @param ctx the parse tree
	 */
	void exitComplexValueType(TLangParser.ComplexValueTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#primitiveValue}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveValue(TLangParser.PrimitiveValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#primitiveValue}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveValue(TLangParser.PrimitiveValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#lazyValue}.
	 * @param ctx the parse tree
	 */
	void enterLazyValue(TLangParser.LazyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#lazyValue}.
	 * @param ctx the parse tree
	 */
	void exitLazyValue(TLangParser.LazyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#stringValue}.
	 * @param ctx the parse tree
	 */
	void enterStringValue(TLangParser.StringValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#stringValue}.
	 * @param ctx the parse tree
	 */
	void exitStringValue(TLangParser.StringValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#numberValue}.
	 * @param ctx the parse tree
	 */
	void enterNumberValue(TLangParser.NumberValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#numberValue}.
	 * @param ctx the parse tree
	 */
	void exitNumberValue(TLangParser.NumberValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#textValue}.
	 * @param ctx the parse tree
	 */
	void enterTextValue(TLangParser.TextValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#textValue}.
	 * @param ctx the parse tree
	 */
	void exitTextValue(TLangParser.TextValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#boolValue}.
	 * @param ctx the parse tree
	 */
	void enterBoolValue(TLangParser.BoolValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#boolValue}.
	 * @param ctx the parse tree
	 */
	void exitBoolValue(TLangParser.BoolValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#arrayValue}.
	 * @param ctx the parse tree
	 */
	void enterArrayValue(TLangParser.ArrayValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#arrayValue}.
	 * @param ctx the parse tree
	 */
	void exitArrayValue(TLangParser.ArrayValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#callObj}.
	 * @param ctx the parse tree
	 */
	void enterCallObj(TLangParser.CallObjContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#callObj}.
	 * @param ctx the parse tree
	 */
	void exitCallObj(TLangParser.CallObjContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#callObjType}.
	 * @param ctx the parse tree
	 */
	void enterCallObjType(TLangParser.CallObjTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#callObjType}.
	 * @param ctx the parse tree
	 */
	void exitCallObjType(TLangParser.CallObjTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#callArray}.
	 * @param ctx the parse tree
	 */
	void enterCallArray(TLangParser.CallArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#callArray}.
	 * @param ctx the parse tree
	 */
	void exitCallArray(TLangParser.CallArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#callFunc}.
	 * @param ctx the parse tree
	 */
	void enterCallFunc(TLangParser.CallFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#callFunc}.
	 * @param ctx the parse tree
	 */
	void exitCallFunc(TLangParser.CallFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#curryParams}.
	 * @param ctx the parse tree
	 */
	void enterCurryParams(TLangParser.CurryParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#curryParams}.
	 * @param ctx the parse tree
	 */
	void exitCurryParams(TLangParser.CurryParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#setAttribute}.
	 * @param ctx the parse tree
	 */
	void enterSetAttribute(TLangParser.SetAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#setAttribute}.
	 * @param ctx the parse tree
	 */
	void exitSetAttribute(TLangParser.SetAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#callVariable}.
	 * @param ctx the parse tree
	 */
	void enterCallVariable(TLangParser.CallVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#callVariable}.
	 * @param ctx the parse tree
	 */
	void exitCallVariable(TLangParser.CallVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#entityValue}.
	 * @param ctx the parse tree
	 */
	void enterEntityValue(TLangParser.EntityValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#entityValue}.
	 * @param ctx the parse tree
	 */
	void exitEntityValue(TLangParser.EntityValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#impl}.
	 * @param ctx the parse tree
	 */
	void enterImpl(TLangParser.ImplContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#impl}.
	 * @param ctx the parse tree
	 */
	void exitImpl(TLangParser.ImplContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#multiValue}.
	 * @param ctx the parse tree
	 */
	void enterMultiValue(TLangParser.MultiValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#multiValue}.
	 * @param ctx the parse tree
	 */
	void exitMultiValue(TLangParser.MultiValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#complexAttribute}.
	 * @param ctx the parse tree
	 */
	void enterComplexAttribute(TLangParser.ComplexAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#complexAttribute}.
	 * @param ctx the parse tree
	 */
	void exitComplexAttribute(TLangParser.ComplexAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#helperBlock}.
	 * @param ctx the parse tree
	 */
	void enterHelperBlock(TLangParser.HelperBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#helperBlock}.
	 * @param ctx the parse tree
	 */
	void exitHelperBlock(TLangParser.HelperBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#helperFunc}.
	 * @param ctx the parse tree
	 */
	void enterHelperFunc(TLangParser.HelperFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#helperFunc}.
	 * @param ctx the parse tree
	 */
	void exitHelperFunc(TLangParser.HelperFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#helperCurrying}.
	 * @param ctx the parse tree
	 */
	void enterHelperCurrying(TLangParser.HelperCurryingContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#helperCurrying}.
	 * @param ctx the parse tree
	 */
	void exitHelperCurrying(TLangParser.HelperCurryingContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#helperParam}.
	 * @param ctx the parse tree
	 */
	void enterHelperParam(TLangParser.HelperParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#helperParam}.
	 * @param ctx the parse tree
	 */
	void exitHelperParam(TLangParser.HelperParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#helperParamType}.
	 * @param ctx the parse tree
	 */
	void enterHelperParamType(TLangParser.HelperParamTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#helperParamType}.
	 * @param ctx the parse tree
	 */
	void exitHelperParamType(TLangParser.HelperParamTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#helperFuncType}.
	 * @param ctx the parse tree
	 */
	void enterHelperFuncType(TLangParser.HelperFuncTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#helperFuncType}.
	 * @param ctx the parse tree
	 */
	void exitHelperFuncType(TLangParser.HelperFuncTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#helperContent}.
	 * @param ctx the parse tree
	 */
	void enterHelperContent(TLangParser.HelperContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#helperContent}.
	 * @param ctx the parse tree
	 */
	void exitHelperContent(TLangParser.HelperContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#helperStatement}.
	 * @param ctx the parse tree
	 */
	void enterHelperStatement(TLangParser.HelperStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#helperStatement}.
	 * @param ctx the parse tree
	 */
	void exitHelperStatement(TLangParser.HelperStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#helperIf}.
	 * @param ctx the parse tree
	 */
	void enterHelperIf(TLangParser.HelperIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#helperIf}.
	 * @param ctx the parse tree
	 */
	void exitHelperIf(TLangParser.HelperIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#helperElse}.
	 * @param ctx the parse tree
	 */
	void enterHelperElse(TLangParser.HelperElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#helperElse}.
	 * @param ctx the parse tree
	 */
	void exitHelperElse(TLangParser.HelperElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#helperFor}.
	 * @param ctx the parse tree
	 */
	void enterHelperFor(TLangParser.HelperForContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#helperFor}.
	 * @param ctx the parse tree
	 */
	void exitHelperFor(TLangParser.HelperForContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplBlock}.
	 * @param ctx the parse tree
	 */
	void enterTmplBlock(TLangParser.TmplBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplBlock}.
	 * @param ctx the parse tree
	 */
	void exitTmplBlock(TLangParser.TmplBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplBlockContentType}.
	 * @param ctx the parse tree
	 */
	void enterTmplBlockContentType(TLangParser.TmplBlockContentTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplBlockContentType}.
	 * @param ctx the parse tree
	 */
	void exitTmplBlockContentType(TLangParser.TmplBlockContentTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplFullBlock}.
	 * @param ctx the parse tree
	 */
	void enterTmplFullBlock(TLangParser.TmplFullBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplFullBlock}.
	 * @param ctx the parse tree
	 */
	void exitTmplFullBlock(TLangParser.TmplFullBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplSpecialisedBlock}.
	 * @param ctx the parse tree
	 */
	void enterTmplSpecialisedBlock(TLangParser.TmplSpecialisedBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplSpecialisedBlock}.
	 * @param ctx the parse tree
	 */
	void exitTmplSpecialisedBlock(TLangParser.TmplSpecialisedBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplSpecialisedContent}.
	 * @param ctx the parse tree
	 */
	void enterTmplSpecialisedContent(TLangParser.TmplSpecialisedContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplSpecialisedContent}.
	 * @param ctx the parse tree
	 */
	void exitTmplSpecialisedContent(TLangParser.TmplSpecialisedContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplContent}.
	 * @param ctx the parse tree
	 */
	void enterTmplContent(TLangParser.TmplContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplContent}.
	 * @param ctx the parse tree
	 */
	void exitTmplContent(TLangParser.TmplContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplPkg}.
	 * @param ctx the parse tree
	 */
	void enterTmplPkg(TLangParser.TmplPkgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplPkg}.
	 * @param ctx the parse tree
	 */
	void exitTmplPkg(TLangParser.TmplPkgContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplUse}.
	 * @param ctx the parse tree
	 */
	void enterTmplUse(TLangParser.TmplUseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplUse}.
	 * @param ctx the parse tree
	 */
	void exitTmplUse(TLangParser.TmplUseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplAnnot}.
	 * @param ctx the parse tree
	 */
	void enterTmplAnnot(TLangParser.TmplAnnotContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplAnnot}.
	 * @param ctx the parse tree
	 */
	void exitTmplAnnot(TLangParser.TmplAnnotContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplAnnotParam}.
	 * @param ctx the parse tree
	 */
	void enterTmplAnnotParam(TLangParser.TmplAnnotParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplAnnotParam}.
	 * @param ctx the parse tree
	 */
	void exitTmplAnnotParam(TLangParser.TmplAnnotParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplProps}.
	 * @param ctx the parse tree
	 */
	void enterTmplProps(TLangParser.TmplPropsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplProps}.
	 * @param ctx the parse tree
	 */
	void exitTmplProps(TLangParser.TmplPropsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplImpl}.
	 * @param ctx the parse tree
	 */
	void enterTmplImpl(TLangParser.TmplImplContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplImpl}.
	 * @param ctx the parse tree
	 */
	void exitTmplImpl(TLangParser.TmplImplContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplFunc}.
	 * @param ctx the parse tree
	 */
	void enterTmplFunc(TLangParser.TmplFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplFunc}.
	 * @param ctx the parse tree
	 */
	void exitTmplFunc(TLangParser.TmplFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplCurrying}.
	 * @param ctx the parse tree
	 */
	void enterTmplCurrying(TLangParser.TmplCurryingContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplCurrying}.
	 * @param ctx the parse tree
	 */
	void exitTmplCurrying(TLangParser.TmplCurryingContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplCurryingParam}.
	 * @param ctx the parse tree
	 */
	void enterTmplCurryingParam(TLangParser.TmplCurryingParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplCurryingParam}.
	 * @param ctx the parse tree
	 */
	void exitTmplCurryingParam(TLangParser.TmplCurryingParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplParam}.
	 * @param ctx the parse tree
	 */
	void enterTmplParam(TLangParser.TmplParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplParam}.
	 * @param ctx the parse tree
	 */
	void exitTmplParam(TLangParser.TmplParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplType}.
	 * @param ctx the parse tree
	 */
	void enterTmplType(TLangParser.TmplTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplType}.
	 * @param ctx the parse tree
	 */
	void exitTmplType(TLangParser.TmplTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplGeneric}.
	 * @param ctx the parse tree
	 */
	void enterTmplGeneric(TLangParser.TmplGenericContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplGeneric}.
	 * @param ctx the parse tree
	 */
	void exitTmplGeneric(TLangParser.TmplGenericContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplExprContent}.
	 * @param ctx the parse tree
	 */
	void enterTmplExprContent(TLangParser.TmplExprContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplExprContent}.
	 * @param ctx the parse tree
	 */
	void exitTmplExprContent(TLangParser.TmplExprContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplExprBlock}.
	 * @param ctx the parse tree
	 */
	void enterTmplExprBlock(TLangParser.TmplExprBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplExprBlock}.
	 * @param ctx the parse tree
	 */
	void exitTmplExprBlock(TLangParser.TmplExprBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplExpression}.
	 * @param ctx the parse tree
	 */
	void enterTmplExpression(TLangParser.TmplExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplExpression}.
	 * @param ctx the parse tree
	 */
	void exitTmplExpression(TLangParser.TmplExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplIf}.
	 * @param ctx the parse tree
	 */
	void enterTmplIf(TLangParser.TmplIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplIf}.
	 * @param ctx the parse tree
	 */
	void exitTmplIf(TLangParser.TmplIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplElse}.
	 * @param ctx the parse tree
	 */
	void enterTmplElse(TLangParser.TmplElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplElse}.
	 * @param ctx the parse tree
	 */
	void exitTmplElse(TLangParser.TmplElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplFor}.
	 * @param ctx the parse tree
	 */
	void enterTmplFor(TLangParser.TmplForContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplFor}.
	 * @param ctx the parse tree
	 */
	void exitTmplFor(TLangParser.TmplForContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplWhile}.
	 * @param ctx the parse tree
	 */
	void enterTmplWhile(TLangParser.TmplWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplWhile}.
	 * @param ctx the parse tree
	 */
	void exitTmplWhile(TLangParser.TmplWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplDoWhile}.
	 * @param ctx the parse tree
	 */
	void enterTmplDoWhile(TLangParser.TmplDoWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplDoWhile}.
	 * @param ctx the parse tree
	 */
	void exitTmplDoWhile(TLangParser.TmplDoWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplAnonFunc}.
	 * @param ctx the parse tree
	 */
	void enterTmplAnonFunc(TLangParser.TmplAnonFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplAnonFunc}.
	 * @param ctx the parse tree
	 */
	void exitTmplAnonFunc(TLangParser.TmplAnonFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplVar}.
	 * @param ctx the parse tree
	 */
	void enterTmplVar(TLangParser.TmplVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplVar}.
	 * @param ctx the parse tree
	 */
	void exitTmplVar(TLangParser.TmplVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplOptionalValue}.
	 * @param ctx the parse tree
	 */
	void enterTmplOptionalValue(TLangParser.TmplOptionalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplOptionalValue}.
	 * @param ctx the parse tree
	 */
	void exitTmplOptionalValue(TLangParser.TmplOptionalValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplCallObj}.
	 * @param ctx the parse tree
	 */
	void enterTmplCallObj(TLangParser.TmplCallObjContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplCallObj}.
	 * @param ctx the parse tree
	 */
	void exitTmplCallObj(TLangParser.TmplCallObjContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplCallObjType}.
	 * @param ctx the parse tree
	 */
	void enterTmplCallObjType(TLangParser.TmplCallObjTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplCallObjType}.
	 * @param ctx the parse tree
	 */
	void exitTmplCallObjType(TLangParser.TmplCallObjTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplCallFunc}.
	 * @param ctx the parse tree
	 */
	void enterTmplCallFunc(TLangParser.TmplCallFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplCallFunc}.
	 * @param ctx the parse tree
	 */
	void exitTmplCallFunc(TLangParser.TmplCallFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplCurryParams}.
	 * @param ctx the parse tree
	 */
	void enterTmplCurryParams(TLangParser.TmplCurryParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplCurryParams}.
	 * @param ctx the parse tree
	 */
	void exitTmplCurryParams(TLangParser.TmplCurryParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplSetAttribute}.
	 * @param ctx the parse tree
	 */
	void enterTmplSetAttribute(TLangParser.TmplSetAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplSetAttribute}.
	 * @param ctx the parse tree
	 */
	void exitTmplSetAttribute(TLangParser.TmplSetAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplInclSetAttribute}.
	 * @param ctx the parse tree
	 */
	void enterTmplInclSetAttribute(TLangParser.TmplInclSetAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplInclSetAttribute}.
	 * @param ctx the parse tree
	 */
	void exitTmplInclSetAttribute(TLangParser.TmplInclSetAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplCallArray}.
	 * @param ctx the parse tree
	 */
	void enterTmplCallArray(TLangParser.TmplCallArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplCallArray}.
	 * @param ctx the parse tree
	 */
	void exitTmplCallArray(TLangParser.TmplCallArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplCallVariable}.
	 * @param ctx the parse tree
	 */
	void enterTmplCallVariable(TLangParser.TmplCallVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplCallVariable}.
	 * @param ctx the parse tree
	 */
	void exitTmplCallVariable(TLangParser.TmplCallVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplValueType}.
	 * @param ctx the parse tree
	 */
	void enterTmplValueType(TLangParser.TmplValueTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplValueType}.
	 * @param ctx the parse tree
	 */
	void exitTmplValueType(TLangParser.TmplValueTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplPrimitiveValue}.
	 * @param ctx the parse tree
	 */
	void enterTmplPrimitiveValue(TLangParser.TmplPrimitiveValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplPrimitiveValue}.
	 * @param ctx the parse tree
	 */
	void exitTmplPrimitiveValue(TLangParser.TmplPrimitiveValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplStringValue}.
	 * @param ctx the parse tree
	 */
	void enterTmplStringValue(TLangParser.TmplStringValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplStringValue}.
	 * @param ctx the parse tree
	 */
	void exitTmplStringValue(TLangParser.TmplStringValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplNumberValue}.
	 * @param ctx the parse tree
	 */
	void enterTmplNumberValue(TLangParser.TmplNumberValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplNumberValue}.
	 * @param ctx the parse tree
	 */
	void exitTmplNumberValue(TLangParser.TmplNumberValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplTextValue}.
	 * @param ctx the parse tree
	 */
	void enterTmplTextValue(TLangParser.TmplTextValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplTextValue}.
	 * @param ctx the parse tree
	 */
	void exitTmplTextValue(TLangParser.TmplTextValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplBoolValue}.
	 * @param ctx the parse tree
	 */
	void enterTmplBoolValue(TLangParser.TmplBoolValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplBoolValue}.
	 * @param ctx the parse tree
	 */
	void exitTmplBoolValue(TLangParser.TmplBoolValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplArrayValue}.
	 * @param ctx the parse tree
	 */
	void enterTmplArrayValue(TLangParser.TmplArrayValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplArrayValue}.
	 * @param ctx the parse tree
	 */
	void exitTmplArrayValue(TLangParser.TmplArrayValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplInclAttribute}.
	 * @param ctx the parse tree
	 */
	void enterTmplInclAttribute(TLangParser.TmplInclAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplInclAttribute}.
	 * @param ctx the parse tree
	 */
	void exitTmplInclAttribute(TLangParser.TmplInclAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplAttribute}.
	 * @param ctx the parse tree
	 */
	void enterTmplAttribute(TLangParser.TmplAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplAttribute}.
	 * @param ctx the parse tree
	 */
	void exitTmplAttribute(TLangParser.TmplAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplMultiValue}.
	 * @param ctx the parse tree
	 */
	void enterTmplMultiValue(TLangParser.TmplMultiValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplMultiValue}.
	 * @param ctx the parse tree
	 */
	void exitTmplMultiValue(TLangParser.TmplMultiValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplEntityValue}.
	 * @param ctx the parse tree
	 */
	void enterTmplEntityValue(TLangParser.TmplEntityValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplEntityValue}.
	 * @param ctx the parse tree
	 */
	void exitTmplEntityValue(TLangParser.TmplEntityValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplOperation}.
	 * @param ctx the parse tree
	 */
	void enterTmplOperation(TLangParser.TmplOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplOperation}.
	 * @param ctx the parse tree
	 */
	void exitTmplOperation(TLangParser.TmplOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplInclude}.
	 * @param ctx the parse tree
	 */
	void enterTmplInclude(TLangParser.TmplIncludeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplInclude}.
	 * @param ctx the parse tree
	 */
	void exitTmplInclude(TLangParser.TmplIncludeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplReturn}.
	 * @param ctx the parse tree
	 */
	void enterTmplReturn(TLangParser.TmplReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplReturn}.
	 * @param ctx the parse tree
	 */
	void exitTmplReturn(TLangParser.TmplReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplAffect}.
	 * @param ctx the parse tree
	 */
	void enterTmplAffect(TLangParser.TmplAffectContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplAffect}.
	 * @param ctx the parse tree
	 */
	void exitTmplAffect(TLangParser.TmplAffectContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplCast}.
	 * @param ctx the parse tree
	 */
	void enterTmplCast(TLangParser.TmplCastContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplCast}.
	 * @param ctx the parse tree
	 */
	void exitTmplCast(TLangParser.TmplCastContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplID}.
	 * @param ctx the parse tree
	 */
	void enterTmplID(TLangParser.TmplIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplID}.
	 * @param ctx the parse tree
	 */
	void exitTmplID(TLangParser.TmplIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplIntprID}.
	 * @param ctx the parse tree
	 */
	void enterTmplIntprID(TLangParser.TmplIntprIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplIntprID}.
	 * @param ctx the parse tree
	 */
	void exitTmplIntprID(TLangParser.TmplIntprIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplString}.
	 * @param ctx the parse tree
	 */
	void enterTmplString(TLangParser.TmplStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplString}.
	 * @param ctx the parse tree
	 */
	void exitTmplString(TLangParser.TmplStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplIntprString}.
	 * @param ctx the parse tree
	 */
	void enterTmplIntprString(TLangParser.TmplIntprStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplIntprString}.
	 * @param ctx the parse tree
	 */
	void exitTmplIntprString(TLangParser.TmplIntprStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplText}.
	 * @param ctx the parse tree
	 */
	void enterTmplText(TLangParser.TmplTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplText}.
	 * @param ctx the parse tree
	 */
	void exitTmplText(TLangParser.TmplTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplIntprText}.
	 * @param ctx the parse tree
	 */
	void enterTmplIntprText(TLangParser.TmplIntprTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplIntprText}.
	 * @param ctx the parse tree
	 */
	void exitTmplIntprText(TLangParser.TmplIntprTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link TLangParser#tmplIdOrString}.
	 * @param ctx the parse tree
	 */
	void enterTmplIdOrString(TLangParser.TmplIdOrStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link TLangParser#tmplIdOrString}.
	 * @param ctx the parse tree
	 */
	void exitTmplIdOrString(TLangParser.TmplIdOrStringContext ctx);
}