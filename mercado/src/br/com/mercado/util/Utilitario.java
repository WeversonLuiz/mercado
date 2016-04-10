package br.com.mercado.util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class Utilitario {
	
	static public void addMessagemFaces(String msg){
		FacesContext context = FacesContext.getCurrentInstance();
		FacesMessage mensagem = new FacesMessage(msg);
	}

}
