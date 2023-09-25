package Parabank.TestCases;

import Parabank.BaseParaBank;
import Parabank.Pages.LoginPage;
import Parabank.Pages.OpenNewAccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenAccountTest extends BaseParaBank {

    public OpenAccountTest(){
        super();
    }

    @Test
    public void openAccountTestShouldSuccess(){

        OpenNewAccountPage openNewAccountPage = new LoginPage()
                .clickUserNamebtn(getUserName())
                .clickPasswordbtn(getPassword())
                .clickLoginbtn()
                .clickOpenAccountLink()
                .clickopenAccountbtn();

//        Assert.assertTrue(openNewAccountPage.hasNewAccountId());

    }
}
