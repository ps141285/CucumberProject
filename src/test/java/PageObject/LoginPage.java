package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
    WebDriver driver;

    public LoginPage(WebDriver driver)
    {
       this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//input[@id=\"Email\"]")
    WebElement txt_email;

    @FindBy(xpath="//input[@id=\"Password\"]")
    WebElement txt_pwd;

    @FindBy(xpath="//button[normalize-space()=\"Log in\"]")
    WebElement btn_login;

    @FindBy(xpath="//a[normalize-space()=\"Logout\"]")
    WebElement lnk_logout;


    public void setTxt_email (String uname)
    {
        txt_email.clear();
        txt_email.sendKeys(uname);
    }
    public void setTxt_pwd(String pwd)
    {
        txt_pwd.clear();
        txt_pwd.sendKeys(pwd);
    }
    public void click_login()
    {
        btn_login.click();
    }
    public void click_logout()
    {
       lnk_logout.click();
    }

}
