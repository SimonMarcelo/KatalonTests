package workflowTimonLogin

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

public class LoginInteractions {

	def enterUsernameAndPressEnter(username) {
		WebUI.waitForElementVisible(findTestObject('Page_Inicia sesin Cuentas de Google/input_ecosistemasinfo.com_identifier'),
				4)
		WebUI.setText(findTestObject('Object Repository/Page_Inicia sesin Cuentas de Google/input_ecosistemasinfo.com_identifier'),
				username)
		WebUI.sendKeys(findTestObject('Page_Inicia sesin Cuentas de Google/input_ecosistemasinfo.com_identifier'), Keys.chord(Keys.ENTER))
	}

	def enterPasswordAndPressEnter(password) {
		WebUI.waitForElementVisible(findTestObject('Page_Inicia sesin Cuentas de Google/input_Se han producido demasiados intentos _9b645a'),
				4)
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Inicia sesin Cuentas de Google/input_Se han producido demasiados intentos _9b645a'),
				password)
		WebUI.sendKeys(findTestObject('Page_Inicia sesin Cuentas de Google/input_Se han producido demasiados intentos _9b645a'),
				Keys.chord(Keys.ENTER))
	}

	def verifyCorrectLogin() {
		WebUI.verifyElementPresent(findTestObject('Page_Listado de Oportunidades  TIMON/a_Crear'), 5)
	}
}
