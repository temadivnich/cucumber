package step.definitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    @Before(order = 10)
    public void prepareDataFirst() {
        System.out.println("----- TEST STARTED -----");
    }

    @Before(order = 20)
    public void prepareDataSecond() {
        System.out.println("\tBefore method was invoked, order 20");
    }

    @After(order = 40)
    public void clearDataFirst(Scenario scenario) {
        System.out.println("\tAfter method was invoked, order 40");
        getScenarioInfo(scenario);
    }

    @After(order = 30)
    public void clearDataSecond(Scenario scenario) {
        System.out.println("----- TEST FINISHED -----");

    }

    private void getScenarioInfo(Scenario scenario) {
        System.out.println(scenario.getId());
        System.out.println(scenario.getName());
        System.out.println(scenario.getStatus());
        System.out.println(scenario.isFailed());
        System.out.println(scenario.getSourceTagNames());
    }
}