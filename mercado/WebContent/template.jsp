<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://richfaces.org/a4j" prefix="a4j"%>
<%@taglib uri="http://richfaces.org/rich" prefix="rich"%>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f"%>
<%@taglib uri="http://java.sun.com/jsf/facelets" prefix="ui"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">


<h:head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</h:head>
<h:body>
	<f:view>
		<!-- <ui:include src="/menu.jsp"/> -->
		<h:outputStylesheet>
        .pic {
            margin-right: 2px;
        }
 
        .barsearch {
            height: 14px;
            width: 100px;
        }
 
        .barsearchbutton {
            border-width: 1px;
           
        }
    </h:outputStylesheet>
 
    <rich:toolbar height="26" itemSeparator="grid">
        <rich:toolbarGroup>
            <h:graphicImage value="/images/icons/create_doc.gif" styleClass="pic" alt="create_doc" />
            <h:graphicImage value="/images/icons/create_folder.gif" styleClass="pic" alt="create_folder" />
            <h:graphicImage value="/images/icons/copy.gif" styleClass="pic" alt="copy" />
        </rich:toolbarGroup>
        <rich:toolbarGroup>
            <h:graphicImage value="/images/icons/save.gif" styleClass="pic" alt="save" />
            <h:graphicImage value="/images/icons/save_as.gif" styleClass="pic" alt="save_all" />
            <h:graphicImage value="/images/icons/save_all.gif" styleClass="pic" alt="save_all" />
        </rich:toolbarGroup>
        <rich:toolbarGroup location="right">
            <h:inputText styleClass="barsearch" />
            <h:commandButton styleClass="barsearchbutton" onclick="return false;" value="Search" />
        </rich:toolbarGroup>
    </rich:toolbar>
 
		<div>
			<ui:insert name="corpo:"/>
		</div>
	</f:view>
</h:body>
</html>