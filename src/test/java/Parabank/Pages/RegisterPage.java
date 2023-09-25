package Parabank.Pages;

import Parabank.BaseParaBank;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends BaseParaBank {


    @FindBy(name = "customer.firstName")
    WebElement customerFirstName;

    @FindBy(name = "customer.lastName")
    WebElement customerLastName;

    @FindBy(name = "customer.address.street")
    WebElement customerAddress;

    @FindBy(name = "customer.address.city")
    WebElement customerCity;

    @FindBy(name = "customer.address.state")
    WebElement customerState;

    @FindBy(name = "customer.address.zipCode")
    WebElement customerZipcode;

    @FindBy(name = "customer.phoneNumber")
    WebElement customerPhonenumber;

    @FindBy(name = "customer.ssn")
    WebElement customerSSN;

    @FindBy(name = "customer.username")
    WebElement customerUsername;

    @FindBy(name = "customer.password")
    WebElement customerPassword;

    @FindBy(name = "repeatedPassword")
    WebElement customerConfirmPassword;

    @FindBy(xpath = "//input[@value='Register']")
    WebElement createRegisterButton;

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    public RegisterPage fillFirstName(String firstName) {
        customerFirstName.isDisplayed();
        customerFirstName.clear();
        customerFirstName.sendKeys(firstName);
        return this;
    }

    public RegisterPage fillLastName(String lastName) {
        customerLastName.isDisplayed();
        customerFirstName.clear();
        customerLastName.sendKeys(lastName);
        return this;
    }

    public RegisterPage fillcustomerAddress(String title) {
        customerAddress.isDisplayed();
        customerAddress.clear();
        customerAddress.sendKeys(title);
        return this;
    }

    public RegisterPage fillcustomerCity(String city) {
        customerCity.isDisplayed();
        customerCity.clear();
        customerCity.sendKeys(city);
        return this;
    }

    public RegisterPage fillcustomerState(String stateFull) {
        customerState.isDisplayed();
        customerState.clear();
        customerState.sendKeys(stateFull);
        return this;
    }

    public RegisterPage fillcustomerZipcode(String zipCode) {
        customerZipcode.isDisplayed();
        customerZipcode.clear();
        customerZipcode.sendKeys(zipCode);
        return this;
    }

    public RegisterPage fillcustomerPhonenumber(String phone) {
        customerPhonenumber.isDisplayed();
        customerPhonenumber.clear();
        customerPhonenumber.sendKeys(phone);
        return this;
    }

    public RegisterPage fillcustomerSSN(String phone) {
        customerSSN.isDisplayed();
        customerSSN.clear();
        customerSSN.sendKeys(phone);
        return this;
    }

    public RegisterPage fillcustomerUsername(String username) {
        customerUsername.isDisplayed();
        customerUsername.clear();
        customerUsername.sendKeys(username);
        return this;
    }

    public RegisterPage fillcustomerPassword(String password) {
        customerPassword.isDisplayed();
        customerPassword.clear();
        customerPassword.sendKeys(password);
        return this;
    }

    public RegisterPage fillcustomerConfirmPassword(String repeatpassword) {
        customerConfirmPassword.isDisplayed();
        customerConfirmPassword.clear();
        customerConfirmPassword.sendKeys(repeatpassword);
        return this;
    }

    public HomePage clickRegisterBtn() {
        createRegisterButton.isDisplayed();
        createRegisterButton.click();
        return new HomePage();
    }

    public RegisterPage clickcreateRegisterButton() {
        customerConfirmPassword.isDisplayed();
        createRegisterButton.click();
        return this;
    }

}
