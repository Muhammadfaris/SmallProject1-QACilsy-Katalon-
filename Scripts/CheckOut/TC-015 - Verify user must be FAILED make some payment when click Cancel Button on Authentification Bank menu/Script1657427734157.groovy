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

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('E1- Home Page Element/Text Product Title Home Page'), 'Midtrans Pillow')

WebUI.click(findTestObject('E1- Home Page Element/Button Buy Now'))

WebUI.verifyElementText(findTestObject('E2- Shopping Chart Element/Text Shopping Chart'), 'Shopping Cart  ')

WebUI.click(findTestObject('E2- Shopping Chart Element/Button Check Out'))

WebUI.delay(3)

WebUI.switchToFrame(findTestObject('E3 - Frame Payment List Method/Frame Payment List Method'), 0)

WebUI.verifyElementText(findTestObject('E3 - Frame Payment List Method/Text Payment List Title'), 'Select method')

WebUI.click(findTestObject('E3 - Frame Payment List Method/Button Verify Summary Info'))

WebUI.verifyElementText(findTestObject('E3 - Frame Payment List Method/Text Verify Summary Order'), 'Your order')

WebUI.verifyElementText(findTestObject('E3 - Frame Payment List Method/Text Verify Quantity Product Summary Info'), '1  ')

WebUI.verifyElementText(findTestObject('E3 - Frame Payment List Method/Text Verify Pruduct Name Summary Info'), 'Midtrans Pillow')

WebUI.verifyElementText(findTestObject('E3 - Frame Payment List Method/Text Verify Price Pruduct Summary Info'), 'Rp20.000')

WebUI.verifyElementText(findTestObject('E3 - Frame Payment List Method/Text Verify Customer Detail'), 'Customer details')

WebUI.verifyElementText(findTestObject('E3 - Frame Payment List Method/Text Verify Customer Name'), 'Budi sample_last_name')

WebUI.verifyElementText(findTestObject('E3 - Frame Payment List Method/Text Verify Alamat Customer'), 'MidPlaza 2, 4th Floor Jl.Jend.Sudirman Kav.10-11 Jakarta 10220')

WebUI.verifyElementText(findTestObject('E3 - Frame Payment List Method/Text No Telp Customer'), '+6281808466410')

WebUI.click(findTestObject('E3 - Frame Payment List Method/Button Verify Summary Info'))

WebUI.click(findTestObject('E3 - Frame Payment List Method/Button Pay With Credit Card Method'))

WebUI.verifyElementText(findTestObject('E3 - Frame Payment List Method/Text Title after Payment list method'), 'Credit/debit card')

WebUI.click(findTestObject('E3 - Frame Payment List Method/Text Field Credit Card Number'))

WebUI.setText(findTestObject('E3 - Frame Payment List Method/Text Field Credit Card Number'), '4811111111111114')

WebUI.click(findTestObject('E3 - Frame Payment List Method/Text Field Expiration date'))

WebUI.setText(findTestObject('E3 - Frame Payment List Method/Text Field Expiration date'), '0125')

WebUI.click(findTestObject('E3 - Frame Payment List Method/Text Field CVV Number'))

WebUI.setText(findTestObject('E3 - Frame Payment List Method/Text Field CVV Number'), '123')

WebUI.click(findTestObject('E3 - Frame Payment List Method/Button Pay Now Active'))

WebUI.delay(3)

WebUI.switchToFrame(findTestObject('E4 - Frame Issuing Bank/Frame Issuing Bank'), 0)

WebUI.verifyElementText(findTestObject('E4 - Frame Issuing Bank/Text Verify Frame Issuing Bank'), 'Issuing Bank')

WebUI.click(findTestObject('E4 - Frame Issuing Bank/Button Cancel issuing bank'))

WebUI.delay(3)

WebUI.switchToDefaultContent()

WebUI.switchToFrame(findTestObject('E3 - Frame Payment List Method/Frame Payment List Method'), 0)

WebUI.verifyElementText(findTestObject('E3 - Frame Payment List Method/Text Verify Card Decline Proses'), 'Card declined by bank')

WebUI.click(findTestObject('E3 - Frame Payment List Method/Button OK Declined Card'))

WebUI.delay(3)

WebUI.switchToWindowTitle('Sample Store')

WebUI.verifyElementText(findTestObject('E1- Home Page Element/Text Error Notification after declined card'), 'Sorry, something went wrong.')

WebUI.closeBrowser()

