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

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/input_Username_username'), 
    'Admin')

WebUI.setEncryptedText(findTestObject('Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/input_Password_password'), 
    'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/a_Recruitment'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/input'), 
    'a')

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/input_Keywords_oxd-input oxd-input--focus'), 
    '11')

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/input_Date of Application_oxd-input oxd-inp_9a6d9a'), 
    '')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/input_Date of Application_oxd-input oxd-inp_9a6d9a'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/div_2'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/input_Date of Application_oxd-input oxd-inp_7472ab'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/div_3'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/input_Date of Application_oxd-input oxd-inp_7472ab'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/div_4'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/i_-- Select --_oxd-icon bi-caret-up-fill ox_627fec'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/button_Search'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/Page_OrangeHRM/h5_Candidates'))

WebUI.closeBrowser()

