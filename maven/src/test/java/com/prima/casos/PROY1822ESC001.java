package com.prima.casos;

import org.testng.annotations.Test;

import com.prima.base.Base;
import com.prima.paginas.ConfirmacionApertura;
import com.prima.paginas.EleccionCorreo;
import com.prima.paginas.EleccionCuenta;
import com.prima.paginas.EleccionFondo;
import com.prima.paginas.EleccionMeta;
import com.prima.paginas.EleccionProceso;
import com.prima.paginas.EleccionResidenciaFiscal;
import com.prima.paginas.InicioSesion;
import com.prima.paginas.VerificarApertura;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static org.junit.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;

//@SpringBootTest
public class PROY1822ESC001 {

	InicioSesion inicioSesion;
	EleccionProceso eleccionProceso;
	EleccionCuenta eleccionCuenta;
	EleccionCorreo eleccionCorreo;
	EleccionMeta eleccionMeta;
	EleccionFondo eleccionFondo;
	EleccionResidenciaFiscal eleccionResidenciaFiscal;
	ConfirmacionApertura confirmacionApertura;
	VerificarApertura verificarApertura;

	String url1;
	String browserType1;

	/*
	 * @MockBean private ProcedureLegacyRepository procedureLegacyRepository;
	 */

	public String AFFILIATE_ID = "955335XERNR7";

	@BeforeClass
	@Parameters({ "url", "browserType" })
	public void beforeClass(String url, String browserType) {
		this.url1 = url;
		this.browserType1 = browserType;
	}

	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		inicioSesion = new InicioSesion(browserType1);
		eleccionProceso = new EleccionProceso(browserType1);
		eleccionCuenta = new EleccionCuenta(browserType1);
		eleccionCorreo = new EleccionCorreo(browserType1);
		eleccionMeta = new EleccionMeta(browserType1);
		eleccionFondo = new EleccionFondo(browserType1);
		eleccionResidenciaFiscal = new EleccionResidenciaFiscal(browserType1);
		confirmacionApertura = new ConfirmacionApertura(browserType1);
		verificarApertura = new VerificarApertura(browserType1);

		inicioSesion.get(url1);

	}

	@Test
	public void Cuenta_Metas_Residencia_Fiscal_Peru() throws InterruptedException {

		

		/*
		 * inicioSesion.ingresarUsuarioYContrasenia("03063218", "1111");
		 * eleccionProceso.elegirRegistrarCuenta(); eleccionCuenta.elegirCuentaMetas();
		 * eleccionCorreo.registrarEmail("emunoz@soaint.com");
		 * eleccionMeta.elegirMeta("Viajes"); eleccionMeta.llenarMonto("12000");
		 * eleccionMeta.clicSiguiente(); eleccionFondo.elegirFondo("1");
		 * eleccionResidenciaFiscal.elegirResidenciaPeru();
		 * confirmacionApertura.confirmarApertura(); String
		 * texto=verificarApertura.verificarEncabezado("Felicidades");
		 */
		  
          String texto="incorrecto";
		  
		  assertTrue(texto.contains("Felicidades"));
		 

	}



	@AfterMethod
	public void afterMethod() {

		inicioSesion.quit();
	}

	@AfterClass
	public void afterClass() {
		// inicioSesion.close();
	}

}
