# new feature
# Tags: test
@sanity
Feature: XFashionStore

  Scenario: Successful login
    Given I navigate to XFashion homepage
    And I click sign button on home page
    And I login with username test@netomedia.com and password P@ss123456
    And I click on submit button
    Then I verify successful login

  Scenario: Adding item to shop cart
    Given I navigate to XFashion homepage
    And I navigate to printed summer dresses section
    Then I verify that discount is calculated correctly
