package org.pageObjects;

import org.AbstractComponets.AbstractComponets;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class HomePage extends AbstractComponets {
    WebDriver webdriver;
    //    Constructor to
    public HomePage(WebDriver webdriver) {
        this.webdriver = webdriver;
        PageFactory.initElements(webdriver, this);
    }

    private @FindBy(css=".mb-3")
    List<WebElement> items;



    public void loginApplication(){

    }
}

