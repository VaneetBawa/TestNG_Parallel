package com.lambdatest;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTodoMobile {

    private RemoteWebDriver driver;
    private String Status = "failed";

    @BeforeMethod
    public void setup(Method m, ITestContext ctx) throws MalformedURLException {
//        String username = System.getenv("LT_USERNAME") == null ? "Your LT Username" : System.getenv("LT_USERNAME");
//        String authkey = System.getenv("LT_ACCESS_KEY") == null ? "Your LT AccessKey" : System.getenv("LT_ACCESS_KEY");


        String username = "vaneetb";
        String authkey = "8iwAZa7mEGu7pc41aIkNJpnvHFc5lcIgy1cF4joZatI0lWvP1u";

        String hub = "@hub.lambdatest.com/wd/hub";

//        ChromeOptions browserOptions = new ChromeOptions();
//        Map<String, Object> prefs = new HashMap<>();
//        prefs.put("profile.managed_default_content_settings.popups", 2); // Allow geolocation
//        prefs.put("profile.managed_default_content_settings.notifications", 2);
//        browserOptions.setExperimentalOption("prefs", prefs);
//        HashMap<String, Object> ltOptions = new HashMap<String, Object>();
//        ltOptions.put("platformName", "android");
//        ltOptions.put("deviceName","Galaxy.*");
//        ltOptions.put("autoAcceptAlerts", true);
//        ltOptions.put("isRealMobile", true);
//        ltOptions.put("platformVersion","12");
//        ltOptions.put("build", "Test - 1");
//        ltOptions.put("selenium_version", "3.141.0");
//        ltOptions.put("w3c", true);
//        browserOptions.setCapability("LT:Options", ltOptions);
//
//        driver = new RemoteWebDriver(new URL("https://" + username + ":" + authkey + hub), browserOptions);

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "IOS");
        caps.setCapability("deviceName", "iPhone 15");
        caps.setCapability("platformVersion", "15.0");
        caps.setCapability("isRealMobile", false);
        //caps.setCapability("acceptInsecureCerts", true);
        //caps.setCapability("acceptSslCerts", true);
        caps.setCapability("build", "Bayer test");
        caps.setCapability("name", m.getName() + this.getClass().getName());
        caps.setCapability("plugin", "git-testng");
        caps.setCapability("autoAcceptAlerts", true);
//        caps.setCapability("safariIgnoreFraudWarning", true);
//        caps.setCapability("safariAllowPopups", false);

        //caps.setCapability("geoLocation","US/SEA");

        //caps.setCapability("fixedIP","10.243.32.13");

        //caps.setCapability("fixedIP","10.243.33.46");
        //caps.setCapability("udid","R5CWC1X1GHNv");

//        String[] Tags = new String[] { "Feature", "Tag", "Moderate" };
//        caps.setCapability("tags", Tags);

        driver = new RemoteWebDriver(new URL("https://" + username + ":" + authkey + hub), caps);
    }

    @Test
    public void basicTest() throws InterruptedException {
        String spanText;
        System.out.println("Loading Url");
        Thread.sleep(100);


        driver.get("https://dev.channelarrow.com");

        driver.findElement(By.xpath("//input[@name='username' and @placeholder]")).sendKeys("9146406.cbus@bayer.test");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name='password' and @placeholder]")).sendKeys("Monsanto123!");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[contains(@value,'LOG IN')]")).click();

        Thread.sleep(4000);



//        driver.get("https://github.github.io/clipboard-copy-element/examples/");
//
//        driver.findElement(By.xpath("/html/body/main/section[1]/clipboard-copy")).click();
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        String clipboardText = (String) js.executeScript("return navigator.clipboard.readText();");
//        System.out.println(clipboardText);






//        driver.get("https://dev3000.oattravel.com/trips/land-adventures/asia/inside-vietnam/2021/itinerarie[…]id=oat-july-broad-offer-4244_high-rate_svd_video_play&bc=1");
//
//
//        try {
//            driver.switchTo().frame(0);
//            Thread.sleep(1000);
//            driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div//iframe")).click();
//
//            Thread.sleep(5000);
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
//        driver.switchTo().defaultContent();
//        Thread.sleep(10000);
//
//
//        //1ST CODE FOR FETCH THE URL AND THEN CLOSE IT
//
//        WebElement close_button = driver.findElement(By.xpath("//a[@class='gcc-modal-close js-non-hash-modal-close coh js-webpopup-close popup-modal-close initalized' and @title='Close']"));
//        close_button.click();
//        Thread.sleep(5000);
//
//
//        WebDriverWait wait = new WebDriverWait(driver,30);
//        WebElement r = driver.findElement(By.xpath("//button[@class='vjs-big-play-button' and @title='Play Video']"));
//        wait.until(ExpectedConditions.elementToBeClickable(r));
//        r.click();
//
//        Thread.sleep(8000);
//
//        WebElement videoElement = driver.findElement(By.className("ac-lre-player"));
//        // Create an instance of Actions
//        Actions actions = new Actions(driver);
//        // Hover over the video element
//        actions.moveToElement(videoElement).perform();


