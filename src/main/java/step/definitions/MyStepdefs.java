package step.definitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;


public class MyStepdefs {

    private List<String> list;
    private DataTable dataTable;

    @Given("^User passes some collection like (.*)$")
    public void userPassesSomeCollection(List<String> list) {
        this.list = list;
    }

    @Then("^Cucumber should print out this collection$")
    public void cucumberShouldPrintOutCollection() throws Throwable {
        System.out.println("Collection as method parameter:");
        System.out.println(list.toString());
    }

    @Given("^I have scenario template$")
    public void iHaveScenarioTemplate() throws Throwable {
    }

    @When("^I use examples section$")
    public void iUseExamplesSection() throws Throwable {
    }

    @Then("^Examples are used from the the table below \"([^\"]*)\"$")
    public void examplesAreUsedFromTheTheTableBelow(String s) throws Throwable {
    }

    @Then("^Cucumber can put it as a map$")
    public void cucumberCanPutItAsAMap() throws Throwable {
        List<Map<String, String>> table = dataTable.asMaps(String.class, String.class);
        System.out.println("Key: [" + table.get(0).get("Key") + "] Values: " + table.get(0).values());
        System.out.println("Key: [" + table.get(1).get("Key") + "] Values: " + table.get(1).values());
        System.out.println("Key: [" + table.get(2).get("Key") + "] Values: " + table.get(2).values());
    }

    @Given("^We pass collection like$")
    public void wePassCollectionLikeDataTableAsMap(DataTable args) throws Throwable {
        this.dataTable = args;
    }
}
