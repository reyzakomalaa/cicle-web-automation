package object;

import org.openqa.selenium.By;

public class pageHome {
    public By txtCompanyName(String companyName){
        By homeCompanyName = By.xpath("//p[contains(text(), '" + companyName + "')]");
        return homeCompanyName;
    }

    By btnAddHQ = By.xpath("//*[@id = 'root']/div[3]/div[1]/div[2]/div[2]/div/img");

    public By getBtnAddHQ() {
        return btnAddHQ;
    }

    By btnAddTeam = By.xpath("//*[@id = 'root']/div[3]/div[3]/div[2]/div[2]/div/img");

    public By getBtnAddTeam() {
        return btnAddTeam;
    }

    By btnAddProject = By.xpath("//*[@id = 'root']/div[3]/div[5]/div[2]/div[2]/div/img");

    public By getBtnAddProject() {
        return btnAddProject;
    }

    By avatarMe = By.xpath("//img[@class = 'ImageMember_image__x7ApH']");

    public By getAvatarMe() {
        return avatarMe;
    }

    By btnLogout = By.xpath("//*[@data-testid = 'ExitToAppIcon']");

    public By getBtnLogout() {
        return btnLogout;
    }

    By btnCreateNewCompany = By.xpath("//div[contains(text(), 'Create')]");

    public By getBtnCreateNewCompany() {
        return btnCreateNewCompany;
    }

    By btnAddMember = By.xpath("//*[@id = 'root']/div[2]/div[1]/div[2]");

    public By getBtnAddMember() {
        return btnAddMember;
    }

    By btnInviteMember = By.xpath("//h1[contains(text(), 'Invite')]");

    public By getBtnInviteMember() {
        return btnInviteMember;
    }

    By fieldEmail = By.xpath("//textarea[@name = 'emails']");

    public By getFieldEmail() {
        return fieldEmail;
    }

    By btnInviteSubmit = By.xpath("//*[@id = 'root']/div[3]/div[1]/div[2]/div/div[4]/button/div");

    public By getBtnInviteSubmit() {
        return btnInviteSubmit;
    }

    By emptyStateHQ = By.xpath("//h1[contains(text(), 'Create a new Headquarter')]");

    public By getEmptyStateHQ() {
        return emptyStateHQ;
    }

    By emptyStateTeam = By.xpath("//h1[contains(text(), 'Create a new Team')]");

    public By getEmptyStateTeam() {
        return emptyStateTeam;
    }

    By emptyStateProject = By.xpath("//h1[contains(text(), 'You can create a Project too')]");

    public By getEmptyStateProject() {
        return emptyStateProject;
    }
}
