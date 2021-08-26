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

WebUI.navigateToUrl('http://cms-development.geogram.co:3000/login')

WebUI.waitForPageLoad(25)

WebUI.click(findTestObject('SignUp Test Object'))

WebUI.waitForPageLoad(4000)

WebUI.setText(findTestObject('SignUp Email Test Object'), 'suman.17biz@gmail.com')

WebUI.setText(findTestObject('SignUp Password Test Object'), 'AbCd@1234')

WebUI.setText(findTestObject('SignUp Confirm Password Test Object'), 'AbCd@1234')

WebUI.click(findTestObject('SignUp TnC Checkbox Test Object'))

WebUI.click(findTestObject('SignUp Free Trial Button Test Object'))

WebUI.waitForPageLoad(2000)

WebUI.setText(findTestObject('Signup Step1 Enter OTP Test Object'), '')

WebUI.click(findTestObject('SignUp Step1 Verify Button Test Object'))

