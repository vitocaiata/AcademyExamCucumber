package com.caiata.utils;

import java.io.File;
import java.net.URL;

public class GlobalParameters {

    public static final String ANDROID                                  = "ANDROID";

    //ESTENSIONI
    public static final String EXT_HTML 								= ".html";
    public static final String EXT_ANDROID 								= ".apk";
    public static final String EXT_XML 									= ".xml";

    //DIRECTORY
    public static final String USER_DIR 								= System.getProperty("user.dir");
    public static final String SRC_DIR 									= USER_DIR + File.separator + "src";
    public static final String MAIN_DIR 								= SRC_DIR + File.separator + "main";

    // SCREENSHOT
    public static final String SCREENSHOT_PATH			 				= USER_DIR + File.separator + "screenshot" + File.separator;
    public static final String RESOURCES_PATH 							= MAIN_DIR + File.separator + "resources";
    public static final String BASE_DRIVER_PATH 						= USER_DIR + File.separator + "driver" + File.separator;
    public static final String PROPERTIES_PATH 							= RESOURCES_PATH + File.separator + "properties";
    public static final String BASE_PATH_APP 							= RESOURCES_PATH + File.separator + "apps";
    public static final String CONFIG_PATH 								= PROPERTIES_PATH + File.separator + "config";

    //APPIUM
    public static final String SERVER_APPIUM                            ="http://127.0.0.1:4723/wd/hub";

    // REPORT
    public static final String REPORT_PATH 			 					= USER_DIR + File.separator + "report";
    public static final String REPORT_CONFIG_XML 	 					= USER_DIR + File.separator + "report_config" + EXT_XML;

}
