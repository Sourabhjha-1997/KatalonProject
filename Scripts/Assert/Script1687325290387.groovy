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

WebUI.navigateToUrl('https://demo.guru99.com/')

WebUI.setText(findTestObject('Object Repository/Page_Guru99 Bank Home Page/input_Email ID_emailid'), 'Sourabh@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Guru99 Bank Home Page/input_Email ID_btnLogin'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Guru99 Bank Home Page/h2_Access details to demo site'), 'Access details to demo site.')

WebUI.click(findTestObject('Object Repository/Page_Guru99 Bank Home Page/a_Agile Project'))

WebUI.click(findTestObject('Object Repository/Page_Guru99 Bank Home Page/div_Close'))

WebUI.setText(findTestObject('Object Repository/Page_Guru99 Bank Home Page/input_UserID_uid'), 'Sourabh@gm')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Guru99 Bank Home Page/input_Password_password'), 'TlUUc/Ntq0oLjR/yrcHCzA==')

WebUI.click(findTestObject('Object Repository/Page_Guru99 Bank Home Page/input_Email ID_btnLogin'))

WebUI.click(findTestObject('Object Repository/Page_Guru99 Bank Home Page/li_UserID  1303'))

WebUI.click(findTestObject('Object Repository/Page_Guru99 Bank Home Page/li_UserID  1303'))

WebUI.setText(findTestObject('Object Repository/Page_Guru99 Bank Home Page/input_UserID_uid'), '1303')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Guru99 Bank Home Page/input_Password_password'), 'q1A45N6MPWc=')

WebUI.click(findTestObject('Object Repository/Page_Guru99 Bank Home Page/input_Email ID_btnLogin'))

WebUI.click(findTestObject('Object Repository/Page_Guru99 Bank Customer HomePage/a_Mini Statement'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Guru99 Bank Mini Statement Page/select_Select Account                      _780d18'), 
    '3308', true)

WebUI.click(findTestObject('Object Repository/Page_Guru99 Bank Mini Statement Page/input_Account No_AccSubmit'))

