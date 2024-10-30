package com.automation.tests;

import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;

public class BaseTest {

    public BaseTest(){
        DriverManager.createDriver();
        ConfigReader.initConfig();
    }

}
