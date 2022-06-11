Feature: Login account
Scenario Outline: Sucessfull registration with positive response
Given initilize browser with chrome
And navigate to "http://uniformm1.upskills.in/index.php?route=account/login" site
And Click on Login link in home page to land on login account page
And  user enters <E-mail Address>, <password>
And Click on login
And Click on continue
And close the browser
