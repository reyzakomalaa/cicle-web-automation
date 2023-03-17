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

    @And("user click Create in Home page")
    public void userClickCreateInHomePage() {
        wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.elementToBeClickable(elementHome.getBtnCreateNewCompany()));
        driver.findElement(elementHome.getBtnCreateNewCompany()).click();
    }

    @When("user click Add New Member icon on Home page")
    public void userClickAddNewMemberIconOnHomePage() {
        wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.elementToBeClickable(elementHome.getBtnAddMember()));
        driver.findElement(elementHome.getBtnAddMember()).click();
    }

    @And("user click Invite button")
    public void userClickInviteButton() {
        wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.elementToBeClickable(elementHome.getBtnInviteMember()));
        driver.findElement(elementHome.getBtnInviteMember()).click();
    }

    @And("user fill Member Email")
    public void userFillMemberEmail() {
        wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.elementToBeClickable(elementHome.getFieldEmail()));
        driver.findElement(elementHome.getFieldEmail()).sendKeys("dummy1.reyza@gmail.com");
    }

    @And("user click Send")
    public void userClickSend() {
        wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.elementToBeClickable(elementHome.getBtnInviteSubmit()));
        driver.findElement(elementHome.getBtnInviteSubmit()).click();

    }

    @Then("show toaster success invitation has been sent")
    public void showToasterSuccessInvitationHasBeenSent() {
        wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(element.getToastSuccess()));
        driver.findElement(element.getToastSuccess()).isDisplayed();
    }

    @Then("user will see HQ section Empty State")
    public void userWillSeeHQSectionEmptyState() {
        
    }

    @Then("user will see Team section Empty State")
    public void userWillSeeTeamSectionEmptyState() {
        
    }

    @Then("user will see Project section Empty State")
    public void userWillSeeProjectSectionEmptyState() {
    }
}
