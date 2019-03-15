import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.0.28:4200/')

WebUI.setText(findTestObject('Object Repository/TC01_OR/Page_2020/input_ 2020 Delivery Limited 2019_username'), 'sangeethakesavan@jmangroup.com')

WebUI.setEncryptedText(findTestObject('Object Repository/TC01_OR/Page_2020/input_ 2020 Delivery Limited 2019_password'), 
    'R2dZ4hvJ2ujoDGjQ2cClHw==')

WebUI.click(findTestObject('Object Repository/TC01_OR/Page_2020/button_Login'))

WebUI.closeBrowser()

