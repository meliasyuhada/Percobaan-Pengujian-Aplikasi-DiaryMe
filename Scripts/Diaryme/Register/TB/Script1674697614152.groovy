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

WebUI.navigateToUrl('https://diaryme.site/register')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/DiaryMe-web/register/tb/Page_Laravel/input_Register Form_name'), 'bianka')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/DiaryMe-web/register/tb/Page_Laravel/input_Register Form_email'), 'diaryme.mediary.secret@gmail.com')

WebUI.delay(2)

WebUI.setEncryptedText(findTestObject('Object Repository/DiaryMe-web/register/tb/Page_Laravel/input_Register Form_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.delay(2)

WebUI.setEncryptedText(findTestObject('Object Repository/DiaryMe-web/register/tb/Page_Laravel/input_Register Form_password_confirmation'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.delay(2)

WebUI.takeFullPageScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/DiaryMe-web/register/tb/Page_Laravel/button_Register'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

