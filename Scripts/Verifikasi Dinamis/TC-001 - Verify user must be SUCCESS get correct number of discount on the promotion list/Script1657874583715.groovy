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

WebUI.navigateToUrl(' https://demo.midtrans.com/')

WebUI.maximizeWindow()

WebUI.verifyElementText(findTestObject('E1- Home Page Element/Text Product Title Home Page'), 'Midtrans Pillow')

WebUI.click(findTestObject('E1- Home Page Element/Button Buy Now'))

WebUI.verifyElementText(findTestObject('E2- Shopping Chart Element/Text Shopping Chart'), 'Shopping Cart  ')

def inputHargaAwal = "60000";

WebUI.setText(findTestObject('E2- Shopping Chart Element/Input Harga Text Field'), inputHargaAwal)

WebUI.click(findTestObject('E2- Shopping Chart Element/Button Check Out'))

WebUI.switchToFrame(findTestObject('E3 - Frame Payment List Method/Frame Payment List Method'), 0)

WebUI.verifyElementText(findTestObject('E3 - Frame Payment List Method/Text Payment List Title'), 'Select method')

WebUI.click(findTestObject('E3 - Frame Payment List Method/Button Pay With Credit Card Method'))

WebUI.verifyElementText(findTestObject('E3 - Frame Payment List Method/Text Title after Payment list method'), 'Credit/debit card')

WebUI.click(findTestObject('E3 - Frame Payment List Method/Text Field Credit Card Number'))

WebUI.setText(findTestObject('E3 - Frame Payment List Method/Text Field Credit Card Number'), '4811111111111114')

WebUI.click(findTestObject('E3 - Frame Payment List Method/Text Field Expiration date'))

WebUI.setText(findTestObject('E3 - Frame Payment List Method/Text Field Expiration date'), '0125')

WebUI.click(findTestObject('E3 - Frame Payment List Method/Text Field CVV Number'))

WebUI.setText(findTestObject('E3 - Frame Payment List Method/Text Field CVV Number'), '123')

WebUI.click(findTestObject('E3 - Frame Payment List Method/Tab Button Potongan 10 Persen - Demo Promo Engine'))

def diskon;

def hargaDiskon = inputHargaAwal - diskon;


WebUI.verifyElementText(findTestObject('E3 - Frame Payment List Method/Text Amount Header Payment List'), hargaDiskon)

WebUI.click(findTestObject('E3 - Frame Payment List Method/Button Pay Now Active'))

WebUI.delay(3)

WebUI.switchToFrame(findTestObject('E4 - Frame Issuing Bank/Frame Issuing Bank'), 0)

WebUI.verifyElementText(findTestObject('E4 - Frame Issuing Bank/Text Verify Frame Issuing Bank'), 'Issuing Bank')

WebUI.click(findTestObject('E4 - Frame Issuing Bank/Text Field Password Token'))

WebUI.setText(findTestObject('E4 - Frame Issuing Bank/Text Field Password Token'), '112233')

WebUI.click(findTestObject('E4 - Frame Issuing Bank/Button OK Confirmation'))

WebUI.delay(6)

WebUI.switchToWindowTitle('Sample Store')

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('E1- Home Page Element/Frame Home - Text Thank You Purchasing'), 'Thank you for your purchase.')

WebUI.closeBrowser()

