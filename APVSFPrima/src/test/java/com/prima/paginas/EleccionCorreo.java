package com.prima.paginas;

import org.openqa.selenium.By;

import com.prima.base.Base;

public class EleccionCorreo extends Base{
	
	By botonAceptarCorreo = By.xpath("//span[contains(text(),'Mi correo es el mismo')]");
	By botonEditarCorreo = By.xpath("//span[contains(text(),'Editar y actualizar')]");
	By cajatextoCorreo = By.xpath("//input[@accesskey='email']");
	By botonConfirmacion = By.xpath("//button[@id='modalConfirmation']");
	
	
	public EleccionCorreo(String url) {
		super(url);
	}
	
	public void registrarEmail(String email) throws InterruptedException {	
		click(botonEditarCorreo);
		click(cajatextoCorreo);
		clear(cajatextoCorreo);
		sendKeys(email, cajatextoCorreo);
		click(botonConfirmacion);
	}	
	
	public void aceptarEmail() throws InterruptedException {	
		click(botonAceptarCorreo);
	}	

}
