package com.guru99.demo.hook;

import com.guru99.demo.common.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hook extends Browser {
    public static Scenario scenario;

    @Before
    public void setUp(Scenario scenario){
        this.scenario = scenario;

        launchBrowser("Chrome");
    }

    @After
    public void tearDwon(){
        try{
            if (scenario.isFailed()){
                byte [] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach("screenshot", "image/png", scenario.getName());
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        //closeBrowser();
    }
}
