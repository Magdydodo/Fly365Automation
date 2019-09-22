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
import org.openqa.selenium.Keys as Keys

for (def row = 1; row <= findTestData('mail').getRowNumbers(); row++) {
    WebUI.openBrowser('')

    WebUI.navigateToUrl('https://www.fly365.com/')

    WebUI.click(findTestObject('Object Repository/Page_Fly365 - Search Flights/a_Sign up'))

    WebUI.setText(findTestObject('Object Repository/Page_Fly365 - Register/input_First Name_el-input__inner'), 'anyName')

    WebUI.setText(findTestObject('Object Repository/Page_Fly365 - Register/input_Family Name_el-input__inner'), 'anylastName')

    WebUI.setText(findTestObject('Object Repository/Page_Fly365 - Register/input_Email Address_el-input__inner'), findTestData(
            'mail').getValue(1, row))

    WebUI.setEncryptedText(findTestObject('Object Repository/Page_Fly365 - Register/input_Password_el-input__inner'), 'C4hCeJaX4j+j3oL8ZmyqQA==')

    WebUI.click(findTestObject('Object Repository/Page_Fly365 - Register/button_CREATE ACCOUNT'))
    
		 WebUI.navigateToUrl('https://mailosaur.com')

    WebUI.click(findTestObject('Object Repository/Page_Email Testing for QA  Development Teams  Mailosaur/a_Log in'))

    WebUI.setText(findTestObject('Object Repository/Page_Log in to Your Mailosaur Account/input_Email address_email'), 'mmagdyhanafy@live.com')

    WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log in to Your Mailosaur Account/input_Password_password'), 
        'gU8cVQwaO9nJtY6YH1TiCw==')

    WebUI.click(findTestObject('Object Repository/Page_Log in to Your Mailosaur Account/button_Log in'))

    WebUI.click(findTestObject('Object Repository/Page_Mailboxes - Mailosaur/a_Fly365_AutomationTesting'))

    WebUI.click(findTestObject('Page_Mailboxes - Mailosaur/Page_Mailbox - Mailosaur/div_Verify your email'))

    WebUI.click(findTestObject('Object Repository/Page_Mailbox - Mailosaur/a_Links_1'))

    WebUI.click(findTestObject('Page_Mailboxes - Mailosaur/Page_Mailbox - Mailosaur/a_httpsaufly365comenverify-email97285a2d-c92b-4a33-920e-2a50475d6880UKuafHeMbgeqBnrtJyDv'))

    WebUI.delay(5)

    WebUI.closeBrowser()

    if (row == 1) {
        break
    }
}

