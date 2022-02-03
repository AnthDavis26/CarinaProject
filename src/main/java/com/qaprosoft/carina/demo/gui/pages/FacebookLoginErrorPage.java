package com.qaprosoft.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

public class FacebookLoginErrorPage extends AbstractPage {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @FindBy(xpath = "//*[@id='email_container']/div[2]")
    private ExtendedWebElement errorText;

    public FacebookLoginErrorPage(WebDriver driver) {
        super(driver);
    }

    public String getErrorMessage() {
        return errorText.getText();
    }
}
