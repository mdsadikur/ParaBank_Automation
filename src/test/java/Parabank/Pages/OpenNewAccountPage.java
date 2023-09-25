package Parabank.Pages;

import Parabank.BaseParaBank;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenNewAccountPage extends BaseParaBank {

    @FindBy(xpath = "//input[@class=\"button\"]")
    WebElement openAccountbtn;

    @FindBy(id = "newAccountId")
    WebElement NewId;

    public OpenNewAccountPage() {
        PageFactory.initElements(driver, this);
    }

    public OpenNewAccountPage clickopenAccountbtn() {
        openAccountbtn.isDisplayed();
        openAccountbtn.click();
        return this;
    }

//public boolean showNewAccountId(){
//    NewAccountId.isDisplayed();
//    NewAccountId.getText();
//    System.out.println(NewAccountId);
//    return NewAccountId.;
//}

    public boolean hasNewAccountId() {
        return NewId.isDisplayed();
    }
}
