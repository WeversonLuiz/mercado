<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://richfaces.org/a4j" prefix="a4j"%>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<html>

<head>
</head>
<body>
	<%@include file="menu.jsp"%>
	<f:view>
		<h:form>
			<h:messages></h:messages>
			<rich:panel>
				<f:facet name="header">
					<h:outputText value="Cadastro de Cliente" />
				</f:facet>
				<h:panelGrid columns="2">
					<h:outputText value="Email" />
					<h:inputText validator="#{ClienteControl.cliente.email}" />
					<h:outputText value="Nome" />
					<h:inputText value="#{ClienteControl.cliente.nome}" />
					<h:outputText value="CEP" />
					<h:panelGroup>
						<h:inputText value="#{ClienteControl.cepString}" />
						<h:commandButton actionListener="#{ClienteControl.consultarCep}"
							value="Consultar" />
					</h:panelGroup>
					<h:outputText value="Senha" />
					<h:inputSecret value="#{ClienteControl.cliente.senha}" />
					<h:outputText value="Senha novamente" />
					<h:inputSecret value="#{ClienteControl.senha}" />
					<h:outputText value="Logradouro" />
					<h:inputText value="#{ClienteControl.cliente.cep.logradouro }" />
					<h:outputText value="Bairro" />
					<h:inputText value="#{ClienteControl.cliente.cep.bairro}" />
					<h:outputText value="Cidade" />
					<h:inputText value="#{ClienteControl.cliente.cep.municipio.descricao}" />
					<h:commandButton action="#{ClienteControl.confirmarCliente}"
						value="Confirmar" />
				</h:panelGrid>
			</rich:panel>
		</h:form>

	</f:view>
</body>
</html>