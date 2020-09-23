package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.FhcTripPage;
import utilities.Driver;

public class FhcTripStepdefinitions {
    FhcTripPage fhcTripPage = new FhcTripPage();

    @Given("user goes to the fhctrip page")
    public void user_goes_to_the_fhctrip_page() {
        Driver.getDriver().get("http://fhctrip-qa.com/Account/Register");
    }

    @Given("user fill the username {string} box")
    public void user_fill_the_username_box(String string) {
        fhcTripPage.usernameKutusu.sendKeys(string);
    }

    @Given("user fill the email {string} box")
    public void user_fill_the_email_box(String string) {
        fhcTripPage.emailKutusu.sendKeys(string);
    }

    @Given("user fill the fullname {string} box")
    public void user_fill_the_fullname_box(String string) {
        fhcTripPage.fullnameKutusu.sendKeys(string);
    }


}
