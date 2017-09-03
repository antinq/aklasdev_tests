package MyTests.StepsDef;

import MyTests.Elements;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Login {
    Elements elements = new Elements();


    @Given("^I entered to LogIn page$")
    public void i_entered_to_LogIn_page(){
        elements.openBrowser();
        elements.goToPage("https://github.com/");
        elements.clickOnButtonByXpath("/html/body/div[1]/header/div/div/div/span/div/a[1]");
    }

    @When("^I enter \"([^\"]*)\" to textfield Username or email adress$")
    public void i_enter_to_textfield_Username_or_email_adress(String arg1){
        elements.enterTextToFieldByXpath("//*[@id=\"login_field\"]", arg1);
    }

    @When("^I enter \"([^\"]*)\"  to textfield Password$")
    public void i_enter_to_textfield_Password(String arg1){
        elements.enterTextToFieldByXpath("//*[@id=\"password\"]", arg1);
    }

    @When("^Click button Sign in$")
    public void click_button_Sign_in(){
        elements.clickOnButtonByXpath("//*[@id=\"login\"]/form/div[4]/input[3]");
    }

    @When("^I press dropdown item Create New Repository$")
    public void i_press_dropdown_item_Create_New_Repository(){
        elements.clickOnButtonByXpath("//*[@id=\"js-pjax-container\"]/div[1]/div/div/a[2]");
    }

    @When("^I enter \"([^\"]*)\"$")
    public void i_enter(String arg1){
        elements.enterTextToFieldByXpath("//*[@id=\"repository_name\"]", arg1);
    }

    @Then("^I should see: Learn Git and GitHub without any code!$")
    public void i_should_see_Learn_Git_and_GitHub_without_any_code(){
        Assert.assertEquals("Learn Git and GitHub without any code!", elements.getElementTextByXpath("//*[@id=\"js-pjax-container\"]/div[1]/div/div/h2"));
        elements.closeBrowser();
    }

    @Then("^I should: see Incorrect login or password$")
    public void i_should_see_Incorrect_login_or_password() {
        Assert.assertNotNull(elements.getElementByXpath("//*[@id=\"js-flash-container\"]/div/div"));
        elements.closeBrowser();
    }

    @When("^I press button Create Repository$")
    public void i_press_button_Create_Repository() throws InterruptedException {
        elements.clickOnButtonByXpath("//*[@id=\"repository_public_true\"]");
        elements.clickOnButtonByCSSselector("#new_repository > div.with-permission-fields > button");
    }

    @Then("^I should see: \"([^\"]*)\"$")
    public void i_should_see(String arg1){
        Assert.assertEquals(arg1, elements.getElementTextByXpath("//*[@id=\"js-repo-pjax-container\"]/div[1]/div[1]/h1/strong/a"));
        elements.closeBrowser();
    }
}
