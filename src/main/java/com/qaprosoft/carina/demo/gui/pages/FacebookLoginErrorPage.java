package com.qaprosoft.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class FacebookLoginErrorPage extends AbstractPage {

    @FindBy(xpath = "//*[@id='email_container']/div[2]")
    private ExtendedWebElement errorText;

    public FacebookLoginErrorPage(WebDriver driver) {
        super(driver);
    }

    public String getErrorMessage() {
        return errorText.getText();
    }
}
