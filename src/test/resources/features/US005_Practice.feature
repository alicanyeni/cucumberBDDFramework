Feature: Practice

  @Practice
  Scenario: TC01 Kullanici gecerli bilgilerle giris testi yapar
    Given Kullanici "brcURL" anasayfasina gider
    And Kullanici 2 saniye bekler
    Then Login yazisina tiklar
    And Kullanici 2 saniye bekler
    And Kullanici gecersiz username girer
    And Kullanici 2 saniye bekler
    And Kullanici gecersiz password girer
    And Kullanici 2 saniye bekler
    And Kullanici login butonuna tiklar
    And Kullanici 2 saniye bekler
    And Kullanici giris yapamadigini test eder
    And Kullanici 2 saniye bekler
    And Sayfayi kapatir