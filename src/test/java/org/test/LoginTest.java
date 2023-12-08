package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pageObjects.LandingPage;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void test() {
        WebDriver webdriver=new ChromeDriver();
        LandingPage landingPage = new LandingPage(webdriver);
        landingPage.go();
        landingPage.loginApplication("manoj", "@ah");
    }

}
