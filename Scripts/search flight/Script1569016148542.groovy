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

for (def row = 1; row <= findTestData('airportCodes').getRowNumbers(); row++) {
    WebUI.openBrowser('')

    WebUI.navigateToUrl('https://www.fly365.com/')

    WebUI.setText(findTestObject('Object Repository/flyTest/Page_Fly365 - Search Flights/input_Multi City_origin'), findTestData(
            'airportCodes').getValue(1, row))

    WebUI.sendKeys(findTestObject('Object Repository/flyTest/Page_Fly365 - Search Flights/input_Multi City_origin'), Keys.chord(
            Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/flyTest/Page_Fly365 - Search Flights/input_Multi City_destination'), 
        findTestData('airportCodes').getValue(2, row))

    WebUI.sendKeys(findTestObject('Object Repository/flyTest/Page_Fly365 - Search Flights/input_Multi City_destination'), 
        Keys.chord(Keys.ENTER))

    WebUI.sendKeys(findTestObject('Object Repository/Page_Fly365 - Search Flights/input_Multi City_d'), findTestData('airportCodes').getValue(
            3, row))

    WebUI.sendKeys(findTestObject('Object Repository/Page_Fly365 - Search Flights/input_Multi City_d'), Keys.chord(Keys.ENTER))

    WebUI.sendKeys(findTestObject('Object Repository/Page_Fly365 - Search Flights/input_-_a'), findTestData('airportCodes').getValue(
            3, row + 10))

    WebUI.sendKeys(findTestObject('Object Repository/Page_Fly365 - Search Flights/input_-_a'), Keys.chord(Keys.TAB))

    WebUI.click(findTestObject('Page_Fly365 - search-results/Page_Fly365 - Search Flights/div_1 Passengers Economy'))

    WebUI.setText(findTestObject('Page_Fly365 - search-results/Page_Fly365 - Search Flights/Page_Fly365 - Search Flights/input_Adult_adult'), 
        findTestData('airportCodes').getValue(4, row))

    WebUI.setText(findTestObject('Page_Fly365 - search-results/Page_Fly365 - Search Flights/Page_Fly365 - Search Flights/input_Child_child'), 
        findTestData('airportCodes').getValue(5, row))

    WebUI.setText(findTestObject('Page_Fly365 - search-results/Page_Fly365 - Search Flights/Page_Fly365 - Search Flights/input_Infant_infant'), 
        findTestData('airportCodes').getValue(6, row))

    if (row == 2) {
        WebUI.sendKeys(findTestObject('Page_Fly365 - search-results/Page_Fly365 - Search Flights/Page_Fly365 - Search Flights/input_Infant_infant'), 
            Keys.chord(Keys.TAB, Keys.ARROW_DOWN, Keys.TAB, Keys.ENTER))
    }
    
    if (row == 3) {
        WebUI.sendKeys(findTestObject('Page_Fly365 - search-results/Page_Fly365 - Search Flights/Page_Fly365 - Search Flights/input_Infant_infant'), 
            Keys.chord(Keys.TAB, Keys.ARROW_DOWN, Keys.ARROW_DOWN))
    }
    
    if (row == 4) {
        WebUI.sendKeys(findTestObject('Page_Fly365 - search-results/Page_Fly365 - Search Flights/Page_Fly365 - Search Flights/input_Infant_infant'), 
            Keys.chord(Keys.TAB, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN))
    }
    
    WebUI.click(findTestObject('Page_Fly365 - search-results/Page_Fly365 - Search Flights/Page_Fly365 - Search Flights/Page_Fly365 - Search Flights/Page_Fly365 - Search Flights/button_search now'))

    WebUI.delay(7)

    WebUI.closeBrowser()

    if (row == 4) {
        break
    }
}

