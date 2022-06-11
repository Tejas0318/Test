Feature: Product return information

  Scenario Outline: sucessfull Product return with positive response
    Given initilize browser with chrome
    And navigate to "http://uniformm1.upskills.in/" site
    And Click on profile
    And click on My Account
    And enter <E-mail address>, <password>
    And Click on login
    Then Click on returns
    And enter <Firstname> <lastName> <Email> <Telephone><OrderId> <OrderDate> <ProductName> 
    <ProductCode> <Quantity> <ReasonForReturn> <OrderisOpened> <faultDetails>
    And click on Submit button
    Then verify you get<Success: Your Return Order has been successfully updated>
    And close the browser
