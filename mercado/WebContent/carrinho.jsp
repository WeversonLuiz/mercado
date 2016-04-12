<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://richfaces.org/a4j" prefix="a4j"%>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@include file="menu.jsp"%><f:view>
		<h:form>
			<h:messages></h:messages>
			<rich:dataTable value="#{PedidoControl.itens}" var="item"
				width="700px">
				<f:facet name="header">
					<h:outputText value="Seu Carrinho de Compras"></h:outputText>
				</f:facet>
				<rich:column>
					<f:facet name="header">
						<h:outputText value="Foto"></h:outputText>
					</f:facet>
					<h:graphicImage value="figuras/#{item.produto.foto}"
						styleClass="foto"></h:graphicImage>
				</rich:column>
				<rich:column>
					<f:facet name="header">
						<h:outputText value="Descricao"></h:outputText>
					</f:facet>
					<h:outputText value="#{item.produto.descricao}" />
				</rich:column>
				<rich:column>
					<f:facet name="header">
						<h:outputText value="Preco Unitario"></h:outputText>
					</f:facet>
					<h:outputText value="#{item.produto.preco}">
						<f:convertNumber pattern="###,##0.00" />
					</h:outputText>
				</rich:column>
				<rich:column>
					<f:facet name="header">
						<h:outputText value="Quantidade"></h:outputText>
					</f:facet>
					<h:inputText value="#{item.quantidade}" />
				</rich:column>
				<rich:column>
					<f:facet name="header">
						<h:outputText value="Preco Total"></h:outputText>
					</f:facet>
					<h:outputText value="#{item.precoTotal}">
						<f:convertNumber pattern="###,##0.00" />
					</h:outputText>
					<f:facet name="footer">
						<h:outputText value="#{PedidoControl.pedido.precoTotal}">
							<f:convertNumber pattern="###,##0.00" />
						</h:outputText>
					</f:facet>
				</rich:column>
				<rich:column>
					<f:facet name="header">
						<h:outputText value="Alterar"></h:outputText>
					</f:facet>
					<h:commandButton value="Alterar Quantidade"></h:commandButton>
				</rich:column>
				<rich:column>
					<f:facet name="header">
						<h:outputText value="Excluir"></h:outputText>
					</f:facet>
					<h:commandButton value="Excluir"
						actionListener="#{PedidoControl.excluirProdutoCarrinho}"></h:commandButton>
				</rich:column>
			</rich:dataTable>
			<h:commandButton action="comprar" value="Finalizar a compra"></h:commandButton>
		</h:form>
	</f:view>
</body>
</html>