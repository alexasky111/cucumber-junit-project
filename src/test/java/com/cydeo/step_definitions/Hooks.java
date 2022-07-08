package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

public class Hooks {

    //we want to run this method bf each SCENARIO not each method, like w/ Background:
    //both of them are coming from Cucumber, we want it to be running after each scenario
    //if taking from jUnit it'll be running before each method, we don't need it
    @Before
    public void setUp() {
        System.out.println("--> it is coming from @Before in Hooks");
    }

    @After
    public void tearDownScenario(Scenario scenario) {
        System.out.println("--> it is coming from @After in Hooks");

        //casting 1st, method asks arguments, what type of screenshot you want to get
        //.getScreenshotAs only after casting
        //.getScreenshotAs(OutputType.BYTES); --> instead of giving pixel I want my picture byte by byte
        //if you pick the type of BYTES you have to store it in arr of byte [], bc return type is byte[]
        //bc output type as a Byte then store screenshot in byte[] bc it is a return type of the method .getScreenshotAs(OutputType.BYTES);

        if (scenario.isFailed()) {
            byte[] sceenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(sceenshot, "image/png", scenario.getName()); //.getName() -> gives the name of the scenario

        }
        Driver.closeDriver();
    }

    //scenario.embed(screenshot, "image/png", scenario.getName()); this code is working with 5.6.0 versio
}
