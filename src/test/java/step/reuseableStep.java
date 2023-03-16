package step;

import config.env;
import object.reuseableObject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class reuseableStep extends env {
    reuseableObject element = new reuseableObject();
    @And("user fill Name")
    public void userFillName() {
        wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.elementToBeClickable(element.getFieldName()));
        driver.findElement(element.getFieldName()).sendKeys(fakerName());
    }

    @And("user fill Description")
    public void user_fill_description() {
        wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.elementToBeClickable(element.getFieldDescription()));
        driver.findElement(element.getFieldDescription()).sendKeys(fakerDescription());
    }

    @Then("show toaster success create new Company")
    public void show_toaster_success_create_new_company() {
        wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(element.getToastSuccess()));
        driver.findElement(element.getToastSuccess()).isDisplayed();
    }

    @Then("show created Team name")
    public void showCreatedTeamName() throws InterruptedException {
        try {
            Scanner read = new Scanner(new File("src/test/resources/files/teamName.txt"));
            while (read.hasNextLine()) {
                teamName = read.nextLine();

                wait = new WebDriverWait(driver, 10);

                wait.until(ExpectedConditions.visibilityOfElementLocated(element.txtTeamName(teamName)));
                driver.findElement(element.txtTeamName(teamName)).isDisplayed();
            }
            Thread.sleep(2000);
            read.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
