Feature: Scenario Outline Kullanimi

  Scenario Outline: TC01 Kullanici istedigi kelimeleri aratir
    Given user goes to amazon page
    Then kullanici "<istenenKelime>" icin arama yapar
    Then sonuclarin "<istenenKelimeKontrol>" icerdigini kontrol eder
    And user closed page
    Examples:
      | istenenKelime | istenenKelimeKontrol |
      | iphone        | iphone               |
      | selenium      | selenium             |
      | SQL           | SQL                  |