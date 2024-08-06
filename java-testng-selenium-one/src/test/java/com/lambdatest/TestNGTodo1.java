package com.lambdatest;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTodo1 {

    private RemoteWebDriver driver;
    private String Status = "failed";

    @BeforeMethod
    public void setup(Method m, ITestContext ctx) throws MalformedURLException {
//        String username = System.getenv("LT_USERNAME") == null ? "Your LT Username" : System.getenv("LT_USERNAME");
//        String authkey = System.getenv("LT_ACCESS_KEY") == null ? "Your LT AccessKey" : System.getenv("LT_ACCESS_KEY");


        String username = "vaneetb";
        String authkey = "8iwAZa7mEGu7pc41aIkNJpnvHFc5lcIgy1cF4joZatI0lWvP1u";

        String hub = "@hub.lambdatest.com/wd/hub";

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platform", "MacOS Ventura");
       // caps.setCapability("platform", "Windows 10");
        caps.setCapability("browserName", "chrome");
        caps.setCapability("version", "beta");
        caps.setCapability("build", "Olg-CA Build");
        caps.setCapability("name", m.getName() + " - " + this.getClass().getName());
        caps.setCapability("plugin", "git-testng");
        caps.setCapability("fixedIP","10.255.32.122");
        //caps.setCapability("systemLog", true);

        //caps.setCapability("fixedIP","10.130.60.248");
        //caps.setCapability("dedicatedProxy", true);
        //caps.setCapability("seCdp", true);
        //caps.setCapability("fixedIP","10.255.32.118");
        //caps.setCapability("selenium_version","latest");
        //caps.setCapability("driver_version","latest");

//        String[] Tags = new String[] { "Feature", "Falcon", "Severe" };
//        caps.setCapability("tags", Tags);


//        SafariOptions browserOptions = new SafariOptions();
//        browserOptions.setCapability("safari.popups",true);
//        HashMap<String, Object> ltOptions = new HashMap<String, Object>();
//        ltOptions.put("platformName", "MacOS Ventura");
//        ltOptions.put("browserName","Safari");
//        ltOptions.put("browserVersion","16.0");
//        ltOptions.put("build", "Test - 1");
//        ltOptions.put("seCdp", true);
//        ltOptions.put("dedicatedProxy",true);
//        ltOptions.put("fixedIP","10.255.32.118");
//        ltOptions.put("selenium_version", "latest");
//        ltOptions.put("driver_version","latest");
//        ltOptions.put("w3c", true);
//        browserOptions.setCapability("LT:Options", ltOptions);

        driver = new RemoteWebDriver(new URL("https://" + username + ":" + authkey + hub), caps);

    }

    @Test
    public void basicTest() throws InterruptedException, AWTException {
        String spanText;
        System.out.println("Loading Url");

       // driver.get("https://prep.calranch.com/");

//       driver.get("https://qa01-cloud.ferrara.ca");
//
//
//        Thread.sleep(400000);
//
//        driver.findElement(By.id("cookie-policy-notification-accept")).click();
//        Thread.sleep(2000);
//
//        driver.findElement(By.xpath("//*[@id=\"login-button-sign-in-register\"]")).click();
//
//        Thread.sleep(100000);
//
//
//        Thread.sleep(3000);



        driver.get("https://lambdatest.github.io/sample-todo-app/");
        driver.executeScript("lambdatest_executor: {\"action\": \"stepcontext\", \"arguments\": {\"data\": \"Opening WebApp\", \"level\": \"info\"}}");

        driver.get("https://lambdatest.github.io/sample-todo-app/");

        driver.executeScript("lambdatest_executor: {\"action\": \"stepcontext\", \"arguments\": {\"data\": \"Checking List Items\", \"level\": \"info\"}}");

        System.out.println("Checking Box");
        driver.findElement(By.name("li1")).click();

        System.out.println("Checking Another Box");
        driver.findElement(By.name("li2")).click();

        System.out.println("Checking Box");
        driver.findElement(By.name("li3")).click();

        System.out.println("Checking Another Box");
        driver.findElement(By.name("li4")).click();

        driver.executeScript("lambdatest_executor: {\"action\": \"stepcontext\", \"arguments\": {\"data\": \"Adding Items\", \"level\": \"info\"}}");

        driver.findElement(By.id("sampletodotext")).sendKeys(" List Item 6");
        driver.findElement(By.id("addbutton")).click();

        driver.findElement(By.id("sampletodotext")).sendKeys(" List Item 7");
        driver.findElement(By.id("addbutton")).click();

        driver.findElement(By.id("sampletodotext")).sendKeys(" List Item 8");
        driver.findElement(By.id("addbutton")).click();

        driver.executeScript("lambdatest_executor: {\"action\": \"stepcontext\", \"arguments\": {\"data\": \"Checking More Items\", \"level\": \"info\"}}");

        System.out.println("Checking Another Box");
        driver.findElement(By.name("li1")).click();

        System.out.println("Checking Another Box");
        driver.findElement(By.name("li3")).click();

        System.out.println("Checking Another Box");
        driver.findElement(By.name("li7")).click();

        System.out.println("Checking Another Box");
        driver.findElement(By.name("li8")).click();
        Thread.sleep(300);

        driver.executeScript("lambdatest_executor: {\"action\": \"stepcontext\", \"arguments\": {\"data\": \"Adding and Verify List Items\", \"level\": \"info\"}}");
        System.out.println("Entering Text");
        driver.findElement(By.id("sampletodotext")).sendKeys("Get Taste of Lambda and Stick to It");

        driver.findElement(By.id("addbutton")).click();

        System.out.println("Checking Another Box");
        driver.findElement(By.name("li9")).click();

        // Let's also assert that the todo we added is present in the list.




        Status = "passed";
        Thread.sleep(150);

        System.out.println("TestFinished");

    }

    @AfterMethod
    public void tearDown() {
       // driver.executeScript("lambdatest_executor: {\"action\": \"stepcontext\", \"arguments\": {\"data\": \"Adding Test Result and Closing Browser\", \"level\": \"info\"}}");
        driver.executeScript("lambda-status=" + Status);
       // driver.quit();
    }

}