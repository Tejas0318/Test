Feature: edit account information

  Scenario Outline: sucessfull edit information with positive response
    Given initilize browser with chrome
    And navigate to "http://uniformm1.upskills.in" site
    And Click on profile
    And click on My Account
    And enter <E-mail address>,  <password>
    And Click on login
    Then Click on Edit your information
    And enter <Telephone> and <Last name>
    And click on continue
    Then verify you get<Success: Your account has been successfully updated.>
    And close the browser
