package com.prima.paginas;

import org.openqa.selenium.By;

import com.prima.base.Base;

public class ConfirmacionApertura extends Base{

	By botonConfirmacion = By.xpath("//button[@id='modalConfirmation']");
	
	
	public ConfirmacionApertura(String url) {
		super(url);
	}
	
	public void confirmarApertura() throws InterruptedException {	
		click(botonConfirmacion);
	}

}
