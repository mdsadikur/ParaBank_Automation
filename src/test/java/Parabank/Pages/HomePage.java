package Parabank.Pages;

import Parabank.BaseParaBank;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseParaBank {

    @FindBy(xpath = "//*[@id=\"leftPanel\"]/ul/li[8]/a")
    WebElement logoutText;

    @FindBy(linkText = "Open New Account")
    WebElement openNewAccountbtn;

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    public  OpenNewAccountPage clickOpenAccountLink(){
        openNewAccountbtn.isDisplayed();
        openNewAccountbtn.click();
        return new OpenNewAccountPage();
    }
    public boolean isLogoutText()  {
        return logoutText.isDisplayed();
    }
}
