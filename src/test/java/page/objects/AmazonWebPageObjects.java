package page.objects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.amazon.de")

public class AmazonWebPageObjects extends PageObject {
    @FindBy(id = "twotabsearchtextbox")
    WebElementFacade mainSearchInputField;

    public void insertInputValueIntoSearchField(String inputValue) {
        mainSearchInputField.typeAndEnter(inputValue);
        System.out.println("ghg");
    }

    public int getNumberOfShownSearchResults() {
        return getDriver().findElements(By.xpath("//li[starts-with(@id,'result_')]")).size();
    }

    public String getSearchResultInfo(int numberOfSearchResultInWebPage ) {
        return getDriver().findElements(By.xpath("//li[starts-with(@id,'result_" + numberOfSearchResultInWebPage + "')]")).get(0).getText();
    }
}