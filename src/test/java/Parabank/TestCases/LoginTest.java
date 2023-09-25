package Parabank.TestCases;

import Parabank.BaseParaBank;
import Parabank.Pages.HomePage;
import Parabank.Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseParaBank {

    public LoginTest(){
        super();
    }

    @Test
    public void loginShouldSuccess(){

        HomePage homePage = new LoginPage()
                .clickUserNamebtn(getUserName())
                .clickPasswordbtn(getPassword())
                .clickLoginbtn();
        Assert.assertTrue(homePage.isLogoutText());
    }
}
