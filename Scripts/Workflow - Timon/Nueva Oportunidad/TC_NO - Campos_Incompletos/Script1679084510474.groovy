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

not_run: WebUI.navigateToUrl('https://desworkflow.ecosistemasinfo.com/Oportunidad')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Listado de Oportunidades  TIMON/a_Crear'), 5)

WebUI.click(findTestObject('Object Repository/Page_Listado de Oportunidades  TIMON/a_Crear'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Crear  TIMON/select_SeleccioneODMRFP'), '1', true)

WebUI.setText(findTestObject('Object Repository/Page_Crear  TIMON/input_Oportunidad Relacionada_NumeroOportun_85649c'), 
    'ODM')

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Crear  TIMON/div_ODM2023001 - Squad testing automatizado'), 
    3)

WebUI.click(findTestObject('Object Repository/Page_Crear  TIMON/div_ODM2023001 - Squad testing automatizado'))

WebUI.click(findTestObject('Object Repository/Page_Crear  TIMON/input_Estado_Estado'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Crear  TIMON/select_SeleccioneArgentina BrasilMxicoUrugu_1e4540'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Page_Crear  TIMON/input_Datos Cliente_DatosCliente'), 'banco hipotecario')

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Crear  TIMON/div_47 - BANCO HIPOTECARIO S.A'), 5)

WebUI.sendKeys(findTestObject('Object Repository/Page_Crear  TIMON/input_Datos Cliente_DatosCliente'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_Crear  TIMON/input_Descripcin_Descripcion'), 'PRUEBA NUEVA OPORTUNIDAD')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Crear  TIMON/select_SeleccioneQuality AssuranceSoftware _129cf6'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Crear  TIMON/select_BajaMediaAlta'), '2', true)

WebUI.setText(findTestObject('Object Repository/Page_Crear  TIMON/textarea_Detalle_Detalle'), 'PRUEBA DE AUTOMATION')

WebUI.click(findTestObject('Object Repository/Page_Crear  TIMON/input_Volver_BotonCrear'))

not_run: WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Listado de Oportunidades  TIMON/i_Simon, Marcelo_far fa-trash-alt red-text'), 
    3)

not_run: WebUI.click(findTestObject('Object Repository/Page_Listado de Oportunidades  TIMON/i_Simon, Marcelo_far fa-trash-alt red-text'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Crear  TIMON/span_El campo Moneda es obligatorio'), 3)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Crear  TIMON/span_El campo Duracin en Meses es obligatorio'), 
    3)

