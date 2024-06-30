Feature:  Use Background

  Background: Ortak Adimlar
    Given user goes to amazon page

  @scenario1
  Scenario: TC01 user searchBox test
    When user searches for iphone
    Then user tests results include iphone
    Then user closed page

  Scenario: TC02 user searchBox test
    When user searches for selenium
    Then user tests results include selenium
    Then user closed page

  Scenario: TC03 user searchBox test
    When user searches for java
    Then user tests results include java
    And user closed page