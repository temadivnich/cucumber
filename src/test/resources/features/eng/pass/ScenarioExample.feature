@withdrawal
Feature: Scenario template, Scenario, Scenario Outline

  Scenario: Gherkin can handle collections like LinkedList, ArrayList, and, other
    Given User passes some collection like LinkedList, ArrayList, and, other
    Then Cucumber should print out this collection

  Scenario Template: Scenario Template is a feature of Cucumber
    Given I have scenario template
    When I use examples section
    Then Examples are used from the the table below "<Examples>"
    Examples:
      | Examples |
      | One      |
      | Two      |

  Scenario: It can also handle complex collections
    Given We pass collection like
      | Key       | Value | Bool  |
      | Datatable | 1     | false |
      | as        | 2     | true  |
      | map       | 3     | true  |
    Then Cucumber can put it as a map