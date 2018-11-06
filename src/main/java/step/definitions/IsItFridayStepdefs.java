package step.definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.time.DayOfWeek;

import static org.junit.Assert.assertEquals;

public class IsItFridayStepdefs {

    private String today;
    private String actualDay;

    private String isItFriday(String today) {
        if (DayOfWeek.FRIDAY.name().equalsIgnoreCase(today))
            return "TGIF";
        else
            return "Nope";
    }

    @Given("^today is \"([^\"]*)\"$")
    public void today_is_Sunday(String arg) {
        today = arg;
        System.out.println("Given Today is: " + today);
    }

    @When("^I ask whether it's Friday yet$")
    public void i_ask_whether_is_s_Friday_yet() {
        actualDay = isItFriday(today);
        System.out.println("When I ask, is it Friday ? ");
    }

    @Then("^I should be told \"([^\"]*)\"$")
    public void i_should_be_told(String arg1) {
        System.out.println("Then I get: " + (today.equalsIgnoreCase(actualDay) ? "TGIF" : "Nope"));
        assertEquals(arg1, actualDay);
    }
}
