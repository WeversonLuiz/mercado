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
			<h:panelGrid columns="2" rendered="#{!ClienteControl.autenticado }">
				<h:outputText value="Email:"></h:outputText>
				<h:inputText value="#{clienteControl.email}"></h:inputText>
				<h:outputText value="Senha:"></h:outputText>
				<h:inputSecret value="#{clienteControl.senha}"></h:inputSecret>
				<h:commandButton actionListener="#{clienteControl.autenticar}"
					value="Entrar"></h:commandButton>
				<h:commandButton action="formularioCliente" value="Fazer Cadastro" />
			</h:panelGrid>
			<h:panelGroup rendered="#{ClienteControl.autenticado }">
				<rich:panel>
					<f:facet name="header">
						<h:outputText value="Seus dados pessoais" />
					</f:facet>
					<h:panelGrid columns="2">
						<h:outputText value="Nome" />
						<h:outputText value="#{clienteControl.cliente.nome}" />
						<h:outputText value="Email" />
						<h:outputText value="#{clienteControl.cliente.email}" />
						<h:outputText value="Logradouro" />
						<h:outputText value="#{clienteControl.cliente.cep.logradouro}" />
						<h:outputText value="Bairro" />
						<h:outputText value="#{clienteControl.cliente.cep.bairro} " />
						<h:outputText value="Municipio" />
						<h:outputText value="#{clienteControl.cliente.cep.municipio.descricao }" />
						<h:commandButton actionListener="#{pedidoControl.confirmarCompra}" value="Confirmar Compra" />
						<h:commandButton action="formularioCliente" value="Alterar Dados" />
					</h:panelGrid>
					<h:commandButton actionListener="#{clienteControl.logout}" value="Sair"></h:commandButton>
				</rich:panel>
			</h:panelGroup>
		</h:form>
	</f:view>
</body>
</html>