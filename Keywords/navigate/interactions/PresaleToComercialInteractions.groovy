package navigate

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

public class PresaleToComercialInteractions {

	def clickOnAllOportunities() {
		WebUI.click(findTestObject('Object Repository/Page_Listado de Oportunidades  TIMON/small'))
	}

	def clickOnChangeState() {
		WebUI.click(findTestObject('Object Repository/Page_Listado de Oportunidades  TIMON/i_Simon, Marcelo_fas fa-arrow-alt-circle-right_1'))
	}

	def clickOnSendToCommercial() {
		WebUI.waitForElementVisible(findTestObject('Page_Cambiar estado  TIMON/button_Comercial'), 4)
		//WebUI.click(findTestObject('Object Repository/Page_Cambiar Estado  TIMON/div_Tipo Oportunidad                       _2055a9'))
		WebUI.click(findTestObject('Object Repository/Page_Cambiar Estado  TIMON/button_Comercial'))
	}

	def completeComentaryAndConfirm() {
		WebUI.setText(findTestObject('Object Repository/Page_Cambiar Estado  TIMON/input_Comentario_comentario'), 'Comentario para Comercial')
		WebUI.click(findTestObject('Object Repository/Page_Cambiar Estado  TIMON/input_Cerrar_ConfirmarComercial'))
	}
}

