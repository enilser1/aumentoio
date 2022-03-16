package com.prima.paginas;

import org.openqa.selenium.By;

import com.prima.base.Base;

public class EleccionCuenta extends Base{
	
	By botonCuentaMetas = By.xpath("(//button[@data-testid='tw-w-full']//span[contains(text(), 'Abrir mi ')])[1]");
	public EleccionCuenta(String url) {
		super(url);
	}
	
	public void elegirCuentaMetas() throws InterruptedException {
		
		//Thread.sleep(3000);
		click(botonCuentaMetas);
		
	}	

}
