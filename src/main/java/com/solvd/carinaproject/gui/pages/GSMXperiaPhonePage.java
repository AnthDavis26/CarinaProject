package com.solvd.carinaproject.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class GSMXperiaPhonePage extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"specs-list\"]/table[5]/tbody/tr[1]/td[2]")
    private ExtendedWebElement osText;

    @FindBy(xpath = "//*[@id=\"specs-list\"]/table[6]/tbody/tr[2]/td[2]")
    private ExtendedWebElement memoryCapacityText;

    @FindBy(xpath = "//*[@id=\"specs-list\"]/table[9]/tbody/tr[1]/td[2]")
    private ExtendedWebElement loudspeakerText;

    @FindBy(xpath = "//*[@id=\"specs-list\"]/table[9]/tbody/tr[2]/td[2]")
    private ExtendedWebElement hasJackText;

    @FindBy(xpath = "//*[@id=\"specs-list\"]/table[9]/tbody/tr[3]/td[2]")
    private ExtendedWebElement soundDetailsText;

    public GSMXperiaPhonePage(WebDriver driver) {
        super(driver);
    }

    public String getOSText() {
        return osText.getText();
    }

    public String getMemoryCapacityText() {
        return memoryCapacityText.getText();
    }

    public String getLoudspeakerText() {
        return loudspeakerText.getText();
    }

    public String getHasJackText() {
        return hasJackText.getText();
    }

    public String getSoundDetailsText() {
        return soundDetailsText.getText();
    }
}
