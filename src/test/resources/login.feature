Feature: Login
  Scenario: login dengan menggunakan username dan password yang benar
    Given user berada pada halaman login
    And user memasukan username dengan "standard_user"
    And user memasukan password dengan "secret_sauce"
    When user menekan tombol login
    Then user masuk ke halaman utama

  Scenario: login dengan menggunakan username yang benar dan password yang salah
    Given user berada pada halaman login
    And user memasukan username dengan "standard_user"
    And user memasukan password dengan "123"
    When user menekan tombol login
    Then user mendapatkan pesan error "Epic sadface: Username and password do not match any user in this service"