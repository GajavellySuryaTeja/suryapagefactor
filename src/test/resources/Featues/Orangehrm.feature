Feature: Login Functionality

  Scenario: 
    Given open Browser
    And Enter url  "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When Enter UserName "Admin" and password "admin123"
    Then Enter Login button
    And Close Brower

  Scenario Outline: 
    Given open Browser
    And Enter url  "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When Enter UserName "<UserName>" and password "<Password>"                                        
    Then Enter Login button
    And Close Brower

    Examples: 
      | UserName | Password |
      | Admin    | admin123 |
      | Admin    | admin234 |
      | Surya    | Surya123 |
