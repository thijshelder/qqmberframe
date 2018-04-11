package behaviors;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import mysupersteps.TrySteps;

public class TryBehavior
{
    @Steps
    TrySteps steps =new TrySteps();

    @Given("^I am thijs$")
    public void beThijs()
    {
        steps.givenThijs();
        // Express the Regexp above with the code you wish you had
    }

    @When("^I add '(.+)' and '(.+)'$")
    public void addTwoNumbers(int anInt, int anotherInt)
    {
        steps.addTwoRandomNumbers(anInt, anotherInt);
    }

    @When("^I multiply '(.+)' by '(.+)'$")
    public void multipLy()
    {}

    @Then("^the result is '(.+)'$")
    public void resultIs(int result)
    {
        steps.assertResult(result);
    }

}
