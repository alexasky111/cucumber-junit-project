package com.cydeo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //what kind of file you want to create
        //added LAST plugin for the 3rd party dependency for another type of report
        //dependency is to create new maven cucumber reporting, html is not enough, that's why one of the people created one of the type of reporting
        plugin = {"html:target/cucumber-report.html", "rerun:target/rerun.txt", "me.jvt.cucumber.report.PrettyReports:target/cucumber"},
        //business part
        //run from this class the features folder, that are standing in this location in my framework
        features = "src/test/resources/features", //copy from content root

        //which classes i use to run my tests, step definitions path copy -> implementation layer(java, selenium, verification codes)
        glue = "com/cydeo/step_definitions",
        //will be only running regression once
        dryRun = false,
        tags = ""

        //Hooks is coming 1st
        //then goes to @Before

)
public class CukesRunner {
}
