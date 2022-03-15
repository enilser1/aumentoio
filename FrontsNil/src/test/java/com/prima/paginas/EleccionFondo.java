package com.prima.paginas;




import org.openqa.selenium.By;

import com.prima.base.Base;

public class EleccionFondo extends Base{
	
	By tarjetaFondo ;
	By botonSiguiente = By.xpath("//*[@id='next' and not(@disabled)]");

	
	public EleccionFondo(String url) {
		super(url);
	}
	
	public void elegirFondo(String numeroFondo) throws InterruptedException {		
		//Thread.sleep(2000);
		tarjetaFondo = By.xpath("//span[contains(text(), 'Fondo "+numeroFondo+"')]");
		click(tarjetaFondo);
		click(botonSiguiente);
	}		

}
