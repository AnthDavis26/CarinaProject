package com.qaprosoft.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class GSMXperiaSonyPhonesPage extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"review-body\"]/div[1]/ul/li[6]")
    private ExtendedWebElement xperiaProLink;


    // Click Xperia 1
    // Assert OS, memory, sound
    @FindBy(xpath = "//*[@id=\"review-body\"]/div[1]/ul/li[12]")
    private ExtendedWebElement xperiaOneLink;

    // Click Sony
    // Click Xperia 5
    @FindBy(xpath = "//*[@id=\"review-body\"]/div[1]/ul/li[11]")
    private ExtendedWebElement xperiaFiveLink;

    public GSMXperiaSonyPhonesPage(WebDriver driver) {
        super(driver);
    }

    public GSMXperiaPhonePage getXperiaProPage() {
        xperiaProLink.click();
        return new GSMXperiaPhonePage(driver);
    }

    public GSMXperiaPhonePage getXperiaOnePage() {
        xperiaOneLink.click();
        return new GSMXperiaPhonePage(driver);
    }

    public GSMXperiaPhonePage getXperiaFivePage() {
        xperiaFiveLink.click();
        return new GSMXperiaPhonePage(driver);
    }
}
