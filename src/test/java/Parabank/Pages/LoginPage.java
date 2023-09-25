package Parabank.Pages;

import Parabank.BaseParaBank;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseParaBank {

    @FindBy(name = "username")
    WebElement Username;

    @FindBy(name = "password")
    WebElement Password;

    @FindBy(xpath = "//*[@id=\"loginPanel\"]/form/div[3]/input")
    WebElement LoginBtn;

    @FindBy(linkText = "Register")
    WebElement registerBtn;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public LoginPage clickUserNamebtn(String UserName) {
        Username.isDisplayed();
        Username.sendKeys(UserName);
        return this;
    }

    public LoginPage clickPasswordbtn(String PassWord) {
        Password.isDisplayed();
        Password.sendKeys(PassWord);
        return this;
    }

    public HomePage clickLoginbtn() {
        LoginBtn.click();
        return new HomePage();
    }

    public RegisterPage clickregisterBtn() {
        registerBtn.isDisplayed();
        registerBtn.click();
        return new RegisterPage();
    }
}
