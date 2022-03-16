package com.prima.paginas;

import org.openqa.selenium.By;

import com.prima.base.Base;

public class EleccionMeta extends Base{
	
	By tarjetaMeta;
	By cajaMonto = By.xpath("//*[@*='goalAmount']");
	By botonSiguiente = By.xpath("//*[@id='next' and not(@disabled)]");
	
	public EleccionMeta(String url) {
		super(url);
	}
	
	public void elegirMeta(String goal) throws InterruptedException {		
		//Thread.sleep(2000);
		tarjetaMeta = By.xpath("//span[contains(text(), '"+goal+"')]");
		click(tarjetaMeta);	
	}	
	
	public void llenarMonto(String amount) throws InterruptedException {		
		click(cajaMonto);
		sendKeys(amount, cajaMonto);
	}
	
	public void clicSiguiente() throws InterruptedException {
		
		click(botonSiguiente);
	}

}
