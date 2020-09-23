package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.Driver;

public class GoogleAramaStepDefinitions {
    GooglePage googlePage=new GooglePage();

    @Given("user is on the google page")
    public void user_is_on_the_google_page() {
        System.out.println("Kullanici google gitti");
        Driver.getDriver().get(" https://www.google.com/?hl=en");
    }

    @Given("text techproeducation on the searchbox")
    public void text_techproeducation_on_the_searchbox() {
        System.out.println("kullanici techproeducation yazdi");
     googlePage.aramaKutusu.sendKeys("techproeducation"+Keys.ENTER);
    }

    @Then("verify the search result")
    public void verify_the_search_result() {
        System.out.println("kullanici sayfa basligini test etti");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String baslik=Driver.getDriver().getTitle();
        boolean iceriyormu=baslik.contains("techproeducation");
        Assert.assertTrue(iceriyormu);

    }


    @Given("user text selenium searchbox")
    public void user_text_selenium_searchbox() {
        System.out.println("kullanici sadece selenium yazar");
        googlePage.aramaKutusu.sendKeys("Selenium"+Keys.ENTER);
    }

    @Then("user check the result count")
    public void user_check_the_result_count() {
        System.out.println("kullanici sonuc sayisini test etti");
        String sonucSayisi=googlePage.sonucSayisi.getText();
        System.out.println(sonucSayisi);

    }

    @Given("user searches {string}")
    public void user_searches(String string) {
     googlePage.aramaKutusu.sendKeys(string+Keys.ENTER);


    }

    @Then("user check the {string} on the page title")
    public void user_check_the_on_the_page_title(String string) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
     String baslik=Driver.getDriver().getTitle();
        boolean iceriyormu=baslik.contains(string);
        Assert.assertTrue(iceriyormu);

    }
    @Given("user search {string}")
    public void user_search(String string) {
        googlePage.aramaKutusu.sendKeys(string+Keys.ENTER);

    }

    @Then("user check  {string} on the page title")
    public void user_check_on_the_page_title(String string) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
     String baslik=Driver.getDriver().getTitle();
        Boolean iceriyormu=baslik.contains(string);
       Assert.assertTrue(iceriyormu);


    }



}
