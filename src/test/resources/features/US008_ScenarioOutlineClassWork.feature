Feature: Datatables sitesine 5 farkli kullanici girisi

  Scenario Template: TC01 kullanici 5 farkli kayit girisi yapabilmeli
    When Kullanici "dataURL" linkine gider
    Then kullanici new butonuna tiklar
    And Kullanici Name bolumune "<firstname>" girer
    And Kullanici 1 saniye bekler
    And Kullanici LastName bolumune "<lastName>" girer
    And Kullanici 1 saniye bekler
    And Kullanici position bolumune "<position>" yazar
    And Kullanici 1 saniye bekler
    And Kullanici office bolumune "<office>" yazar
    And Kullanici 1 saniye bekler
    And Kullanici extension bolumune "<extension>" yazar
    And Kullanici 1 saniye bekler
    And Kullanici startDate bolumune "<startDate>" yazar
    And Kullanici 1 saniye bekler
    And Kullanici salary bolumune "<salary>" yazar
    And Kullanici 1 saniye bekler
    And Kullanici create butonuna tiklar
    And Kullanici 1 saniye bekler
    When kullanici "<firstname>" ile arama yapar
    And Kullanici 2 saniye bekler
    And Name alanında "<firstname>" oldugunu kontrol eder
    Examples:
      | firstname | lastName | position | office | extension | startDate  | salary |
      | alican1   | yeni     | qa       | ist    | nope      | 2024-07-03 | 40000  |
      | alican2   | yeni     | qa       | ist    | nope      | 2024-07-03 | 40000  |
      | alican3   | yeni     | qa       | ist    | nope      | 2024-07-03 | 40000  |
      | alican4   | yeni     | qa       | ist    | nope      | 2024-07-03 | 40000  |
      | alican5   | yeni     | qa       | ist    | nope      | 2024-07-03 | 40000  |

  Scenario: Kullanici sayfayi kapatır
    Given user closed page