package selenium.tests;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AmazonStepDefinitions {

    @Steps
    AmazonTestSteps amazonTestSteps;

    @Given("^I navigate to Amazon web page$")
    public void iNavigateToAmazonWebPage() {
        amazonTestSteps.navigateToAmazonPage();
    }

    @And("^I verify that Amazon web page was opened$")
    public void iVerifyThatAmazonWebPageWasOpened() throws Throwable {
        amazonTestSteps.iVerifyThatAmazonWebPageWasOpened();
    }

    @When("^I search for \"([^\"]*)\"$")
    public void iSearchFor(String inputValue) throws Throwable {
        amazonTestSteps.iSearchFor(inputValue);
    }

    @And("^I verify that minimum \"([^\"]*)\" search results were shown$")
    public void iVerifyThatMinimumSearchResultsWereShown(int numberOfExpectedSearchResults) throws Throwable {
        amazonTestSteps.iVerifyThatMinimumSearchResultsWereShown(numberOfExpectedSearchResults);
    }

    @Then("^I save first \"([^\"]*)\" search results and print them in console$")
    public void iSaveFirstSearchResultsAndPrintThemInConsole(int numberOfSearchResultsToBeSaved) throws Throwable {
        amazonTestSteps.iSaveFirstSearchResults(numberOfSearchResultsToBeSaved);
    }
}

