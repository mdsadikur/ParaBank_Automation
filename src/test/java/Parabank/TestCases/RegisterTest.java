package Parabank.TestCases;

import Parabank.BaseParaBank;
import Parabank.Pages.HomePage;
import Parabank.Pages.LoginPage;
import com.thedeanda.lorem.LoremIpsum;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseParaBank {

    public RegisterTest(){
        super();
    }

    @Test
    public void RegistrationShouldSuccess(){
        String username = LoremIpsum.getInstance().getTitle(3);

        new LoginPage()
                .clickregisterBtn()
                .fillFirstName(LoremIpsum.getInstance().getFirstName())
                .fillLastName(LoremIpsum.getInstance().getLastName())
                .fillcustomerAddress(LoremIpsum.getInstance().getTitle(3))
                .fillcustomerCity(LoremIpsum.getInstance().getCity())
                .fillcustomerState(LoremIpsum.getInstance().getStateFull())
                .fillcustomerZipcode(LoremIpsum.getInstance().getZipCode())
                .fillcustomerPhonenumber(LoremIpsum.getInstance().getPhone())
                .fillcustomerSSN(LoremIpsum.getInstance().getPhone())
                .fillcustomerUsername(username)
                .fillcustomerPassword(username)
                .fillcustomerConfirmPassword(username)
                .clickcreateRegisterButton();


    }
}
