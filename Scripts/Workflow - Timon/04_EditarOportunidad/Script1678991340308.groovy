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
    'msimon@ecosistemas.com.ar')

WebUI.sendKeys(findTestObject('Object Repository/Page_Inicia sesin Cuentas de Google/input_ecosistemasinfo.com_identifier'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Inicia sesin Cuentas de Google/input_Se han producido demasiados intentos _9b645a'), 
    4)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Inicia sesin Cuentas de Google/input_Se han producido demasiados intentos _9b645a'), 
    'xeCmpPM2QBmDTlt+zppesg==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Inicia sesin Cuentas de Google/input_Se han producido demasiados intentos _9b645a'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Listado de Oportunidades  TIMON/i_Simon, Marcelo_fas fa-arrow-alt-circle-right'), 
    4)

WebUI.click(findTestObject('Object Repository/Page_Listado de Oportunidades  TIMON/i_Simon, Marcelo_fas fa-pencil-alt'))

WebUI.navigateToUrl('https://desworkflow.ecosistemasinfo.com/OportunidadPreventa/Edit/85')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Editar Oportunidad  TIMON/select_Seleccione3MC S.A. (OneInfo Consulti_06eaa6'), 
    '14', true)

WebUI.click(findTestObject('Object Repository/Page_Editar Oportunidad  TIMON/input_Tecnologa_Tecnologia'))

WebUI.setText(findTestObject('Object Repository/Page_Editar Oportunidad  TIMON/input_Tecnologa_Tecnologia'), 'Ejemplo de Tecnología')

WebUI.setText(findTestObject('Object Repository/Page_Editar Oportunidad  TIMON/input_Presupuesto del proveedor_Presupuesto_96d2fe'), 
    '0123')

WebUI.setText(findTestObject('Object Repository/Page_Editar Oportunidad  TIMON/input_Valor hora proveedor_ValorHora'), '0223')

WebUI.setText(findTestObject('Object Repository/Page_Editar Oportunidad  TIMON/input_Monto mensual presupuestado_MontoMens_635ec3'), 
    '0444')

WebUI.setText(findTestObject('Object Repository/Page_Editar Oportunidad  TIMON/input_Monto total presupuestado_MontoTotalP_9a481a'), 
    '0555')

WebUI.setText(findTestObject('Object Repository/Page_Editar Oportunidad  TIMON/input_Valor hora del servicio_ValorHoraDelServicio'), 
    '0666')

WebUI.click(findTestObject('Object Repository/Page_Editar Oportunidad  TIMON/input_Volver_btn btn-info'))

