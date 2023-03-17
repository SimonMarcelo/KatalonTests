package navigate.interactions

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys

public class AddOportunityInteractions {

	def clickOnCreateNewOportunity() {
		WebUI.click(findTestObject('Object Repository/Page_Listado de Oportunidades  TIMON/a_Crear'))
	}

	def selectTypeOfOportunity() {
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Crear  TIMON/select_SeleccioneODMRFP'), '1', true)
	}

	def selectRelationatedOportunity() {
		WebUI.setText(findTestObject('Object Repository/Page_Crear  TIMON/input_Oportunidad Relacionada_NumeroOportun_85649c'),
				'ODM')
		WebUI.click(findTestObject('Object Repository/Page_Crear  TIMON/div_ODM2023001 - Squad testing automatizado'))
	}

	def selectCountry() {
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Crear  TIMON/select_SeleccioneArgentina BrasilMxicoUrugu_1e4540'),
				'1', true)
	}

	def selectCurrency() {
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Crear  TIMON/select_SeleccionePeso ArgentinoRealDolar Am_c6490c'),
				'1', true)
	}

	def selectCustomer() {
		WebUI.setText(findTestObject('Object Repository/Page_Crear  TIMON/input_Datos Cliente_DatosCliente'), 'banco hipotecario')
		WebUI.waitForElementClickable(findTestObject('Page_Crear  TIMON/div_47 - BANCO HIPOTECARIO S.A'), 5)
		WebUI.sendKeys(findTestObject('Object Repository/Page_Crear  TIMON/input_Datos Cliente_DatosCliente'), Keys.chord(Keys.ENTER))
	}

	def completeDescription() {
		WebUI.setText(findTestObject('Object Repository/Page_Crear  TIMON/input_Descripcin_Descripcion'), 'PRUEBA NUEVA OPORTUNIDAD')
	}

	def setElapsedTime() {
		WebUI.setText(findTestObject('Object Repository/Page_Crear  TIMON/input_Duracin en Meses_DuracionMeses'), '12')
	}

	def selectServiceType() {
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Crear  TIMON/select_SeleccioneQuality AssuranceSoftware _129cf6'),
				'1', true)
	}

	def selectPriority() {
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Crear  TIMON/select_BajaMediaAlta'), '2', true)
	}

	def completeDetail() {
		WebUI.setText(findTestObject('Object Repository/Page_Crear  TIMON/textarea_Detalle_Detalle'), 'PRUEBA DE AUTOMATION')
	}

	def clickOnCreate() {
		WebUI.click(findTestObject('Object Repository/Page_Crear  TIMON/input_Volver_BotonCrear'))
	}
}
