package object;

import org.openqa.selenium.By;

public class reuseableObject {
    By fieldName = By.xpath("//input[@name = 'name']");

    public By getFieldName() {
        return fieldName;
    }

    By fieldDescription = By.xpath("//textarea[@name = 'desc']");

    public By getFieldDescription() {
        return fieldDescription;
    }

    By btnCreate = By.xpath("//h1[contains(text(), 'Create')]");

    public By getBtnCreate() {
        return btnCreate;
    }

    By toastSuccess = By.id("notistack-snackbar");

    public By getToastSuccess() {
        return toastSuccess;
    }

    public By txtTeamName(String teamName){
        By homeTeamName = By.xpath("//div[@class = 'Card_text__22WoI']//h1[contains(text(), '" + teamName + "')]");
        return homeTeamName;
    }
}
