package com.qaprosoft.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

public class FacebookLoginPage extends AbstractPage {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @FindBy(id="email")
    private ExtendedWebElement emailInput;

    @FindBy(id="pass")
    private ExtendedWebElement passwordInput;

    @FindBy(name = "login")
    private ExtendedWebElement loginButton;

    public FacebookLoginPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL("https://www.facebook.com");
    }

    public FacebookLoginErrorPage invalidLogin(String email, String password) {
        emailInput.type(email);
        passwordInput.type(password);
        loginButton.click();
        return new FacebookLoginErrorPage(driver);
    }
}
