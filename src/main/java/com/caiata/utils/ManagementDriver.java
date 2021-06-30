package com.caiata.utils;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

import static com.caiata.utils.GlobalParameters.SERVER_APPIUM;

public class ManagementDriver {

    private static AndroidDriver<?> androidDriver;
    private static MobileDriver mobileDriver;

    /**
     * Metodo per avviare il driver android
     * @param desiredCapabilities sono le nostre Capabilities per avviare Appium
     */
    public static void startMobileDriver(DesiredCapabilities desiredCapabilities){
        try {
            androidDriver = new AndroidDriver<>(new URL(SERVER_APPIUM), desiredCapabilities);
            mobileDriver = androidDriver;
        } catch (Exception e) {
            System.err.println("Errore Mobile Driver " + e.getMessage());
        }
    }

    public static AndroidDriver getAndroidDriver() {
        return androidDriver;
    }

    /**
     * metodo per stoppare il driver e chiudere app
     */
    public static void stopDriver(){
        if(androidDriver!=null) androidDriver.quit();
    }
}