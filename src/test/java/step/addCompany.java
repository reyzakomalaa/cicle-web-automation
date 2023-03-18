package step;

import config.env;
import io.cucumber.java.en.And;
import object.pageAddCompany;
import object.pageHome;
import object.reuseableObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class addCompany extends env {
    reuseableObject element = new reuseableObject();
    pageAddCompany elementAddCompany = new pageAddCompany();
    pageHome elementHome = new pageHome();
    @Given("user in Welcome page")
    public void user_in_welcome_page() {
        wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.elementToBeClickable(elementAddCompany.getBtnCreateNewCompany()));
        driver.findElement(elementAddCompany.getBtnCreateNewCompany()).isDisplayed();
    }

    @When("user click Create a new Company")
    public void user_click_create_a_new_company() {
        wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.elementToBeClickable(elementAddCompany.getBtnCreateNewCompany()));
        driver.findElement(elementAddCompany.getBtnCreateNewCompany()).click();
    }
    @When("user fill Company Name")
    public void user_fill_company_name() {
        wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.elementToBeClickable(elementAddCompany.getFieldCompanyName()));
        driver.findElement(elementAddCompany.getFieldCompanyName()).sendKeys(randomCompanyName);

        try {
            FileWriter writer = new FileWriter("src/test/resources/files/companyName.txt", false);
            writer.write(randomCompanyName + System.lineSeparator());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Then("show error toaster must be filled name and description")
    public void showErrorToasterMustBeFilledNameAndDescription() {
    }

    @Then("user is in Company Home page")
    public void userIsInCompanyHomePage() throws InterruptedException {
        try {
            Scanner read = new Scanner(new File("src/test/resources/files/companyName.txt"));
            while (read.hasNextLine()) {
                companyName = read.nextLine();

                wait = new WebDriverWait(driver, 10);

                wait.until(ExpectedConditions.visibilityOfElementLocated(elementHome.txtCompanyName(companyName)));
                driver.findElement(elementHome.txtCompanyName(companyName)).isDisplayed();
            }
            Thread.sleep(2000);
            read.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @When("user click Login with Google Account")
    public void userClickLoginWithGoogleAccount() {
        wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.elementToBeClickable(elementAddCompany.getBtnLoginGmail()));
        driver.findElement(elementAddCompany.getBtnLoginGmail()).click();
    }

    @And("user select account")
    public void userSelectAccount() {
        wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.elementToBeClickable(elementAddCompany.getBtnSelectGmailAccount()));
        driver.findElement(elementAddCompany.getBtnSelectGmailAccount()).click();
    }

    @Given("user is in Login page")
    public void userIsInLoginPage() {
        wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.elementToBeClickable(elementAddCompany.getBtnLoginGmail()));
        driver.findElement(elementAddCompany.getBtnLoginGmail()).isDisplayed();
    }

    @When("user click Company icon in Home page")
    public void userClickCompanyIconInHomePage() {
        wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.elementToBeClickable(elementAddCompany.getBtnCompanyIcon()));
        driver.findElement(elementAddCompany.getBtnCompanyIcon()).click();
    }

    @And("user click Add Company icon in Home page")
    public void userClickAddCompanyIconInHomePage() {
        wait = new WebDriverWait(driver,10);

        wait.until(ExpectedConditions.elementToBeClickable(elementAddCompany.getBtnAddCompanyIcon()));
        driver.findElement(elementAddCompany.getBtnAddCompanyIcon()).click();
    }
}
