package step;

import config.env;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;

public class hooks extends env {
    @Before
    public void before(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions opt = new ChromeOptions();
        opt.setHeadless(false);
        opt.addArguments("--user-data-dir=C:\\Users\\reyza\\AppData\\Local\\Google\\Chrome\\User Data");
        opt.addArguments("--profile-directory = Default");
        driver = new ChromeDriver(opt);
        driver.get("https://staging.cicle.app");
        driver.manage().window().maximize();
    }

    @After
    public void after(Scenario scenario) throws IOException, InterruptedException {
        String savePhotoFolder;

        Thread.sleep(500);
        if (scenario.isFailed()){
            savePhotoFolder = "/src/test/resources/screenshots/failed/";
        } else {
            savePhotoFolder = "/src/test/resources/screenshots/all/";
        }

        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir") + savePhotoFolder + scenario.getName() + ".png"));

        driver.quit();
    }
}
