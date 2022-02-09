package com.solvd.carinaproject.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class GSMXperiaHomePage extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"body\"]/aside/div[1]/ul/li[5]/a")
    private ExtendedWebElement sonyButton;

    public GSMXperiaHomePage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL("https://www.gsmarena.com/");
    }

    public GSMXperiaSonyPhonesPage getSonyPage() {
        sonyButton.click();
        return new GSMXperiaSonyPhonesPage(driver);
    }
}
