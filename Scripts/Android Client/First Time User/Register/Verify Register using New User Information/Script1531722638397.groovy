import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication(GlobalVariable.apk_location, false)

Mobile.tap(findTestObject('Android Client/First Time User/Register/button_register'), 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Object Repository/Android Client/First Time User/Register/field_frontName'), 'Budi', 0)

Mobile.setText(findTestObject('Object Repository/Android Client/First Time User/Register/field_lastName'), 'Doremi', 0)

Mobile.setText(findTestObject('Object Repository/Android Client/First Time User/Register/field_email'), GlobalVariable.email_client_valid, 0)

Mobile.setText(findTestObject('Object Repository/Android Client/First Time User/Register/field_password'), GlobalVariable.pass_client_valid, 0)

Mobile.tap(findTestObject('Object Repository/Android Client/First Time User/Register/checkbox_agree'), 0)

Mobile.tap(findTestObject('Object Repository/Android Client/First Time User/Register/button_register'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Android Client/First Time User/Register/button_register'), 0)

Mobile.closeApplication()

