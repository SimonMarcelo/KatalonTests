package changeTypeOfUser

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

public class ChangeTypeOfUserInteractions {

	def cambiarUsuarioSegunSector(String sector) {

		WebUI.waitForElementPresent(findTestObject('Page_Listado de Oportunidades  TIMON/i_Simon, Marcelo_fas fa-arrow-alt-circle-right'),
				4)

		WebUI.click(findTestObject('Object Repository/Page_Listado de Oportunidades  TIMON/a_Usuarios'))

		WebUI.click(findTestObject('Object Repository/Page_Listado de Oportunidades  TIMON/a_Usuarios_1'))

		WebUI.navigateToUrl('https://desworkflow.ecosistemasinfo.com/Usuario')

		WebUI.click(findTestObject('Object Repository/Page_Listado de usuarios  TIMON/a_3'))

		WebUI.click(findTestObject('Object Repository/Page_Listado de usuarios  TIMON/i_Si_fas fa-pencil-alt'))

		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Editar Usuario  TIMON/select_SeleccioneComercialPreventaOperacion_d80c01'),
				sector, true)

		WebUI.click(findTestObject('Object Repository/Page_Editar Usuario  TIMON/input_Volver_btn btn-info'))
	}
}
