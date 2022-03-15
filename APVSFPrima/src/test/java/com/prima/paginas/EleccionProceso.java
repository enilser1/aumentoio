package com.prima.paginas;

import org.openqa.selenium.By;
import com.prima.base.Base;

public class EleccionProceso extends Base{
	
	By botonRegistrarCuenta = By.xpath("//h4[contains(text(), 'Aportes Voluntarios')]");
	By botonVerBalance = By.xpath("//div[@class='sc-dsees']");
	public EleccionProceso(String url) {
		super(url);
	}
	
	public void elegirRegistrarCuenta() throws InterruptedException {
		
		//Thread.sleep(3000);
		click(botonRegistrarCuenta);
		
	}
	
public void elegirVerBalance() throws InterruptedException {
		
		Thread.sleep(3000);
		sendKeys("ok", botonVerBalance);
		click(botonVerBalance);
		
	}

	

	
	
	
	

}
