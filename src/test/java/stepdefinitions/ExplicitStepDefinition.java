package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ExplicitPage;
import utilities.Driver;

public class ExplicitStepDefinition {

    ExplicitPage explicitPage=new ExplicitPage();
    @Given("user goes to the {string} that page")
    public void user_goes_to_the_that_page(String string) {
        Driver.getDriver().get(string);


    }

    @Given("user clicks add element button")
    public void user_clicks_add_element_button() {
     explicitPage.addElementButtonu.click();

    }

    @Then("user sees the delete webelement")
    public void user_sees_the_delete_webelement() {
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),30);
        WebElement yeniElement=wait.until
                (ExpectedConditions.visibilityOfElementLocated(By.className("added-manually")));
        System.out.println(yeniElement.getText());

       String icindekiyazi=yeniElement.getText();
       boolean iceriyormu=icindekiyazi.contains("Delete");
        Assert.assertTrue(iceriyormu);

    }



}
