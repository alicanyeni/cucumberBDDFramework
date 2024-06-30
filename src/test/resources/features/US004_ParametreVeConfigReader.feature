Feature: Use Parameter and ConfigReader
  @ConfigReader
  Scenario: TC01 Parametre kullaniminda ConfigReader Kullanimi
    Given Kullanici "faceURL" sayfasina gider
    Then Kullanici 2 saniye bekler
    When Url in "facebook" icerdigini test eder
    And User closed page

  Scenario: TC02 Parametre kullaniminda ConfigReader Kullanimi
    Given Kullanici "googleURL" sayfasina gider
    Then Kullanici 2 saniye bekler
    When Url in "google" icerdigini test eder
    And User closed page

  Scenario: TC03 Parametre kullaniminda ConfigReader Kullanimi
    Given Kullanici "amazonURL" sayfasina gider
    Then Kullanici 2 saniye bekler
    When Url in "amazon" icerdigini test eder
    And User closed page