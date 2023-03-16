package step;

import config.env;
import object.pageHome;
import object.reuseableObject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileWriter;
import java.io.IOException;

public class home extends env {
    reuseableObject element = new reuseableObject();
    pageHome elementHome = new pageHome();
    @When("user click Add HQ icon")
    public void userClickAddHQIcon() {
        wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.elementToBeClickable(elementHome.getBtnAddHQ()));
        driver.findElement(elementHome.getBtnAddHQ()).click();
    }

    @When("user click Add Team icon")
    public void userClickAddTeamIcon() {
        wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.elementToBeClickable(elementHome.getBtnAddTeam()));
        driver.findElement(elementHome.getBtnAddTeam()).click();
    }

    @When("user click Add Project icon")
    public void userClickAddProjectIcon() {
        wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.elementToBeClickable(elementHome.getBtnAddProject()));
        driver.findElement(elementHome.getBtnAddProject()).click();
    }

    @And("user fill Team Name")
    public void userFillTeamName() {
        wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.elementToBeClickable(element.getFieldName()));
        driver.findElement(element.getFieldName()).sendKeys(randomTeamName);

        try {
            FileWriter writer = new FileWriter("src/test/resources/files/teamName.txt", false);
            writer.write(randomTeamName + System.lineSeparator());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @When("user click Avatar of Me")
    public void userClickAvatarOfMe() {
        wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.elementToBeClickable(elementHome.getAvatarMe()));
        driver.findElement(elementHome.getAvatarMe()).click();
    }

    @And("user click Logout icon")
    public void userClickLogoutIcon() {
        wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.elementToBeClickable(elementHome.getBtnLogout()));
        driver.findElement(elementHome.getBtnLogout()).click();
    }
}
