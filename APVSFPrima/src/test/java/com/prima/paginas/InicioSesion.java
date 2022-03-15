package com.prima.paginas;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.prima.base.Base;

public class InicioSesion extends Base{
	
	

	By cajaNumeroDocumento = By.xpath("//input[@id='documentNumber'and @class='dropdown-input']");
	By cajaContrasenia = By.xpath("//input[@id='pass']");
	By botonIngresar = By.xpath("//button[contains(text(), 'Ingresar') and not(@disabled)]");

	
	
	public InicioSesion(String url) {
		super(url);
	}
	
	public void ingresarUsuarioYContrasenia(String user,String pass) throws InterruptedException {
		
		Thread.sleep(3000);
		sendKeys(pass,cajaContrasenia);
		click(cajaNumeroDocumento);
		sendKeys(user,cajaNumeroDocumento);
		click(botonIngresar);
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String seleccionarListaDesplegable() {
		WebElement dropDownList=findElement(cajaNumeroDocumento);
		List<WebElement> options=dropDownList.findElements(By.tagName("options"));
		for(int i=0;i<options.size();i++) {
			click(options.get(i));
		}
		
		String selectOption="";
		for(int i=0;i<options.size();i++) {
			if(options.get(i).isSelected()) {
				selectOption=getText(options.get(i));
			}
		}
		return selectOption;
		
	}
	
	
	
	

}
