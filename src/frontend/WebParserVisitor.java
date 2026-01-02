// Generated from C:/Users/MyPre/IdeaProjects/compilar/src/frontend/WebParser.g4 by ANTLR 4.13.2
package frontend;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link WebParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface WebParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link WebParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument(WebParser.DocumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoctypeContent}
	 * labeled alternative in {@link WebParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoctypeContent(WebParser.DoctypeContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlCommentContent}
	 * labeled alternative in {@link WebParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlCommentContent(WebParser.HtmlCommentContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XmlDeclContent}
	 * labeled alternative in {@link WebParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlDeclContent(WebParser.XmlDeclContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CdataContent}
	 * labeled alternative in {@link WebParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCdataContent(WebParser.CdataContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaCommentContent}
	 * labeled alternative in {@link WebParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaCommentContent(WebParser.JinjaCommentContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaForContent}
	 * labeled alternative in {@link WebParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaForContent(WebParser.JinjaForContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaIfContent}
	 * labeled alternative in {@link WebParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaIfContent(WebParser.JinjaIfContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaVarContent}
	 * labeled alternative in {@link WebParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaVarContent(WebParser.JinjaVarContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlElementContent}
	 * labeled alternative in {@link WebParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElementContent(WebParser.HtmlElementContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssBlockContent}
	 * labeled alternative in {@link WebParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssBlockContent(WebParser.CssBlockContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssCommentContent}
	 * labeled alternative in {@link WebParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssCommentContent(WebParser.CssCommentContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnyTextContent}
	 * labeled alternative in {@link WebParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyTextContent(WebParser.AnyTextContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#anyText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyText(WebParser.AnyTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#doctype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoctype(WebParser.DoctypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#htmlComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlComment(WebParser.HtmlCommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#xmlDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlDeclaration(WebParser.XmlDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#cdata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCdata(WebParser.CdataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelfClosingHtmlElement}
	 * labeled alternative in {@link WebParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingHtmlElement(WebParser.SelfClosingHtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NormalHtmlElement}
	 * labeled alternative in {@link WebParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalHtmlElement(WebParser.NormalHtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpenHtmlElement}
	 * labeled alternative in {@link WebParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenHtmlElement(WebParser.OpenHtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoctypeHtmlContent}
	 * labeled alternative in {@link WebParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoctypeHtmlContent(WebParser.DoctypeHtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlCommentHtmlContent}
	 * labeled alternative in {@link WebParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlCommentHtmlContent(WebParser.HtmlCommentHtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XmlDeclHtmlContent}
	 * labeled alternative in {@link WebParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlDeclHtmlContent(WebParser.XmlDeclHtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CdataHtmlContent}
	 * labeled alternative in {@link WebParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCdataHtmlContent(WebParser.CdataHtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaCommentHtmlContent}
	 * labeled alternative in {@link WebParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaCommentHtmlContent(WebParser.JinjaCommentHtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaForHtmlContent}
	 * labeled alternative in {@link WebParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaForHtmlContent(WebParser.JinjaForHtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaIfHtmlContent}
	 * labeled alternative in {@link WebParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaIfHtmlContent(WebParser.JinjaIfHtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaVarHtmlContent}
	 * labeled alternative in {@link WebParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaVarHtmlContent(WebParser.JinjaVarHtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlElementHtmlContent}
	 * labeled alternative in {@link WebParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElementHtmlContent(WebParser.HtmlElementHtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnyTextHtmlContent}
	 * labeled alternative in {@link WebParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyTextHtmlContent(WebParser.AnyTextHtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(WebParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringAttrValue}
	 * labeled alternative in {@link WebParser#attributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAttrValue(WebParser.StringAttrValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierAttrValue}
	 * labeled alternative in {@link WebParser#attributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierAttrValue(WebParser.IdentifierAttrValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberAttrValue}
	 * labeled alternative in {@link WebParser#attributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberAttrValue(WebParser.NumberAttrValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaVarAttrValue}
	 * labeled alternative in {@link WebParser#attributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaVarAttrValue(WebParser.JinjaVarAttrValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#jinjaComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaComment(WebParser.JinjaCommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#jinjaVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaVar(WebParser.JinjaVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#jinjaFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaFor(WebParser.JinjaForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoctypeForContent}
	 * labeled alternative in {@link WebParser#forContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoctypeForContent(WebParser.DoctypeForContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlCommentForContent}
	 * labeled alternative in {@link WebParser#forContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlCommentForContent(WebParser.HtmlCommentForContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XmlDeclForContent}
	 * labeled alternative in {@link WebParser#forContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlDeclForContent(WebParser.XmlDeclForContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CdataForContent}
	 * labeled alternative in {@link WebParser#forContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCdataForContent(WebParser.CdataForContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaCommentForContent}
	 * labeled alternative in {@link WebParser#forContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaCommentForContent(WebParser.JinjaCommentForContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaIfForContent}
	 * labeled alternative in {@link WebParser#forContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaIfForContent(WebParser.JinjaIfForContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaVarForContent}
	 * labeled alternative in {@link WebParser#forContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaVarForContent(WebParser.JinjaVarForContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlElementForContent}
	 * labeled alternative in {@link WebParser#forContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElementForContent(WebParser.HtmlElementForContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnyTextForContent}
	 * labeled alternative in {@link WebParser#forContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyTextForContent(WebParser.AnyTextForContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#jinjaIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaIf(WebParser.JinjaIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#jinjaElif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaElif(WebParser.JinjaElifContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#jinjaElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaElse(WebParser.JinjaElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoctypeIfContent}
	 * labeled alternative in {@link WebParser#ifContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoctypeIfContent(WebParser.DoctypeIfContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlCommentIfContent}
	 * labeled alternative in {@link WebParser#ifContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlCommentIfContent(WebParser.HtmlCommentIfContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XmlDeclIfContent}
	 * labeled alternative in {@link WebParser#ifContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlDeclIfContent(WebParser.XmlDeclIfContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CdataIfContent}
	 * labeled alternative in {@link WebParser#ifContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCdataIfContent(WebParser.CdataIfContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaCommentIfContent}
	 * labeled alternative in {@link WebParser#ifContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaCommentIfContent(WebParser.JinjaCommentIfContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaForIfContent}
	 * labeled alternative in {@link WebParser#ifContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaForIfContent(WebParser.JinjaForIfContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaVarIfContent}
	 * labeled alternative in {@link WebParser#ifContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaVarIfContent(WebParser.JinjaVarIfContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlElementIfContent}
	 * labeled alternative in {@link WebParser#ifContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElementIfContent(WebParser.HtmlElementIfContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnyTextIfContent}
	 * labeled alternative in {@link WebParser#ifContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnyTextIfContent(WebParser.AnyTextIfContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#jinjaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaExpression(WebParser.JinjaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#jinjaTernary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaTernary(WebParser.JinjaTernaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#jinjaLogical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaLogical(WebParser.JinjaLogicalContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#jinjaComparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaComparison(WebParser.JinjaComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#jinjaAdditive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaAdditive(WebParser.JinjaAdditiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#jinjaMultiplicative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaMultiplicative(WebParser.JinjaMultiplicativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotUnary}
	 * labeled alternative in {@link WebParser#jinjaUnary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotUnary(WebParser.NotUnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilterUnary}
	 * labeled alternative in {@link WebParser#jinjaUnary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterUnary(WebParser.FilterUnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#jinjaFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaFilter(WebParser.JinjaFilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#jinjaPostfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaPostfix(WebParser.JinjaPostfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberAccessOp}
	 * labeled alternative in {@link WebParser#jinjaPostfixOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccessOp(WebParser.MemberAccessOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IndexAccessOp}
	 * labeled alternative in {@link WebParser#jinjaPostfixOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexAccessOp(WebParser.IndexAccessOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallOp}
	 * labeled alternative in {@link WebParser#jinjaPostfixOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallOp(WebParser.FunctionCallOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierPrimary}
	 * labeled alternative in {@link WebParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierPrimary(WebParser.IdentifierPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringPrimary}
	 * labeled alternative in {@link WebParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringPrimary(WebParser.StringPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberPrimary}
	 * labeled alternative in {@link WebParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberPrimary(WebParser.NumberPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenPrimary}
	 * labeled alternative in {@link WebParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenPrimary(WebParser.ParenPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#jinjaArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaArguments(WebParser.JinjaArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#cssBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssBlock(WebParser.CssBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#cssSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssSelector(WebParser.CssSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#cssSelectorPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssSelectorPart(WebParser.CssSelectorPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#cssDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssDeclaration(WebParser.CssDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#cssProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssProperty(WebParser.CssPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#cssValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssValueList(WebParser.CssValueListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierCssValue}
	 * labeled alternative in {@link WebParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierCssValue(WebParser.IdentifierCssValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberCssValue}
	 * labeled alternative in {@link WebParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberCssValue(WebParser.NumberCssValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringCssValue}
	 * labeled alternative in {@link WebParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringCssValue(WebParser.StringCssValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssValueToken}
	 * labeled alternative in {@link WebParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssValueToken(WebParser.CssValueTokenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HexColorValue}
	 * labeled alternative in {@link WebParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexColorValue(WebParser.HexColorValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TextCssValue}
	 * labeled alternative in {@link WebParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextCssValue(WebParser.TextCssValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumericCssValue}
	 * labeled alternative in {@link WebParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericCssValue(WebParser.NumericCssValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenCssValue}
	 * labeled alternative in {@link WebParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenCssValue(WebParser.ParenCssValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CommaCssValue}
	 * labeled alternative in {@link WebParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommaCssValue(WebParser.CommaCssValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TagOpenCssValue}
	 * labeled alternative in {@link WebParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagOpenCssValue(WebParser.TagOpenCssValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TagCloseCssValue}
	 * labeled alternative in {@link WebParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagCloseCssValue(WebParser.TagCloseCssValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColonCssValue}
	 * labeled alternative in {@link WebParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColonCssValue(WebParser.ColonCssValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link WebParser#cssComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssComment(WebParser.CssCommentContext ctx);
}