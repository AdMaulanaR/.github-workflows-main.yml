Feature: Automation web demo blaze

  @web
  Scenario: Login using valid user and password
    Given user is on login page
    And user click button login
    And user input username "AdMaulana"
    And user input password "demoblaze123"
    When user click button login new

