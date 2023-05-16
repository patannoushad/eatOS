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

WebUI.navigateToUrl('https://dashboard.eatos.com/#/account/login')

WebUI.setText(findTestObject('Object Repository/WebLogin/Page_eatOS POS Inc/input_Email_email'), 'ime69286@omeie.com')

WebUI.setEncryptedText(findTestObject('Object Repository/WebLogin/Page_eatOS POS Inc/input_Password_form-control pwd-in ng-untou_6c5235'), 
    'pb9BmB31/imjxIbDNHYwAQ==')

WebUI.click(findTestObject('Object Repository/WebLogin/Page_eatOS POS Inc/button_Log In'))

WebUI.verifyElementPresent(findTestObject('Page_eatOS POS Inc/h5_Home'), 5)

WebUI.closeBrowser()

