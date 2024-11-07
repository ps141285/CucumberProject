package stepDefinition;

import PageObject.LoginPage;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public class step
{
    WebDriver driver;
    LoginPage lp;

    @Given("User Launch Chrome Browser")
    public void user_launch_chrome_browser()
    {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Driver/chromedriver.exe");


        driver=new ChromeDriver();
        lp=new LoginPage(driver);

    }

    @When("User opens url {string}")
    public void user_opens_url(String url)
    {
        driver.get(url);

    }

    @When("User enters Email as {string} and password is {string}")
    public void user_enters_email_as_and_password_is(String uname, String pwd)
    {
        lp.setTxt_email(uname);
        lp.setTxt_pwd(pwd);
    }

    @When("click on Login")
    public void click_on_login()
    {
        lp.click_login();
    }

    @Then("Page Title should be {string}")
    public void page_title_should_be(String title)
    {
        if (Objects.requireNonNull(driver.getPageSource()).contains("Login was"))
        {
            driver.close();
            Assert.fail();
        }
        else
        {
            Assert.assertEquals(title,driver.getTitle());
        }

    }

    @When("User click on Logout Link")
    public void user_click_on_logout_link()
    {
       lp.click_logout();

    }
    @Then("Page title should be {string}")
    public void pageTitleShouldBe(String title)
    {
        Assert.assertEquals(title,driver.getTitle());

    }

    @Then("Close the browser")
    public void close_the_browser()
    {
        driver.close();

    }


}
