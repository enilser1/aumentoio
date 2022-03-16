package com.prima.paginas;



import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;

import com.prima.base.Base;

public class EleccionResidenciaFiscal extends Base{
	

	By cajaEncabezado = By.xpath("//span[contains(text(), 'Apertura de Cuenta')]");
	By residenciaPeru = By.xpath("(//span[@class='box rounded-check'])[1]");
	By residenciaOtrosPaises = By.xpath("(//span[@class='box rounded-check'])[2]");
	By enlaceTerminosYCondiciones = By.xpath("//span[contains(text() ,'Términos y Condiciones') and @font-family='Calibri' and @color='primary']");
	By botonTerminosYCondiciones = By.xpath("//*[@id='modalAgree']");
	By botonSiguiente = By.xpath("//*[@id='next' and not(@disabled)]");
	By botonConfirmacion = By.xpath("//button[@id='modalConfirmation']");
	
	By listaPaises=By.xpath("//span[contains(text() ,'País')]");
	By elegirPais=By.xpath("//li[contains(text() ,'AFGANISTAN')]");
	By listaDocumentos=By.xpath("//span[contains(text() ,'Tipo de doc')]");
	By elegirDocumento=By.xpath("//li[contains(text() ,'Número de Identificación')]");
	By cajaDocumento = By.xpath("//input[@name='documentNumber']");
	By botonRegistrarResidencia = By.xpath("//button[@id='go-next-button']");
	
	
	
	
	public EleccionResidenciaFiscal(String url) {
		super(url);
	}
	
	public void elegirResidenciaPeru() {
		click(residenciaPeru);
		click(enlaceTerminosYCondiciones);
		click(botonTerminosYCondiciones);
		click(botonSiguiente);
		//click(botonConfirmacion);
	}
	
	public void elegirOtrosPaises() {
		click(residenciaOtrosPaises);
		click(enlaceTerminosYCondiciones);
		click(botonTerminosYCondiciones);
		click(botonSiguiente);
		
		click(listaPaises);
		click(elegirPais);
		click(listaDocumentos);
		click(elegirDocumento);
		sendKeys("5402245", cajaDocumento);
		click(botonRegistrarResidencia);		
		click(botonSiguiente);
		//click(botonConfirmacion);
	}
	
	public void verificarEncabezado(String texto) throws InterruptedException {		
		String textoEncabezado=getText(cajaEncabezado);
		assertTrue(textoEncabezado.contains(texto));
	
	}	

	

}
