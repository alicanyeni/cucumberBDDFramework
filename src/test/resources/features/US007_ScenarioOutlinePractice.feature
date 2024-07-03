Feature: Scenario Outline Practice

  Scenario Outline: TC001 ConfigReader ile ScenarioOutline Kullanimi
    Given kullanici "<arananURL>" sayfasina gider
    Then Kullanici 2 saniye bekler
    When Url in "<istenenURL>" oldugunu test eder
    And user closed page
    Examples:
      | arananURL | istenenURL |
      | amazonURL | amazon     |
      | faceURL   | facebook   |
      | googleURL | google     |
      | brcURL    | blue       |
