package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.AmazonPage;

public class AmazonStepDefinitions {

    AmazonPage amazonPage = new AmazonPage();

    @Given("user text {string} in the searchbox")
    public void user_text_in_the_searchbox(String string) {
        amazonPage.aramaKutusu.sendKeys(string + Keys.ENTER);

    }

    @Then("user text the result count on the console")
    public void user_text_the_result_count_on_the_console() {

        System.out.println(amazonPage.sonucSayisi.getText());

    }

}
