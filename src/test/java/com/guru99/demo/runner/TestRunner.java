package com.guru99.demo.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"src/test/java/com/guru99/demo/features"},
        glue = {"com/guru99/demo/hook", "com/guru99/demo/stepdefinitions"},
        // i have removed "("de.monochromata.cucumber.report.PrettyReports:target/pretty-cucumber")"
        plugin = {"pretty", "json:target/report.json",
                    }

       // tags     = "@smokeTest or "


)

public class TestRunner {
}
