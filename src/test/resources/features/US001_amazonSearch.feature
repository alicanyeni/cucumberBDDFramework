Feature: Amazon Search Test

  Scenario: TC01 user searchBox test
    Given user goes to amazon page
    When user searches for iphone
    Then user tests results include iphone