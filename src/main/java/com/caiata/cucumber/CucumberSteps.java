package com.caiata.cucumber;

import com.caiata.utils.ManagementDriver;
import com.caiata.utils.Utility;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CucumberSteps {

    private AndroidDriver<?> androidDriver;
    private WebElement webElement;
    private Properties prop;


    public CucumberSteps() {
        this.androidDriver = ManagementDriver.getAndroidDriver();
        this.prop = Utility.loadProp("app");
    }

    /**
     * Metodo per effettuare login
     */
    public void loginAdmin() {
        androidDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS) ;
        androidDriver.findElement(By.id(prop.getProperty("app.id.username"))).sendKeys("admin");
        androidDriver.findElement(By.id(prop.getProperty("app.id.psw"))).sendKeys("admin");
        androidDriver.findElement(By.id(prop.getProperty("app.id.btn.login"))).click();
    }

    /**
     * Metodo per verificare "benvenuto admin"
     */
    public boolean welcomeAdmin(){
        androidDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS) ;
        WebElement element = androidDriver.findElement(By.id(prop.getProperty("id.app.benvenuto")));
        assertEquals(true, element.getText().contains("admin"));
        return true;
    }

    /**
     * Metodo per effettuare login parametrizzato
     * @param user per inserire username
     * @param psw per inserire password
     */
    public void loginParameterized(String user, String psw){
        webElement = androidDriver.findElement(By.id(prop.getProperty("app.id.username")));
        webElement.sendKeys(user);
        androidDriver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS) ;
        webElement = androidDriver.findElement(By.id(prop.getProperty("app.id.psw")));
        webElement.sendKeys(psw);
        androidDriver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS) ;
        androidDriver.findElement(By.id(prop.getProperty("app.id.btn.login"))).click();
    }

    /**
     * Metodo per effettuare login errata con solo username
     */
    public void loginErratoAdmin(){
        androidDriver.findElement(By.id(prop.getProperty("app.id.username"))).sendKeys("admin");
        androidDriver.findElement(By.id(prop.getProperty("app.id.btn.login"))).click();
        androidDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS) ;
    }

    /**
     *  Metodo per effettuare login errata con solo password
     */
    public void loginErratoPsw(){
        androidDriver.findElement(By.id(prop.getProperty("app.id.psw"))).sendKeys("admin");
        androidDriver.findElement(By.id(prop.getProperty("app.id.btn.login"))).click();
        androidDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS) ;
    }

    /**
     * Metodo per effettuare login errata senza username e password
     */
    public void loginErrato(){
        androidDriver.findElement(By.id(prop.getProperty("app.id.btn.login"))).click();
        androidDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS) ;
    }

    /**
     * Metodo per effettuare login come user
     */
    public void loginUser() {
        androidDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS) ;
        androidDriver.findElement(By.id(prop.getProperty("app.id.username"))).sendKeys("user");
        androidDriver.findElement(By.id(prop.getProperty("app.id.psw"))).sendKeys("user");
        androidDriver.findElement(By.id(prop.getProperty("app.id.btn.login"))).click();
    }

    /**
     * Metodo per verificare benvenuto user
     */
    public boolean welcomeUser(){
        androidDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS) ;
        WebElement element = androidDriver.findElement(By.id(prop.getProperty("id.app.benvenuto")));
        assertEquals(true, element.getText().contains("user"));
        return true;
    }

    /**
     * Metodo per verificare tasto reset
     * @param user per inserire username
     * @param psw per inserire password
     */
    public void refresh(String user, String psw){
        webElement = androidDriver.findElement(By.id(prop.getProperty("app.id.username")));
        webElement.sendKeys(user);
        androidDriver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS) ;
        webElement = androidDriver.findElement(By.id(prop.getProperty("app.id.psw")));
        webElement.sendKeys(psw);
        androidDriver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS) ;
        androidDriver.findElement(By.id(prop.getProperty("app.id.btn.reset"))).click();
    }

    /**
     * Metodo per aggiungere un singolo elemento
     */
    public void aggiungiSingoloUtente(){
        androidDriver.findElement(By.id(prop.getProperty("app.id.btn.aggiungi"))).click();
        androidDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS) ;
        androidDriver.findElement(By.id(prop.getProperty("app.id.newUtente"))).sendKeys("Vito");
        androidDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS) ;
        androidDriver.findElement(By.id(prop.getProperty("app.id.btn.aggUtente"))).click();
    }

    /**
     * Metodo per eliminare gli utenti
     */
    public void eliminaUtenti() {
        androidDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS) ;
        androidDriver.findElement(By.id(prop.getProperty("app.id.btn.elimina"))).click();
        androidDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS) ;
        androidDriver.findElement(By.id(prop.getProperty("app.id.btn.si"))).click();
    }

    /**
     * Metodo per ritornare la lista di elementi per aggiunta
     */
    public List<WebElement> lista(){
        androidDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS) ;
        return androidDriver.findElement(By.id(prop.getProperty("id.lista"))).findElements(By.className("android.widget.TextView"));
    }

    /**
     * Metodo per ritornare la lista degli elementi per verificare stringa vuota
     */
    public List<WebElement> listaUser(){
        androidDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS) ;
        return androidDriver.findElement(By.id(prop.getProperty("id.lista"))).findElements(By.className("android.widget.LinearLayout"));
    }

    /**
     * Metodo per scandire la lista e verificare esistenza elementi
     */
    public boolean listaUser(String nome){
        androidDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS) ;
        for(WebElement element : lista()){
            if(element.getText().contains(nome)){
                System.out.println("Nome già esistente.");
                return false;
            }
        }
        return true;
    }

    /**
     * Metodo per scandire la lista e verificare esistenza stringa vuota
     */
    public boolean listaUserRigaVuota(){
        androidDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS) ;
        for(WebElement element : listaUser()){
            if(element.getText().isEmpty()){
                System.out.println("Stringa vuota inserita");
                return true;
            }
        }
        return false;
    }

    /**
     * Metodo per aggiunger elementi
     */
    public void aggiungiUtente(String nome){
        androidDriver.findElement(By.id(prop.getProperty("app.id.btn.aggiungi"))).click();
        androidDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        webElement = androidDriver.findElement(By.id(prop.getProperty("app.id.newUtente")));
        webElement.sendKeys(nome);
        androidDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS) ;
        androidDriver.findElement(By.id(prop.getProperty("app.id.btn.aggUtente"))).click();
    }

    /**
     * Metodo per bottone errore
     */
    public void bottoneErrore(){
        androidDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        androidDriver.findElement(By.id(prop.getProperty("id.btn.error"))).click();
    }

    /**
     * Metodo per bottone indietro
     */
    public void bottoneBack(){
        androidDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        androidDriver.findElement(By.xpath(prop.getProperty("app.xpath.btn.back"))).click();
    }

}