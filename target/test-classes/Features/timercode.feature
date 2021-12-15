Feature: Countdown.feature
  Scenario: Verify Eggmeter home page is loaded and user able to start the counter
    Given Timer site is opened and page is loaded
    When User enters time and click on start
    Then Countdown timer started
    And Remaining time decreases in one-sec increments
  

