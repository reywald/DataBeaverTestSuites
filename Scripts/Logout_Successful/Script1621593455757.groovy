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

WebUI.navigateToUrl('http://23.22.151.143/login')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_DataBeaver/h1_Please sign in'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_DataBeaver/button_Sign inWorking'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_DataBeaver/span_Dont have an account, Register'))

WebUI.setText(findTestObject('Object Repository/Page_DataBeaver/input_Email address_email'), 'iaweepingsaint@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_DataBeaver/input_Password_password'), 'sYikAVI3Sh+8Q6t1jsgX5sYe7pPYOs65')

WebUI.click(findTestObject('Object Repository/Page_DataBeaver/button_Sign inWorking'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_DataBeaver/h1_Forms'), 0)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_DataBeaver/button_Add New'), 0)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_DataBeaver/button_Profile'), 0)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_DataBeaver/nav_Forms      Entries      Insight      Se_c6d13f'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_DataBeaver/button_Profile'))

WebUI.click(findTestObject('Object Repository/Page_DataBeaver/a_Logout'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_DataBeaver/button_Sign inWorking'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_DataBeaver/h1_Please sign in'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_DataBeaver/input_Email address_email'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_DataBeaver/input_Password_password'))

WebUI.closeBrowser()

