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

WebUI.waitForPageLoad(3000)

WebUI.click(findTestObject('Assets Menu Test Object'))

WebUI.waitForElementVisible(findTestObject('New Add Asset Icon Test Object'), 2000)

WebUI.click(findTestObject('New Add Asset Icon Test Object'))

WebUI.waitForElementVisible(findTestObject('Add Asset Popup Test Object'), 1000)

WebUI.click(findTestObject('Add 3D Asset Upload Test Object'))

WebUI.waitForPageLoad(3000)

WebUI.click(findTestObject('Asset GuideLine Button Test Object'))

WebUI.waitForElementVisible(findTestObject('Asset Guideline Popup OK button Test Object'), 1000)

WebUI.click(findTestObject('Asset Guideline Popup OK button Test Object'))

WebUI.delay(2000)

WebUI.uploadFile(findTestObject('3D Object File Upload Test Object'), 'F:\\Koushik Dump\\DUMP_KM\\Geogram\\Unity\\GltfObjects\\Wooden Chair')

WebUI.setText(findTestObject('3D Object Name Test Object'), 'Automated3DObject')

WebUI.setText(findTestObject('3D Object ID Test Object'), '2001')

WebUI.setText(findTestObject('3D Asset Owner Test Object'), 'Koushik')

WebUI.setText(findTestObject('3D Asset SKU Test Object'), '20')

WebUI.setText(findTestObject('3D Asset Notes Test Object'), 'Automated Test Notes')

WebUI.click(findTestObject('3D Asset Continue Button Test Object'))

WebUI.waitForElementVisible(findTestObject('3D object Upload Back button Test Object'), 2000)

WebUI.waitForPageLoad(2000)

WebUI.click(findTestObject('3D Asset Continue Button Test Object'))

WebUI.waitForElementVisible(findTestObject('3D Object Upload Button Test Object'), 2000)

WebUI.click(findTestObject('3D Object Upload Button Test Object'))

WebUI.waitForPageLoad(2000)

