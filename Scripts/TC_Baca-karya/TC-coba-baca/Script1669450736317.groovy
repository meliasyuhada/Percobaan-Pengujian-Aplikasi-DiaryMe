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

WebUI.navigateToUrl('http://project-ubah.open/')

WebUI.maximizeWindow()

WebUI.takeFullPageScreenshot([])

WebUI.click(findTestObject('Object Repository/Baca-karya p3/coba-baca/Page_DiaryMe/a_Mulai Membaca'))

WebUI.takeFullPageScreenshot([])

WebUI.scrollToPosition(6, 0)

WebUI.click(findTestObject('Object Repository/Baca-karya p3/coba-baca/Page_DiaryMe/img_css_img-fluid'))

WebUI.takeFullPageScreenshot([])

WebUI.scrollToPosition(6, 0)

WebUI.takeFullPageScreenshot([])

WebUI.click(findTestObject('Object Repository/Baca-karya p3/coba-baca/Page_cekunah/i_DiaryMe_bi bi-linkedin'))

