package step;

import config.env;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

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
    public void after(){
        driver.quit();
    }
}
