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
	<%@include file="menu.jsp"%>
	<f:view>
		<h:form>
			<h:messages></h:messages>
			Descrição: <h:inputText value="#{PedidoControl.descricao }"/>
			<h:commandButton actionListener="#{PedidoControl.listarProdutos }"/>
			<rich:dataTable value="#{PedidoControl.produtos }" var="produto" width="700px">
				<f:facet name="header">
					<h:outputText value="Produtos encontrados"/>
				</f:facet>
				
				<rich:column>
					<f:facet name="header">
						<h:outputText value="Foto"/>
					</f:facet>
					<h:graphicImage value="figuras/#{produto.foto }"/>
				</rich:column>
				
				<rich:column>
					<f:facet name="header">
						<h:outputText value="Descrição"/>
					</f:facet>
					<h:graphicImage value="#{produto.descricao }"/>
				</rich:column>
				
				<rich:column>
					<f:facet name="header">
						<h:outputText value="Preço"/>
					</f:facet>
					<h:outputText value="#{produto.preco }">
						<f:convertNumber pattern="###,##0.00"/>
					</h:outputText>
				</rich:column>
				<rich:column>
					<f:facet name="header">
						<h:outputText value="Detalhes"/>
					</f:facet>
					<h:commandButton value="Detalhes" action="detalhes" actionListener="#{PedidoControl.selecionarProdutos }"/>					
				</rich:column>
				
			</rich:dataTable>
		</h:form>
	</f:view>	
</body>
</html>