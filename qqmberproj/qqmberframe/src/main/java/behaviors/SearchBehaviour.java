package behaviors;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mysupersteps.SearchSteps;

public class SearchBehaviour
{
    SearchSteps steps = new SearchSteps();

    @Given("^I am at google home page$")
    public void beAtGoogle()
    {
        steps.navigateToGoogle();
    }

    @When("^I enter search term '(.+)'$")
    public void enterTerm(String term)
    {
        steps.searchForTerm(term);
    }

    @Then("^I see '(.+)'$")
    public void seeStuff(String searchResult) {

    }

}
