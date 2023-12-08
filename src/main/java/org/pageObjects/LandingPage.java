package org.pageObjects;

import org.AbstractComponets.AbstractComponets;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends AbstractComponets {
    WebDriver webdriver;
    //    Constructor to
    public LandingPage(WebDriver webdriver) {
        this.webdriver = webdriver;
        PageFactory.initElements(webdriver, this);
    }

    private @FindBy(id="userEmail")
    WebElement Email;

    private @FindBy(id="userPassword")
    WebElement passwordele;

    private @FindBy(id="login")
    WebElement login;

    public void loginApplication(String email, String password){
        Email.sendKeys(email);
        passwordele.sendKeys(password);
        login.click();
    }
    public void go(){
        webdriver.get("https://rahulshettyacademy.com/client");

    }
}

