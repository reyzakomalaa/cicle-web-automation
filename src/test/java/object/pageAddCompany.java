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

    By fieldCompanyName = By.xpath("//input");

    public By getFieldCompanyName() {
        return fieldCompanyName;
    }

}
