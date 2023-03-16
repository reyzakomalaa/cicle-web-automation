package config;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class env {
    Faker faker = new Faker();
    protected static WebDriver driver;
    protected static WebDriverWait wait;
    public String randomCompanyName = "Company" + faker.numerify("###");
    public String randomTeamName = faker.animal().name();
    public String companyName;
    public String teamName;

    public String fakerName(){
        String randomName = faker.animal().name();
        return randomName;
    }
    public String fakerDescription(){
        String randomDescription = faker.company().industry();
        return randomDescription;
    }
}
