package com.lambdatest;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class TestNGTodo2 {

    private RemoteWebDriver driver;
    private String Status = "failed";

    @BeforeMethod
    public void setup(Method m, ITestContext ctx) throws MalformedURLException {
//        String username = System.getenv("LT_USERNAME") == null ? "Your LT Username" : System.getenv("LT_USERNAME");
//        String authkey = System.getenv("LT_ACCESS_KEY") == null ? "Your LT AccessKey" : System.getenv("LT_ACCESS_KEY");

        String username = "vaneetb";
        String authkey = "8iwAZa7mEGu7pc41aIkNJpnvHFc5lcIgy1cF4joZatI0lWvP1u";
        
        /*
        Steps to run Smart UI project (https://beta-smartui.lambdatest.com/)
        Step - 1 : Change the hub URL to @beta-smartui-hub.lambdatest.com/wd/hub
        Step - 2 : Add "smartUI.project": "<Project Name>" as a capability above
        Step - 3 : Add "((JavascriptExecutor) driver).executeScript("smartui.takeScreenshot");" code wherever you need to take a screenshot
        Note: for additional capabilities navigate to https://www.lambdatest.com/support/docs/test-settings-options/
        */

        String hub = "@hub.lambdatest.com/wd/hub";

//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("platform", "Windows 10");
//        caps.setCapability("browserName", "chrome");
//        caps.setCapability("version", "latest");
//        caps.setCapability("build", "Frontdoor Build");
//        caps.setCapability("name", m.getName() + this.getClass().getName());
//        caps.setCapability("plugin", "git-testng");
//        caps.setCapability("geoLocation", "US/SEA");
//
//        //caps.setCapability("autoAcceptAlerts","True");
//        //caps.setCapability("tunnel", true);
//
//        String[] Tags = new String[] { "Feature", "Magicleap", "Severe" };
//        caps.setCapability("tags", Tags);

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments(
                "user-agent=Mozilla/5.0 (iPhone; CPU iPhone OS 11_0 like Mac OS X) AppleWebKit/604.1.38 (KHTML, like Gecko) Version/11.0 Mobile/15A372 Safari/604.1",
                "--use-fake-device-for-media-stream",
                "--use-fake-ui-for-media-stream",
                "--disable-gpu",
                "--window-size=390,844"
        );

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(CapabilityType.BROWSER_NAME, "chrome");
        desiredCapabilities.setCapability(CapabilityType.BROWSER_VERSION, "122.0");
        desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
        desiredCapabilities.setCapability("build", "Frontdoor Build");
        desiredCapabilities.setCapability("console", false);
        desiredCapabilities.setCapability("extendedDebuging", true);
        desiredCapabilities.setCapability("headless", false);
        desiredCapabilities.setCapability("network", false);
        desiredCapabilities.setCapability("performance", false);
        desiredCapabilities.setCapability("video", true);
        desiredCapabilities.setCapability("visual", false);
        desiredCapabilities.setCapability("w3c", true);
        desiredCapabilities.setCapability("name","Test - 1");
        desiredCapabilities.setCapability("geoLocation","US/SEA");
        //desiredCapabilities.setCapability("fixedIP","10.130.40.233");



        /*
        ChromeOptions browserOptions = new ChromeOptions();
        HashMap<String, Object> ltOptions = new HashMap<String, Object>();
        ltOptions.put("platformName", "Windows 10");
        ltOptions.put("browserName","chrome");
        ltOptions.put("browserVersion","latest");
        ltOptions.put("build", "Test - 1");
        ltOptions.put("geoLocation","US/SEA");
        ltOptions.put("--window-size","390,844");
        ltOptions.put("w3c", true);
        browserOptions.setCapability("LT:Options", ltOptions);


         */

        driver = new RemoteWebDriver(new URL("https://" + username + ":" + authkey + hub), desiredCapabilities);
    }

    @Test
    public void basicTest() throws InterruptedException {
        String spanText;
        System.out.println("Loading Url");


/*

        driver.get("http://localhost:3000");


        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[@id=*_next*]/div[1]/div/div[1]/form/div[2]/input")).sendKeys("user@brand-e2e.com");
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@id=*_next*]/div[1]/div/div[1]/form/div[3]/input")).sendKeys("Password@123");
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@id=*_next*]/div[1]/div/div[1]/form/button")).click();
//        Thread.sleep(2000);


        WebElement el1 = driver.findElement(By.xpath("//input[@type='email']"));
        el1.click();
        el1.sendKeys("user@brand-e2e.com");

        WebElement el2 = driver.findElement(By.xpath("//input[@type='password']"));
        el2.click();
        el2.sendKeys("Password@123");

        WebElement el3 = driver.findElement(By.xpath("//button[@type='submit']"));
        el3.click();

        Thread.sleep(15000);

        WebElement el4 = driver.findElement(By.xpath("//*[@id='qr-pro-plan-row']/button"));
        el4.click();

        Thread.sleep(900000);

        */



      //  DevTools devTools = ((HasDevTools) driver).getDevTools(); devTools.createSession();

//        DevTools devTools = driver.getDevTools();
//        devTools.createSession();
//
//        // Enable Network tracking
//        devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
//
//        // Add a listener to capture network responses
//        devTools.addListener(Network.responseReceived(), responseReceived -> {
//            Response response = responseReceived.getResponse();
//            String url = response.getUrl();
//            if (url.contains("/relevant-endpoint")) { // Replace with the relevant endpoint
//                System.out.println("URL: " + url);
//                System.out.println("Status: " + response.getStatus());
//                System.out.println("Response Body: " + response.getBody());
//                // Check the response body or headers for the conversation ID
//            }
//        });

        driver.get("https://automation-2wv-chime-f7b0fe5de.cv.streem.team/i/356640871");
        //driver.get("https://automation-2wv-chime-f7b0fe5de.cv.streem.team/i/270002210");


        //driver.get("https://www.lambdatest.com");

        Thread.sleep(30000);

        /*
        System.out.println("Checking Box");
        driver.findElement(By.name("li1")).click();

        System.out.println("Checking Another Box");
        driver.findElement(By.name("li2")).click();

        System.out.println("Checking Box");
        driver.findElement(By.name("li3")).click();

        System.out.println("Checking Another Box");
        driver.findElement(By.name("li4")).click();

        driver.findElement(By.id("sampletodotext")).sendKeys(" List Item 6");
        driver.findElement(By.id("addbutton")).click();

        driver.findElement(By.id("sampletodotext")).sendKeys(" List Item 7");
        driver.findElement(By.id("addbutton")).click();

        driver.findElement(By.id("sampletodotext")).sendKeys(" List Item 8");
        driver.findElement(By.id("addbutton")).click();

        System.out.println("Checking Another Box");
        driver.findElement(By.name("li1")).click();

        System.out.println("Checking Another Box");
        driver.findElement(By.name("li3")).click();

        System.out.println("Checking Another Box");
        driver.findElement(By.name("li7")).click();

        System.out.println("Checking Another Box");
        driver.findElement(By.name("li8")).click();

        System.out.println("Entering Text");
        driver.findElement(By.id("sampletodotext")).sendKeys("Get Taste of Lambda and Stick to It");

        driver.findElement(By.id("addbutton")).click();

        System.out.println("Checking Another Box");
        driver.findElement(By.name("li9")).click();

         */

        // Let's also assert that the todo we added is present in the list.

//        spanText = driver.findElementByXPath("/html/body/div/div/div/ul/li[9]/span").getText();
//        Assert.assertEquals("Get Taste of Lambda and Stick to It", spanText);
//        Status = "passed";



//        WebElement el4 = driver.findElement(By.xpath("//button[@type='submit']"));
//        el4.click();

        System.out.println("TestFinished");

    }

    @AfterMethod
    public void tearDown() {
        //driver.executeScript("lambda-status=" + Status);
        driver.quit();
    }

}