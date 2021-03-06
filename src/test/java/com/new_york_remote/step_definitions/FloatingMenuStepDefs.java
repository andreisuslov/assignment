package com.new_york_remote.step_definitions;

import com.new_york_remote.pages.FloatingMenuPage;
import com.new_york_remote.utilities.ConfigReader;
import com.new_york_remote.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class FloatingMenuStepDefs {
    FloatingMenuPage floatingMenuPage=new FloatingMenuPage();
    @Given("user is on the Floating Menu page")
    public void user_is_on_the_floating_menu_page() {
        String url= ConfigReader.getPropertiesValue("baseUrl");
        Driver.getDriver().get(url+"/floating_menu");
    }




    @When("user scrolls the page")
    public void user_scrolls_the_page() {
        JavascriptExecutor js=(JavascriptExecutor)Driver.getDriver();

js.executeScript("window.scrollBy(0, -750)");

    }
    @Then("the floating menu is still displayed")
    public void the_floating_menu_is_still_displayed() {
        Assert.assertTrue(floatingMenuPage.floatingMenu.isDisplayed());
    }



}
