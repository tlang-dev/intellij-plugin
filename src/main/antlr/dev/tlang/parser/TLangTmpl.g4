grammar TLangTmpl;

import TLangCommon, TLangHelper, CommonLexer;

	/*
 * Tmpl block (Template block)
 * The content of this block will be translated in the final language as it is
 */
tmplBlock:
	Tmpl '[' lang=tmplID ']' name=tmplID ('('params += helperParam (',' params += helperParam)*')')? block = tmplBlockContentType;

tmplBlockContentType: tmplFullBlock | tmplSpecialisedBlock;

tmplFullBlock: LBRACE
	(tmplPakage=tmplPkg)?
	(tmplUses+=tmplUse)*
	(tmplContents+=tmplContent)*
	RBRACE;

tmplSpecialisedBlock: Spec LBRACE content=tmplSpecialisedContent RBRACE;

//tmplSpecialisedTypes: 'impl' | 'func' | 'expr' | 'attr' | 'setAttr' | 'param';

tmplSpecialisedContent: tmplContent | tmplAttribute | 'setAttr' tmplSetAttribute | tmplParam;

tmplContent: tmplImpl | tmplFunc | tmplExpression | tmplOperation;

tmplPkg: Pkg parts+=tmplID ('.' parts+=tmplID)*;

tmplUse: Use parts+=tmplID ('.' parts+=tmplID)* ('as' alias=tmplID)?;

tmplAnnot: '@' name=tmplID ('(' annotParams+=tmplAnnotParam (',' annotParams+=tmplAnnotParam)* ')')?;

tmplAnnotParam:name=tmplID '=' value=tmplValueType;

tmplProps: ('[' (props+=tmplID)+ ']')?;

tmplImpl:
    (annots+=tmplAnnot)*
	Impl props=tmplProps  name=tmplID ((For forProps=tmplProps  forNames+=tmplType) (',' forNames+=tmplType)* (('with' withProps=tmplProps  withNames+=tmplType) (',' withNames+=tmplType)*)?)? LBRACE
	(tmplImplContents+=tmplContent)*
	RBRACE;

tmplFunc:
    (annots+=tmplAnnot)*
	Func props=tmplProps name=tmplID curries+=tmplCurrying* (':' types+=tmplType (',' types+=tmplType)*)? postProps=tmplProps content=tmplExprBlock?;

tmplCurrying: '(' param=tmplCurryingParam ')';

tmplCurryingParam:
	((params+=tmplParam) (',' params+=tmplParam)*)?;

tmplParam:
    (annots+=tmplAnnot)*
	accessor=tmplID? name=tmplID (':' type=tmplType)?;

tmplType:
	type=tmplID ('<' (generic=tmplGeneric) '>')? (instance=tmplCurryParams)? (array='[' ']')?;

tmplGeneric:
	(types+=tmplType (',' types+=tmplType)*);

tmplExprContent: tmplExpression | tmplExprBlock;

tmplExprBlock: LBRACE exprs+=tmplExpression* RBRACE;

tmplExpression:	tmplVar | tmplCallObj | tmplValueType | tmplFunc
                | tmplIf | tmplFor | tmplWhile | tmplDoWhile | tmplInclude | tmplReturn
                | tmplAffect | tmplCast | tmplAnonFunc | tmplPrimitiveValue;

tmplIf: If '(' cond=tmplOperation ')' content=tmplExprContent elseThen=tmplElse?;

tmplElse: Else (tmplIf | tmplExprContent);

tmplFor: For '(' variable=tmplID ('=' start=tmplOperation)? type=('in' | 'to' | 'until') array=tmplOperation ')' content=tmplExprContent;

tmplWhile: While '(' cond=tmplOperation ')' content=tmplExprContent;

tmplDoWhile: Do content=tmplExprContent While '(' cond=tmplOperation ')';

tmplAnonFunc: params=tmplCurrying '=>' content=tmplExprContent;

tmplVar:
    (annots+=tmplAnnot)*
    Var props=tmplProps name=tmplID (':' type=tmplType)? (optional=tmplOptionalValue)? ('=' value=tmplOperation)?;

tmplOptionalValue: '?';

tmplCallObj: props=tmplProps objs+=tmplCallObjType ('.'objs+=tmplCallObjType)*;

tmplCallObjType: tmplCallArray | tmplCallFunc | tmplCallVariable;

tmplCallFunc: ((name=tmplID) | '_') (currying += tmplCurryParams)+;

tmplCurryParams:'(' (params+=tmplInclSetAttribute (',' params+=tmplInclSetAttribute)*)? ')';

tmplSetAttribute: (name=tmplIdOrString ':')? value=tmplOperation;

tmplInclSetAttribute: tmplInclude | tmplSetAttribute;

tmplCallArray: name=tmplID '[' elem=tmplOperation ']';

tmplCallVariable: name=tmplID;

tmplValueType: tmplCallObj | tmplPrimitiveValue | tmplMultiValue;

tmplPrimitiveValue: tmplStringValue | tmplNumberValue | tmplTextValue | tmplEntityValue | tmplBoolValue | tmplArrayValue;

tmplStringValue: value=tmplString;

tmplNumberValue: value=NUMBER;

tmplTextValue: value=tmplText;

tmplBoolValue: value= 'true' | 'false';

tmplArrayValue: '[' (params+=tmplInclSetAttribute)? (',' params+=tmplInclSetAttribute)* ']';

tmplInclAttribute: tmplInclude | tmplAttribute;

tmplAttribute: ((attr=tmplID)? (':' type=tmplType)? value=tmplOperation);

tmplMultiValue: '(' (values+=tmplValueType) (',' values+=tmplValueType)* ')';

tmplEntityValue:
	'new' (name=tmplID)? ('(' ((params+=tmplInclAttribute) (',' params+=tmplInclAttribute)*)? ')')?
	(LBRACE ((attrs+=tmplInclAttribute) (',' attrs+=tmplInclAttribute)*)? RBRACE)?;

tmplOperation:
     (content=tmplExpression (op=operator  next=tmplOperation)* |
     '(' content=tmplExpression ')' (op=operator  next=tmplOperation)* |
     '(' content=tmplExpression (op=operator  next=tmplOperation)* ')' |
     '(' innerBlock=tmplOperation ')' (op=operator  next=tmplOperation)*)
     ('.' combine=tmplCallObj)?;

tmplInclude: '<[' ((calls+=callObj)*) ']>';

tmplReturn: Return call=tmplOperation;

tmplAffect: variable=tmplCallObj '=' value=tmplOperation;

tmplCast: '(' toCast=tmplOperation 'as' type=tmplType ')' ('.' combine=tmplCallObj)?;

tmplID: ID | tmplIntprID | ESCAPED_ID;

tmplIntprID: (pre=ID)? '${' callObj '}' (pos=ID)?;

tmplString: STRING | tmplIntprString;

tmplIntprString: 's"' (pre=ID)? '${' callObj '}' (pos=ID)? '"';

tmplText: TEXT | tmplIntprText;

tmplIntprText: 's"""' (pre=ID)? '${' callObj '}' (pos=ID)? '"""';

tmplIdOrString: tmplID | tmplString;
