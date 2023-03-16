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
}
