Feature: Amazon Search Test

  Scenario: TC01 user searchBox test
    Given user goes to amazon page
    When user searches for iphone
    Then user tests results include iphone
    Then user closed page

  Scenario: TC02 user searchBox test
    Given user goes to amazon page
    When user searches for selenium
    Then user tests results include selenium
    Then user closed page

  Scenario: TC03 user searchBox test
    Given user goes to amazon page
    When user searches for java
    Then user tests results include java
    Then user closed page