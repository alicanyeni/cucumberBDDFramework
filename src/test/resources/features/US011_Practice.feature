Feature: ClassWork

  Scenario Outline: TC01 Kullanici sutun basligi ile liste alabilmeli
    Given Kullanici "guruURL" anasayfasina gider
    And "<Basliklar>" sutunundaki butun verileri yazdirir
    Examples:
      | Basliklar          |
      | Company            |
      | Group              |
      | Prev Close (Rs)    |
      | Current Price (Rs) |
      | % Change           |

  Scenario: kullanici sayfayi kapatir
    Given user closed page