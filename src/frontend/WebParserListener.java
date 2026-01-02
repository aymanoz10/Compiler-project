// Generated from C:/Users/MyPre/IdeaProjects/compilar/src/frontend/WebParser.g4 by ANTLR 4.13.2
package frontend;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WebParser}.
 */
public interface WebParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WebParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(WebParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(WebParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoctypeContent}
	 * labeled alternative in {@link WebParser#content}.
	 * @param ctx the parse tree
	 */
	void enterDoctypeContent(WebParser.DoctypeContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoctypeContent}
	 * labeled alternative in {@link WebParser#content}.
	 * @param ctx the parse tree
	 */
	void exitDoctypeContent(WebParser.DoctypeContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlCommentContent}
	 * labeled alternative in {@link WebParser#content}.
	 * @param ctx the parse tree
	 */
	void enterHtmlCommentContent(WebParser.HtmlCommentContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlCommentContent}
	 * labeled alternative in {@link WebParser#content}.
	 * @param ctx the parse tree
	 */
	void exitHtmlCommentContent(WebParser.HtmlCommentContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XmlDeclContent}
	 * labeled alternative in {@link WebParser#content}.
	 * @param ctx the parse tree
	 */
	void enterXmlDeclContent(WebParser.XmlDeclContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XmlDeclContent}
	 * labeled alternative in {@link WebParser#content}.
	 * @param ctx the parse tree
	 */
	void exitXmlDeclContent(WebParser.XmlDeclContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CdataContent}
	 * labeled alternative in {@link WebParser#content}.
	 * @param ctx the parse tree
	 */
	void enterCdataContent(WebParser.CdataContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CdataContent}
	 * labeled alternative in {@link WebParser#content}.
	 * @param ctx the parse tree
	 */
	void exitCdataContent(WebParser.CdataContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaCommentContent}
	 * labeled alternative in {@link WebParser#content}.
	 * @param ctx the parse tree
	 */
	void enterJinjaCommentContent(WebParser.JinjaCommentContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaCommentContent}
	 * labeled alternative in {@link WebParser#content}.
	 * @param ctx the parse tree
	 */
	void exitJinjaCommentContent(WebParser.JinjaCommentContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaForContent}
	 * labeled alternative in {@link WebParser#content}.
	 * @param ctx the parse tree
	 */
	void enterJinjaForContent(WebParser.JinjaForContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaForContent}
	 * labeled alternative in {@link WebParser#content}.
	 * @param ctx the parse tree
	 */
	void exitJinjaForContent(WebParser.JinjaForContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaIfContent}
	 * labeled alternative in {@link WebParser#content}.
	 * @param ctx the parse tree
	 */
	void enterJinjaIfContent(WebParser.JinjaIfContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaIfContent}
	 * labeled alternative in {@link WebParser#content}.
	 * @param ctx the parse tree
	 */
	void exitJinjaIfContent(WebParser.JinjaIfContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaVarContent}
	 * labeled alternative in {@link WebParser#content}.
	 * @param ctx the parse tree
	 */
	void enterJinjaVarContent(WebParser.JinjaVarContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaVarContent}
	 * labeled alternative in {@link WebParser#content}.
	 * @param ctx the parse tree
	 */
	void exitJinjaVarContent(WebParser.JinjaVarContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlElementContent}
	 * labeled alternative in {@link WebParser#content}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElementContent(WebParser.HtmlElementContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlElementContent}
	 * labeled alternative in {@link WebParser#content}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElementContent(WebParser.HtmlElementContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssBlockContent}
	 * labeled alternative in {@link WebParser#content}.
	 * @param ctx the parse tree
	 */
	void enterCssBlockContent(WebParser.CssBlockContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssBlockContent}
	 * labeled alternative in {@link WebParser#content}.
	 * @param ctx the parse tree
	 */
	void exitCssBlockContent(WebParser.CssBlockContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssCommentContent}
	 * labeled alternative in {@link WebParser#content}.
	 * @param ctx the parse tree
	 */
	void enterCssCommentContent(WebParser.CssCommentContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssCommentContent}
	 * labeled alternative in {@link WebParser#content}.
	 * @param ctx the parse tree
	 */
	void exitCssCommentContent(WebParser.CssCommentContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnyTextContent}
	 * labeled alternative in {@link WebParser#content}.
	 * @param ctx the parse tree
	 */
	void enterAnyTextContent(WebParser.AnyTextContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnyTextContent}
	 * labeled alternative in {@link WebParser#content}.
	 * @param ctx the parse tree
	 */
	void exitAnyTextContent(WebParser.AnyTextContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#anyText}.
	 * @param ctx the parse tree
	 */
	void enterAnyText(WebParser.AnyTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#anyText}.
	 * @param ctx the parse tree
	 */
	void exitAnyText(WebParser.AnyTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#doctype}.
	 * @param ctx the parse tree
	 */
	void enterDoctype(WebParser.DoctypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#doctype}.
	 * @param ctx the parse tree
	 */
	void exitDoctype(WebParser.DoctypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void enterHtmlComment(WebParser.HtmlCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void exitHtmlComment(WebParser.HtmlCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#xmlDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterXmlDeclaration(WebParser.XmlDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#xmlDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitXmlDeclaration(WebParser.XmlDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#cdata}.
	 * @param ctx the parse tree
	 */
	void enterCdata(WebParser.CdataContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#cdata}.
	 * @param ctx the parse tree
	 */
	void exitCdata(WebParser.CdataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelfClosingHtmlElement}
	 * labeled alternative in {@link WebParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingHtmlElement(WebParser.SelfClosingHtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelfClosingHtmlElement}
	 * labeled alternative in {@link WebParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingHtmlElement(WebParser.SelfClosingHtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalHtmlElement}
	 * labeled alternative in {@link WebParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterNormalHtmlElement(WebParser.NormalHtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalHtmlElement}
	 * labeled alternative in {@link WebParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitNormalHtmlElement(WebParser.NormalHtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpenHtmlElement}
	 * labeled alternative in {@link WebParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterOpenHtmlElement(WebParser.OpenHtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpenHtmlElement}
	 * labeled alternative in {@link WebParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitOpenHtmlElement(WebParser.OpenHtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoctypeHtmlContent}
	 * labeled alternative in {@link WebParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterDoctypeHtmlContent(WebParser.DoctypeHtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoctypeHtmlContent}
	 * labeled alternative in {@link WebParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitDoctypeHtmlContent(WebParser.DoctypeHtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlCommentHtmlContent}
	 * labeled alternative in {@link WebParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlCommentHtmlContent(WebParser.HtmlCommentHtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlCommentHtmlContent}
	 * labeled alternative in {@link WebParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlCommentHtmlContent(WebParser.HtmlCommentHtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XmlDeclHtmlContent}
	 * labeled alternative in {@link WebParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterXmlDeclHtmlContent(WebParser.XmlDeclHtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XmlDeclHtmlContent}
	 * labeled alternative in {@link WebParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitXmlDeclHtmlContent(WebParser.XmlDeclHtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CdataHtmlContent}
	 * labeled alternative in {@link WebParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterCdataHtmlContent(WebParser.CdataHtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CdataHtmlContent}
	 * labeled alternative in {@link WebParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitCdataHtmlContent(WebParser.CdataHtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaCommentHtmlContent}
	 * labeled alternative in {@link WebParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterJinjaCommentHtmlContent(WebParser.JinjaCommentHtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaCommentHtmlContent}
	 * labeled alternative in {@link WebParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitJinjaCommentHtmlContent(WebParser.JinjaCommentHtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaForHtmlContent}
	 * labeled alternative in {@link WebParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterJinjaForHtmlContent(WebParser.JinjaForHtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaForHtmlContent}
	 * labeled alternative in {@link WebParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitJinjaForHtmlContent(WebParser.JinjaForHtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaIfHtmlContent}
	 * labeled alternative in {@link WebParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterJinjaIfHtmlContent(WebParser.JinjaIfHtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaIfHtmlContent}
	 * labeled alternative in {@link WebParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitJinjaIfHtmlContent(WebParser.JinjaIfHtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaVarHtmlContent}
	 * labeled alternative in {@link WebParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterJinjaVarHtmlContent(WebParser.JinjaVarHtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaVarHtmlContent}
	 * labeled alternative in {@link WebParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitJinjaVarHtmlContent(WebParser.JinjaVarHtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlElementHtmlContent}
	 * labeled alternative in {@link WebParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElementHtmlContent(WebParser.HtmlElementHtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlElementHtmlContent}
	 * labeled alternative in {@link WebParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElementHtmlContent(WebParser.HtmlElementHtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnyTextHtmlContent}
	 * labeled alternative in {@link WebParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterAnyTextHtmlContent(WebParser.AnyTextHtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnyTextHtmlContent}
	 * labeled alternative in {@link WebParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitAnyTextHtmlContent(WebParser.AnyTextHtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(WebParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(WebParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringAttrValue}
	 * labeled alternative in {@link WebParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void enterStringAttrValue(WebParser.StringAttrValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringAttrValue}
	 * labeled alternative in {@link WebParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void exitStringAttrValue(WebParser.StringAttrValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierAttrValue}
	 * labeled alternative in {@link WebParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierAttrValue(WebParser.IdentifierAttrValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierAttrValue}
	 * labeled alternative in {@link WebParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierAttrValue(WebParser.IdentifierAttrValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberAttrValue}
	 * labeled alternative in {@link WebParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void enterNumberAttrValue(WebParser.NumberAttrValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberAttrValue}
	 * labeled alternative in {@link WebParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void exitNumberAttrValue(WebParser.NumberAttrValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaVarAttrValue}
	 * labeled alternative in {@link WebParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void enterJinjaVarAttrValue(WebParser.JinjaVarAttrValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaVarAttrValue}
	 * labeled alternative in {@link WebParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void exitJinjaVarAttrValue(WebParser.JinjaVarAttrValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#jinjaComment}.
	 * @param ctx the parse tree
	 */
	void enterJinjaComment(WebParser.JinjaCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#jinjaComment}.
	 * @param ctx the parse tree
	 */
	void exitJinjaComment(WebParser.JinjaCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#jinjaVar}.
	 * @param ctx the parse tree
	 */
	void enterJinjaVar(WebParser.JinjaVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#jinjaVar}.
	 * @param ctx the parse tree
	 */
	void exitJinjaVar(WebParser.JinjaVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#jinjaFor}.
	 * @param ctx the parse tree
	 */
	void enterJinjaFor(WebParser.JinjaForContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#jinjaFor}.
	 * @param ctx the parse tree
	 */
	void exitJinjaFor(WebParser.JinjaForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoctypeForContent}
	 * labeled alternative in {@link WebParser#forContent}.
	 * @param ctx the parse tree
	 */
	void enterDoctypeForContent(WebParser.DoctypeForContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoctypeForContent}
	 * labeled alternative in {@link WebParser#forContent}.
	 * @param ctx the parse tree
	 */
	void exitDoctypeForContent(WebParser.DoctypeForContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlCommentForContent}
	 * labeled alternative in {@link WebParser#forContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlCommentForContent(WebParser.HtmlCommentForContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlCommentForContent}
	 * labeled alternative in {@link WebParser#forContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlCommentForContent(WebParser.HtmlCommentForContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XmlDeclForContent}
	 * labeled alternative in {@link WebParser#forContent}.
	 * @param ctx the parse tree
	 */
	void enterXmlDeclForContent(WebParser.XmlDeclForContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XmlDeclForContent}
	 * labeled alternative in {@link WebParser#forContent}.
	 * @param ctx the parse tree
	 */
	void exitXmlDeclForContent(WebParser.XmlDeclForContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CdataForContent}
	 * labeled alternative in {@link WebParser#forContent}.
	 * @param ctx the parse tree
	 */
	void enterCdataForContent(WebParser.CdataForContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CdataForContent}
	 * labeled alternative in {@link WebParser#forContent}.
	 * @param ctx the parse tree
	 */
	void exitCdataForContent(WebParser.CdataForContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaCommentForContent}
	 * labeled alternative in {@link WebParser#forContent}.
	 * @param ctx the parse tree
	 */
	void enterJinjaCommentForContent(WebParser.JinjaCommentForContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaCommentForContent}
	 * labeled alternative in {@link WebParser#forContent}.
	 * @param ctx the parse tree
	 */
	void exitJinjaCommentForContent(WebParser.JinjaCommentForContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaIfForContent}
	 * labeled alternative in {@link WebParser#forContent}.
	 * @param ctx the parse tree
	 */
	void enterJinjaIfForContent(WebParser.JinjaIfForContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaIfForContent}
	 * labeled alternative in {@link WebParser#forContent}.
	 * @param ctx the parse tree
	 */
	void exitJinjaIfForContent(WebParser.JinjaIfForContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaVarForContent}
	 * labeled alternative in {@link WebParser#forContent}.
	 * @param ctx the parse tree
	 */
	void enterJinjaVarForContent(WebParser.JinjaVarForContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaVarForContent}
	 * labeled alternative in {@link WebParser#forContent}.
	 * @param ctx the parse tree
	 */
	void exitJinjaVarForContent(WebParser.JinjaVarForContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlElementForContent}
	 * labeled alternative in {@link WebParser#forContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElementForContent(WebParser.HtmlElementForContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlElementForContent}
	 * labeled alternative in {@link WebParser#forContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElementForContent(WebParser.HtmlElementForContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnyTextForContent}
	 * labeled alternative in {@link WebParser#forContent}.
	 * @param ctx the parse tree
	 */
	void enterAnyTextForContent(WebParser.AnyTextForContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnyTextForContent}
	 * labeled alternative in {@link WebParser#forContent}.
	 * @param ctx the parse tree
	 */
	void exitAnyTextForContent(WebParser.AnyTextForContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#jinjaIf}.
	 * @param ctx the parse tree
	 */
	void enterJinjaIf(WebParser.JinjaIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#jinjaIf}.
	 * @param ctx the parse tree
	 */
	void exitJinjaIf(WebParser.JinjaIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#jinjaElif}.
	 * @param ctx the parse tree
	 */
	void enterJinjaElif(WebParser.JinjaElifContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#jinjaElif}.
	 * @param ctx the parse tree
	 */
	void exitJinjaElif(WebParser.JinjaElifContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#jinjaElse}.
	 * @param ctx the parse tree
	 */
	void enterJinjaElse(WebParser.JinjaElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#jinjaElse}.
	 * @param ctx the parse tree
	 */
	void exitJinjaElse(WebParser.JinjaElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoctypeIfContent}
	 * labeled alternative in {@link WebParser#ifContent}.
	 * @param ctx the parse tree
	 */
	void enterDoctypeIfContent(WebParser.DoctypeIfContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoctypeIfContent}
	 * labeled alternative in {@link WebParser#ifContent}.
	 * @param ctx the parse tree
	 */
	void exitDoctypeIfContent(WebParser.DoctypeIfContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlCommentIfContent}
	 * labeled alternative in {@link WebParser#ifContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlCommentIfContent(WebParser.HtmlCommentIfContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlCommentIfContent}
	 * labeled alternative in {@link WebParser#ifContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlCommentIfContent(WebParser.HtmlCommentIfContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XmlDeclIfContent}
	 * labeled alternative in {@link WebParser#ifContent}.
	 * @param ctx the parse tree
	 */
	void enterXmlDeclIfContent(WebParser.XmlDeclIfContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XmlDeclIfContent}
	 * labeled alternative in {@link WebParser#ifContent}.
	 * @param ctx the parse tree
	 */
	void exitXmlDeclIfContent(WebParser.XmlDeclIfContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CdataIfContent}
	 * labeled alternative in {@link WebParser#ifContent}.
	 * @param ctx the parse tree
	 */
	void enterCdataIfContent(WebParser.CdataIfContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CdataIfContent}
	 * labeled alternative in {@link WebParser#ifContent}.
	 * @param ctx the parse tree
	 */
	void exitCdataIfContent(WebParser.CdataIfContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaCommentIfContent}
	 * labeled alternative in {@link WebParser#ifContent}.
	 * @param ctx the parse tree
	 */
	void enterJinjaCommentIfContent(WebParser.JinjaCommentIfContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaCommentIfContent}
	 * labeled alternative in {@link WebParser#ifContent}.
	 * @param ctx the parse tree
	 */
	void exitJinjaCommentIfContent(WebParser.JinjaCommentIfContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaForIfContent}
	 * labeled alternative in {@link WebParser#ifContent}.
	 * @param ctx the parse tree
	 */
	void enterJinjaForIfContent(WebParser.JinjaForIfContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaForIfContent}
	 * labeled alternative in {@link WebParser#ifContent}.
	 * @param ctx the parse tree
	 */
	void exitJinjaForIfContent(WebParser.JinjaForIfContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaVarIfContent}
	 * labeled alternative in {@link WebParser#ifContent}.
	 * @param ctx the parse tree
	 */
	void enterJinjaVarIfContent(WebParser.JinjaVarIfContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaVarIfContent}
	 * labeled alternative in {@link WebParser#ifContent}.
	 * @param ctx the parse tree
	 */
	void exitJinjaVarIfContent(WebParser.JinjaVarIfContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlElementIfContent}
	 * labeled alternative in {@link WebParser#ifContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElementIfContent(WebParser.HtmlElementIfContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlElementIfContent}
	 * labeled alternative in {@link WebParser#ifContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElementIfContent(WebParser.HtmlElementIfContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnyTextIfContent}
	 * labeled alternative in {@link WebParser#ifContent}.
	 * @param ctx the parse tree
	 */
	void enterAnyTextIfContent(WebParser.AnyTextIfContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnyTextIfContent}
	 * labeled alternative in {@link WebParser#ifContent}.
	 * @param ctx the parse tree
	 */
	void exitAnyTextIfContent(WebParser.AnyTextIfContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#jinjaExpression}.
	 * @param ctx the parse tree
	 */
	void enterJinjaExpression(WebParser.JinjaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#jinjaExpression}.
	 * @param ctx the parse tree
	 */
	void exitJinjaExpression(WebParser.JinjaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#jinjaTernary}.
	 * @param ctx the parse tree
	 */
	void enterJinjaTernary(WebParser.JinjaTernaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#jinjaTernary}.
	 * @param ctx the parse tree
	 */
	void exitJinjaTernary(WebParser.JinjaTernaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#jinjaLogical}.
	 * @param ctx the parse tree
	 */
	void enterJinjaLogical(WebParser.JinjaLogicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#jinjaLogical}.
	 * @param ctx the parse tree
	 */
	void exitJinjaLogical(WebParser.JinjaLogicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#jinjaComparison}.
	 * @param ctx the parse tree
	 */
	void enterJinjaComparison(WebParser.JinjaComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#jinjaComparison}.
	 * @param ctx the parse tree
	 */
	void exitJinjaComparison(WebParser.JinjaComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#jinjaAdditive}.
	 * @param ctx the parse tree
	 */
	void enterJinjaAdditive(WebParser.JinjaAdditiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#jinjaAdditive}.
	 * @param ctx the parse tree
	 */
	void exitJinjaAdditive(WebParser.JinjaAdditiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#jinjaMultiplicative}.
	 * @param ctx the parse tree
	 */
	void enterJinjaMultiplicative(WebParser.JinjaMultiplicativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#jinjaMultiplicative}.
	 * @param ctx the parse tree
	 */
	void exitJinjaMultiplicative(WebParser.JinjaMultiplicativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotUnary}
	 * labeled alternative in {@link WebParser#jinjaUnary}.
	 * @param ctx the parse tree
	 */
	void enterNotUnary(WebParser.NotUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotUnary}
	 * labeled alternative in {@link WebParser#jinjaUnary}.
	 * @param ctx the parse tree
	 */
	void exitNotUnary(WebParser.NotUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterUnary}
	 * labeled alternative in {@link WebParser#jinjaUnary}.
	 * @param ctx the parse tree
	 */
	void enterFilterUnary(WebParser.FilterUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterUnary}
	 * labeled alternative in {@link WebParser#jinjaUnary}.
	 * @param ctx the parse tree
	 */
	void exitFilterUnary(WebParser.FilterUnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#jinjaFilter}.
	 * @param ctx the parse tree
	 */
	void enterJinjaFilter(WebParser.JinjaFilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#jinjaFilter}.
	 * @param ctx the parse tree
	 */
	void exitJinjaFilter(WebParser.JinjaFilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#jinjaPostfix}.
	 * @param ctx the parse tree
	 */
	void enterJinjaPostfix(WebParser.JinjaPostfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#jinjaPostfix}.
	 * @param ctx the parse tree
	 */
	void exitJinjaPostfix(WebParser.JinjaPostfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberAccessOp}
	 * labeled alternative in {@link WebParser#jinjaPostfixOp}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccessOp(WebParser.MemberAccessOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberAccessOp}
	 * labeled alternative in {@link WebParser#jinjaPostfixOp}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccessOp(WebParser.MemberAccessOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IndexAccessOp}
	 * labeled alternative in {@link WebParser#jinjaPostfixOp}.
	 * @param ctx the parse tree
	 */
	void enterIndexAccessOp(WebParser.IndexAccessOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IndexAccessOp}
	 * labeled alternative in {@link WebParser#jinjaPostfixOp}.
	 * @param ctx the parse tree
	 */
	void exitIndexAccessOp(WebParser.IndexAccessOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCallOp}
	 * labeled alternative in {@link WebParser#jinjaPostfixOp}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallOp(WebParser.FunctionCallOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCallOp}
	 * labeled alternative in {@link WebParser#jinjaPostfixOp}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallOp(WebParser.FunctionCallOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierPrimary}
	 * labeled alternative in {@link WebParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierPrimary(WebParser.IdentifierPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierPrimary}
	 * labeled alternative in {@link WebParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierPrimary(WebParser.IdentifierPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringPrimary}
	 * labeled alternative in {@link WebParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 */
	void enterStringPrimary(WebParser.StringPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringPrimary}
	 * labeled alternative in {@link WebParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 */
	void exitStringPrimary(WebParser.StringPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberPrimary}
	 * labeled alternative in {@link WebParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 */
	void enterNumberPrimary(WebParser.NumberPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberPrimary}
	 * labeled alternative in {@link WebParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 */
	void exitNumberPrimary(WebParser.NumberPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenPrimary}
	 * labeled alternative in {@link WebParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 */
	void enterParenPrimary(WebParser.ParenPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenPrimary}
	 * labeled alternative in {@link WebParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 */
	void exitParenPrimary(WebParser.ParenPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#jinjaArguments}.
	 * @param ctx the parse tree
	 */
	void enterJinjaArguments(WebParser.JinjaArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#jinjaArguments}.
	 * @param ctx the parse tree
	 */
	void exitJinjaArguments(WebParser.JinjaArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#cssBlock}.
	 * @param ctx the parse tree
	 */
	void enterCssBlock(WebParser.CssBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#cssBlock}.
	 * @param ctx the parse tree
	 */
	void exitCssBlock(WebParser.CssBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#cssSelector}.
	 * @param ctx the parse tree
	 */
	void enterCssSelector(WebParser.CssSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#cssSelector}.
	 * @param ctx the parse tree
	 */
	void exitCssSelector(WebParser.CssSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#cssSelectorPart}.
	 * @param ctx the parse tree
	 */
	void enterCssSelectorPart(WebParser.CssSelectorPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#cssSelectorPart}.
	 * @param ctx the parse tree
	 */
	void exitCssSelectorPart(WebParser.CssSelectorPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCssDeclaration(WebParser.CssDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCssDeclaration(WebParser.CssDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#cssProperty}.
	 * @param ctx the parse tree
	 */
	void enterCssProperty(WebParser.CssPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#cssProperty}.
	 * @param ctx the parse tree
	 */
	void exitCssProperty(WebParser.CssPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#cssValueList}.
	 * @param ctx the parse tree
	 */
	void enterCssValueList(WebParser.CssValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#cssValueList}.
	 * @param ctx the parse tree
	 */
	void exitCssValueList(WebParser.CssValueListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierCssValue}
	 * labeled alternative in {@link WebParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierCssValue(WebParser.IdentifierCssValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierCssValue}
	 * labeled alternative in {@link WebParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierCssValue(WebParser.IdentifierCssValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberCssValue}
	 * labeled alternative in {@link WebParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterNumberCssValue(WebParser.NumberCssValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberCssValue}
	 * labeled alternative in {@link WebParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitNumberCssValue(WebParser.NumberCssValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringCssValue}
	 * labeled alternative in {@link WebParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterStringCssValue(WebParser.StringCssValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringCssValue}
	 * labeled alternative in {@link WebParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitStringCssValue(WebParser.StringCssValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssValueToken}
	 * labeled alternative in {@link WebParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterCssValueToken(WebParser.CssValueTokenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssValueToken}
	 * labeled alternative in {@link WebParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitCssValueToken(WebParser.CssValueTokenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HexColorValue}
	 * labeled alternative in {@link WebParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterHexColorValue(WebParser.HexColorValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HexColorValue}
	 * labeled alternative in {@link WebParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitHexColorValue(WebParser.HexColorValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextCssValue}
	 * labeled alternative in {@link WebParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterTextCssValue(WebParser.TextCssValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextCssValue}
	 * labeled alternative in {@link WebParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitTextCssValue(WebParser.TextCssValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumericCssValue}
	 * labeled alternative in {@link WebParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterNumericCssValue(WebParser.NumericCssValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumericCssValue}
	 * labeled alternative in {@link WebParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitNumericCssValue(WebParser.NumericCssValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenCssValue}
	 * labeled alternative in {@link WebParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterParenCssValue(WebParser.ParenCssValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenCssValue}
	 * labeled alternative in {@link WebParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitParenCssValue(WebParser.ParenCssValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CommaCssValue}
	 * labeled alternative in {@link WebParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterCommaCssValue(WebParser.CommaCssValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CommaCssValue}
	 * labeled alternative in {@link WebParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitCommaCssValue(WebParser.CommaCssValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TagOpenCssValue}
	 * labeled alternative in {@link WebParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterTagOpenCssValue(WebParser.TagOpenCssValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TagOpenCssValue}
	 * labeled alternative in {@link WebParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitTagOpenCssValue(WebParser.TagOpenCssValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TagCloseCssValue}
	 * labeled alternative in {@link WebParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterTagCloseCssValue(WebParser.TagCloseCssValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TagCloseCssValue}
	 * labeled alternative in {@link WebParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitTagCloseCssValue(WebParser.TagCloseCssValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColonCssValue}
	 * labeled alternative in {@link WebParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterColonCssValue(WebParser.ColonCssValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColonCssValue}
	 * labeled alternative in {@link WebParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitColonCssValue(WebParser.ColonCssValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link WebParser#cssComment}.
	 * @param ctx the parse tree
	 */
	void enterCssComment(WebParser.CssCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link WebParser#cssComment}.
	 * @param ctx the parse tree
	 */
	void exitCssComment(WebParser.CssCommentContext ctx);
}