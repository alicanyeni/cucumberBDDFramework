Feature: HerokuApp Delete Testi

  Scenario: TC01 herokuApp adresinden delete butonu calismali
    Given Kullanici "herokuappURL" anasayfasina gider
    And Add Element butonuna tiklar
    And Kullanici 1 saniye bekler
    Then Delete butonu gorunur oluncaya kadar bekler
    And Delete butonununu gorunur oldugunu test eder
    Then Delete butonuna tiklar
    And Delete butonunun gorunmedigini test eder
    And user closed page
