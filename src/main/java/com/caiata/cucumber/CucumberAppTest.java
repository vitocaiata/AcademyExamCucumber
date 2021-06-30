package com.caiata.cucumber;

import com.caiata.utils.ManagementDriver;
import com.caiata.utils.Utility;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static com.caiata.utils.GlobalParameters.EXT_ANDROID;
import static com.caiata.utils.GlobalParameters.RESOURCES_PATH;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class CucumberAppTest {

    static private AndroidDriver<?> androidDriver = null;
    static private Properties androidProp = null;
    static private DesiredCapabilities defaultDesiredCapabilities;
    private static CucumberSteps steps = null;

    @Given("start app")
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

    @Then("Error login only with the username")
    public void errorLogin1(){
        steps.loginErratoAdmin();
        boolean result = androidDriver.findElement(By.id(androidProp.getProperty("id.err.message"))).isDisplayed();
        if(result){
            assertTrue(result);
        }else{
            fail("Not displayed error message");
        }
    }

    @Then("Error login only with the password")
    public void errorLogin2(){
        steps.loginErratoPsw();
        boolean result = androidDriver.findElement(By.id(androidProp.getProperty("id.err.message"))).isDisplayed();
        if(result){
            assertTrue(result);
        }else{
            fail("Not displayed error message");
        }
    }

    @Then("Error login only without username and password")
    public void errorLogin3(){
        steps.loginErrato();
        boolean result = androidDriver.findElement(By.id(androidProp.getProperty("id.err.message"))).isDisplayed();
        if(result){
            assertTrue(result);
        }else{
            fail("Not displayed error message");
        }
    }

    @Then("Login with username 'user'")
    public void loginUser(){
        steps.loginUser();
        boolean result = androidDriver.findElement(By.id(androidProp.getProperty("id.app.benvenuto"))).isDisplayed();
        if(result){
            assertTrue(result);
        }else{
            fail("Login not done");
        }
    }

    @Then("verify welcome user")
    public void welcomeUser(){
        steps.loginUser();
        boolean result = androidDriver.findElement(By.id(androidProp.getProperty("id.app.benvenuto"))).isDisplayed();
        if(result){
            steps.welcomeUser();
        }else{
            fail("Not correct login");
        }
    }

    @Given("^Login user (.*) password (.*) and click refresh btn$")
    public void resetBtn(String user, String psw){
        steps.refresh(user,psw);
    }

    @Given("^Insert user (.*) password (.*)$")
    public void loginWithParameter(String user, String psw){
        steps.loginParameterized(user,psw);
    }

    @Given("add one contact")
    public void addContact(){
        steps.loginAdmin();
        boolean result = androidDriver.findElement(By.id(androidProp.getProperty("id.app.benvenuto"))).isDisplayed();
        if(result){
            steps.aggiungiSingoloUtente();
        }else{
            fail("Login error");
        }
    }

    @When("delete contact after login")
    public void deleteContact(){
        steps.loginAdmin();
        boolean result = androidDriver.findElement(By.id(androidProp.getProperty("id.app.benvenuto"))).isDisplayed();
        if(result) {
            steps.eliminaUtenti();
        }else{
            fail("Error delete");
        }
    }

    @Given("^contact1 (.*) contact2 (.*) contact3 (.*)$")
    public void add3Contact(String nome1, String nome2, String nome3){
        steps.loginAdmin();
        androidDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        steps.aggiungiUtente(nome1);
        androidDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        steps.aggiungiUtente(nome2);
        androidDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        steps.aggiungiUtente(nome3);
    }

    @Given("^add contact1 (.*) contact2 (.*) contact3 (.*) and verify if exist$")
    public void addAndVerify(String nome1, String nome2, String nome3){
        steps.loginAdmin();
        androidDriver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        if(steps.listaUser(nome1)){
            steps.aggiungiUtente(nome1);
        }
        androidDriver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        if(steps.listaUser(nome2)) {
            steps.aggiungiUtente(nome2);
        }
        androidDriver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        if(steps.listaUser(nome3)) {
            steps.aggiungiUtente(nome3);
        }
    }

    @Given("^insert username (.*) password (.*)$")
    public void loginPara(String user, String psw){
        steps.loginParameterized(user, psw);
    }

    @Then("click button errore")
    public void erroreBtn(){
        steps.bottoneErrore();
        androidDriver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        if(!steps.listaUserRigaVuota()){
            fail("Empty line not added");
        }
    }

    @After
    public void stopDriver(){
        ManagementDriver.stopDriver();
    }

}
