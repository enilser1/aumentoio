package com.prima.paginas;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;

import com.prima.base.Base;

public class VerificarApertura extends Base{
	
	By textoConfirmacionCuentaMetas = By.xpath("//span[@color='primary' and contains(text(), 'Felicidades')]");
	public VerificarApertura(String url) {
		super(url);
	}
	
	public String verificarEncabezado(String texto) throws InterruptedException {		
		String textoEncabezado=getText(textoConfirmacionCuentaMetas);			
		return textoEncabezado;
	
	}	

}
