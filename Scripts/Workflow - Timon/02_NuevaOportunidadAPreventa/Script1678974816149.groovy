import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://desworkflow.ecosistemasinfo.com/Oportunidad')

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Inicia sesin Cuentas de Google/input_ecosistemasinfo.com_identifier'), 
    4)

WebUI.setText(findTestObject('Object Repository/Page_Inicia sesin Cuentas de Google/input_ecosistemasinfo.com_identifier'), 
    'ecosistemas.prueba@gmail.com')

WebUI.sendKeys(findTestObject('Object Repository/Page_Inicia sesin Cuentas de Google/input_ecosistemasinfo.com_identifier'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Inicia sesin Cuentas de Google/input_Se han producido demasiados intentos _9b645a'), 
    4)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Inicia sesin Cuentas de Google/input_Se han producido demasiados intentos _9b645a'), 
    'cavWDAa0EbnZjXBQ12k5kg==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Inicia sesin Cuentas de Google/input_Se han producido demasiados intentos _9b645a'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('Page_Listado de Oportunidades  TIMON/i_Simon, Marcelo_fas fa-arrow-alt-circle-right'), 
    4)

WebUI.click(findTestObject('Object Repository/Page_Listado de Oportunidades  TIMON/i_Simon, Marcelo_fas fa-arrow-alt-circle-right'))

WebUI.click(findTestObject('Object Repository/Page_Cambiar estado  TIMON/button_Enviar a Preventa'))

WebUI.setText(findTestObject('Object Repository/Page_Cambiar estado  TIMON/input_Comentario_comentario'), 'Comentario para Preventa')

WebUI.click(findTestObject('Object Repository/Page_Cambiar estado  TIMON/input_Cerrar_ConfirmarEnviarAPreventa'))
