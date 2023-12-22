@regression
Feature: Search functionality

  @author_Priyanka_Gajera @smoke @Sanity
  Scenario Outline: Search the buy car with model
    Given I am on homepage
    When I mouse hover on "buy + sell" tab
    And I click Search Cars link
    Then I navigate to new and used car search page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<make>" in results
    Examples:
      | make   | model    | location       | price    |
      | Audi   | A1       | NT - South     | $40,000  |
      | BMW    | 420d     | NSW - All      | $60,000  |
      | Honda  | Accord   | ACT - All      | $70,000  |
      | Kia    | Carnival | VIC - Northern | $50,000  |
      | Suzuki | Ignis    | WA - Perth     | $90,000  |
      | Volvo  | EX30     | ACT - All      | $100,000 |

  @author_Priyanka_Gajera  @Smoke
  Scenario Outline: Search the used car with model
    Given I am on homepage
    When I mouse hover on "buy + sell" tab
    And I click Used link
    Then I navigate to Used Cars For Sale page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<make>" in results
    Examples:
      | make   | model    | location       | price    |
      | Audi   | A1       | NT - South     | $40,000  |
      | BMW    | 420d     | NSW - All      | $60,000  |
      | Honda  | Accord   | ACT - All      | $70,000  |
      | Kia    | Carnival | VIC - Northern | $50,000  |
      | Suzuki | Ignis    | WA - Perth     | $90,000  |
      | Volvo  | EX30     | ACT - All      | $100,000 |
      | Yamaha | Mt-09    | NT - South     | $100,000 |