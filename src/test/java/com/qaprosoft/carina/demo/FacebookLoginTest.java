package com.qaprosoft.carina.demo;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.gui.pages.FacebookLoginErrorPage;
import com.qaprosoft.carina.demo.gui.pages.FacebookLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FacebookLoginTest implements IAbstractTest {

    @Test()
    @MethodOwner(owner = "adavis")
    public void testFacebookLogin() {
        FacebookLoginPage fbLogin = new FacebookLoginPage(getDriver());
        fbLogin.open();
        FacebookLoginErrorPage fbError = fbLogin.invalidLogin("gkahdkla", "gaskh");
        Assert.assertEquals(fbError.getErrorMessage(),
                "The email or mobile number you entered isn’t connected to an account. Find your account and log in.",
                "Error messages are not equal.");
    }
}
