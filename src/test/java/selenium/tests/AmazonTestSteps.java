package selenium.tests;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import page.objects.AmazonWebPageObjects;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;


public class AmazonTestSteps {
    @Managed
    WebDriver driver;

    AmazonWebPageObjects amazonWebPage;

    public void navigateToAmazonPage() {
        amazonWebPage.open();
    }

    @Step
    public void iVerifyThatAmazonWebPageWasOpened() {
        String expectedWebPageTitle = "Amazon.de";
        String actualWebPageTitle = amazonWebPage.getTitle();
        assertThat(actualWebPageTitle).contains(expectedWebPageTitle);
    }

    public void iSearchFor(String inputValue) {
        amazonWebPage.insertInputValueIntoSearchField(inputValue);
    }

    public void iVerifyThatMinimumSearchResultsWereShown(int expectedNumberOfShownSearchResults) {
        int actualNumberOfShownSearchResults = amazonWebPage.getNumberOfShownSearchResults();
        assertThat(actualNumberOfShownSearchResults).isGreaterThanOrEqualTo(expectedNumberOfShownSearchResults);
    }

    public void iSaveFirstSearchResults(int numberOfSearchResultsToBeSaved) {
        ArrayList<String> listOfSearchResults = new ArrayList<String>();
        for (int i = 0; i < numberOfSearchResultsToBeSaved; i++) {
            listOfSearchResults.add(amazonWebPage.getSearchResultInfo(i));
        }
        for (int i = 0; i < numberOfSearchResultsToBeSaved; i++) {
            System.out.println("Search result No. " + (i+1) + ":");
            System.out.println(listOfSearchResults.get(i));
            System.out.println("_________________________");
        }
    }
}