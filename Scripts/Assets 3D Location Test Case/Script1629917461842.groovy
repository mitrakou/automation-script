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

WebUI.waitForPageLoad(2000)

WebUI.waitForElementVisible(findTestObject('New Add Asset Icon Test Object'), 2000)

WebUI.click(findTestObject('New Add Asset Icon Test Object'))

WebUI.waitForElementVisible(findTestObject('Add Asset Popup Test Object'), 1000)

WebUI.click(findTestObject('Add 3D Asset Upload Test Object'))

WebUI.waitForPageLoad(2000)

WebUI.waitForElementVisible(findTestObject('3D Location Tab Test Object'), 1000)

WebUI.click(findTestObject('3D Location Tab Test Object'))

WebUI.waitForElementVisible(findTestObject('3D Location Upload Test Object'), 2000)

WebUI.uploadFile(findTestObject('3D Location Upload Test Object'), 'F:\\Koushik Dump\\DUMP_KM\\Geogram\\Unity\\GltfObjects\\room2')

WebUI.setText(findTestObject('3D Location Name Test Object'), 'KoushikAutomatedLocation')

WebUI.setText(findTestObject('3D Location Address Test Object'), 'Automated 3D Room')

WebUI.setText(findTestObject('3D Location Address City Test Object'), 'Montreal')

WebUI.setText(findTestObject('3D Location State Test Object'), 'Quebec')

WebUI.setText(findTestObject('3D Location Zip Test Object'), 'zip_code')

WebUI.selectOptionByIndex(findTestObject('3D Location Country Test Object'), 'Canada', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('3D Object ID Test Object'), '101')

WebUI.setText(findTestObject('3D Location Owner Test Object'), 'QA Team')

WebUI.setText(findTestObject('3D Location SKU Test Object'), 'TEST SKU')

WebUI.setText(findTestObject('3D Location Notes Test Object'), 'Test Note for #D Location ')

WebUI.click(findTestObject('3D Location Continue Button Test Object'))