//        Actions actions = new Actions(driver);
//        WebElement elementLocator = driver.findElement(By.xpath("//*[@id=\"ac-lre-vjs-bXKCsXSgMSrQPYTfbgBqVVw3Ev63ckEB\"]/div[4]"));
//        actions.doubleClick(elementLocator).perform();


//        driver.findElement(By.className("ac-lre-player")).click();
//        Thread.sleep(4000);
//
//       // driver.findElement(By.xpath("//button[contains(@class, 'vjs-fullscreen-control') and @type='button' and @title='Fullscreen']")).click();
//
//
//        WebElement fullscreenButton = driver.findElement(By.cssSelector(".vjs-fullscreen-control.vjs-control.vjs-button"));
//        fullscreenButton.click();


        /*

        driver.get("https://dev3000.oattravel.com/trips/land-adventures/asia/inside-vietnam/2021/itinerarie[…]id=oat-july-broad-offer-4244_high-rate_svd_video_play&bc=1");


        try {
            driver.switchTo().frame(0);
            Thread.sleep(1000);
            driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div//iframe")).click();

            Thread.sleep(5000);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        driver.switchTo().defaultContent();
        Thread.sleep(10000);


        //1ST CODE FOR FETCH THE URL AND THEN CLOSE IT

        WebElement close_button = driver.findElement(By.xpath("//a[@class='gcc-modal-close js-non-hash-modal-close coh js-webpopup-close popup-modal-close initalized' and @title='Close']"));
        close_button.click();
        Thread.sleep(3000);


        WebDriverWait wait = new WebDriverWait(driver,30);
        WebElement r = driver.findElement(By.xpath("//button[@class='vjs-big-play-button' and @title='Play Video']"));
        wait.until(ExpectedConditions.elementToBeClickable(r));
        r.click();


        Thread.sleep(1000);
        driver.findElement(By.id("ac-lre-vjs-5V99Yjb6wKzvK1hszDK71emdaHY1VWeI_html5_api")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[contains(@class, 'vjs-fullscreen-control') and @type='button' and @title='Fullscreen']")).click();


//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("window.scrollTo(0,511.20001220703125)");
//
//
//
//
//        WebElement fullscreenButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ac-lre-vjs-YIF0iaQRV6TpGasJp8GxSIGaQFecSUVa\"]/div[8]/button[3]")));  // Replace with the actual XPATH
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", fullscreenButton);
//
//        // Click the fullscreen button
//        fullscreenButton.click();



//        driver.findElement(By.cssSelector(".vjs-fullscreen-control > .vjs-icon-placeholder")).click();
//        driver.findElement(By.cssSelector(".vjs-fullscreen-control > .vjs-icon-placeholder")).click();
//        driver.findElement(By.cssSelector(".vjs-fullscreen-control > .vjs-icon-placeholder")).click();
//        driver.findElement(By.cssSelector(".vjs-control-bar")).click();
//        driver.findElement(By.cssSelector(".vjs-fullscreen-control > .vjs-icon-placeholder")).click();
//        driver.findElement(By.cssSelector(".vjs-play-control > .vjs-icon-placeholder")).click();

        Thread.sleep(50000);




         */

        // driver.get("https://automation-2wv-chime-f7b0fe5de.cv.streem.team");
//        driver.get("https://www.autozone.com");
//        driver.findElement(By.xpath("//*[@id=\"topHeaderWrapper\"]/div/div/div[3]/div[1]/div/a/div/span"));
//        Thread.sleep(4000);

        /*
        driver.get("https://lambdatest.github.io/sample-todo-app/");



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

        // Let's also assert that the todo we added is present in the list.

        spanText = driver.findElementByXPath("/html/body/div/div/div/ul/li[9]/span").getText();
        Assert.assertEquals("Get Taste of Lambda and Stick to It", spanText);


         */

        Status = "passed";
        Thread.sleep(800);

        System.out.println("TestFinished");

    }

    @AfterMethod
    public void tearDown() {
        driver.executeScript("lambda-status=" + Status);
        driver.quit();
    }

}