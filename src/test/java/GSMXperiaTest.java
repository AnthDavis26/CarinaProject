import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.gui.pages.GSMXperiaHomePage;
import com.qaprosoft.carina.demo.gui.pages.GSMXperiaPhonePage;
import com.qaprosoft.carina.demo.gui.pages.GSMXperiaSonyPhonesPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GSMXperiaTest implements IAbstractTest {

    @Test()
    @MethodOwner(owner = "adavis")
    public void testXperiaPro() {
        GSMXperiaHomePage gp = new GSMXperiaHomePage(getDriver());
        gp.open();
        GSMXperiaSonyPhonesPage gsp = gp.getSonyPage();
        GSMXperiaPhonePage phonePage = gsp.getXperiaProPage();
        Assert.assertEquals(phonePage.getOSText(), "Android 10", "OS mismatch.");
        Assert.assertEquals(phonePage.getLoudspeakerText(), "Yes, with stereo speakers",
                "Loudspeaker mismatch.");
        Assert.assertEquals(phonePage.getHasJackText(), "Yes", "Jack info mismatch.");
        Assert.assertEquals(phonePage.getSoundDetailsText(), "24-bit/192kHz audio", "Sound details mismatch.");
        Assert.assertEquals(phonePage.getMemoryCapacityText(), "512GB 12GB RAM",
                "Memory capacity mismatch.");
    }

    // Click Sony
    // Click Xperia 1
    // Assert OS, memory, sound
    @Test()
    @MethodOwner(owner = "adavis")
    public void testXperia1() {
        GSMXperiaHomePage gp = new GSMXperiaHomePage(getDriver());
        gp.open();
        GSMXperiaSonyPhonesPage gsp = gp.getSonyPage();
        GSMXperiaPhonePage phonePage = gsp.getXperiaOnePage();
        Assert.assertEquals(phonePage.getOSText(), "Android 9.0 (Pie), upgradable to Android 11", "OS mismatch.");
        Assert.assertEquals(phonePage.getLoudspeakerText(), "Yes, with stereo speakers",
                "Loudspeaker mismatch.");
        Assert.assertEquals(phonePage.getHasJackText(), "No", "Jack info mismatch.");
        Assert.assertEquals(phonePage.getSoundDetailsText(), "24-bit/192kHz audio\n" +
                "Dynamic vibration system", "Sound details mismatch.");
        Assert.assertEquals(phonePage.getMemoryCapacityText(), "64GB 6GB RAM, 128GB 6GB RAM",
                "Memory capacity mismatch.");
    }

    @Test()
    @MethodOwner(owner = "adavis")
    public void testXperia5() {
        GSMXperiaHomePage gp = new GSMXperiaHomePage(getDriver());
        gp.open();
        GSMXperiaSonyPhonesPage gsp = gp.getSonyPage();
        GSMXperiaPhonePage phonePage = gsp.getXperiaFivePage();
        Assert.assertEquals(phonePage.getOSText(), "Android 9.0 (Pie), upgradable to Android 11", "OS mismatch.");
        Assert.assertEquals(phonePage.getLoudspeakerText(), "Yes, with stereo speakers",
                "Loudspeaker mismatch.");
        Assert.assertEquals(phonePage.getHasJackText(), "No", "Jack info mismatch.");
        Assert.assertEquals(phonePage.getSoundDetailsText(), "24-bit/192kHz audio\n" +
                "Dynamic vibration system", "Sound details mismatch.");
        Assert.assertEquals(phonePage.getMemoryCapacityText(), "128GB 6GB RAM",
                "Memory capacity mismatch.");
    }

}
