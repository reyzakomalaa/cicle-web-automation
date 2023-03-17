package object;

import org.openqa.selenium.By;

public class pageAddCompany {
    By btnLoginGmail = By.xpath("//p[contains(text(), 'Login with Google Account')]");

    public By getBtnLoginGmail() {
        return btnLoginGmail;
    }

    By fieldEmail = By.xpath("//input[@type = 'email']");

    public By getFieldEmail() {
        return fieldEmail;
    }

    By btnBerikutnya = By.xpath("//span[contains(text(), 'Berikutnya')]");

    public By getBtnBerikutnya() {
        return btnBerikutnya;
    }

    By btnSelectGmailAccount = By.xpath("//div[contains(text(), 'Ken Alex')]");

    public By getBtnSelectGmailAccount() {
        return btnSelectGmailAccount;
    }

    By btnCreateNewCompany = By.xpath("//h1[contains(text(), 'Create a new Company')]");

    public By getBtnCreateNewCompany() {
        return btnCreateNewCompany;
    }

    By fieldCompanyName = By.xpath("//input[@name = 'name']");

    public By getFieldCompanyName() {
        return fieldCompanyName;
    }

    By btnCompanyIcon = By.xpath("//*[@id = 'root']/div[1]/div[2]/div[2]/div/div[2]");

    public By getBtnCompanyIcon() {
        return btnCompanyIcon;
    }

    By btnAddCompanyIcon = By.xpath("//*[@id = 'root']/div[1]/div[2]/div[2]/div[2]/div/div/div/div[1]/div/div[2]");

    public By getBtnAddCompanyIcon() {
        return btnAddCompanyIcon;
    }
}
