package com.caiata.cucumber;

import com.caiata.utils.ManagementDriver;
import com.caiata.utils.Utility;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.util.Properties;

import static com.caiata.utils.GlobalParameters.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class CucumberAppLogin {

    static private AndroidDriver<?> androidDriver = null;
    static private Properties androidProp = null;
    static private DesiredCapabilities defaultDesiredCapabilities;
    private static CucumberSteps steps = null;

    @Given("start driver app")
    public void beforeAll(){
        defaultDesiredCapabilities = new DesiredCapabilities(new DesiredCapabilities());
        defaultDesiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        defaultDesiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        defaultDesiredCapabilities.setCapability(MobileCapabilityType.APP, RESOURCES_PATH + File.separator +"app" + EXT_ANDROID);

        ManagementDriver.startMobileDriver(defaultDesiredCapabilities);
        androidDriver = ManagementDriver.getAndroidDriver();

        androidProp = new Utility().loadProp("app");
        steps = new CucumberSteps();
    }

    @Given("Login in app")
    public void login(){
        steps.loginAdmin();
    }

    @Then("Verify home page admin")
    public void verifyAdmin(){
        boolean result = androidDriver.findElement(By.id(androidProp.getProperty("id.app.benvenuto"))).isDisplayed();
        if(result){
            assertTrue(result);
        }else{
            fail("Not in home page of 'ADMIN' ");
        }
    }

    @Then("Verify 'benvenuto admin'")
    public void verifyWelcomeAdmin(){
        boolean result = androidDriver.findElement(By.id(androidProp.getProperty("id.app.benvenuto"))).isDisplayed();
        if(result){
            steps.welcomeAdmin();
        }else{
            fail("Not displayed 'Benvenuto Admin'");
        }
    }

    @After
    public void stopDriver(){
        ManagementDriver.stopDriver();
    }


}
