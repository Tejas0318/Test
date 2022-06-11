Feature: Contact Us page
Scenario Outline: Sucessfull Contacting with positive response
Given initilize browser with chrome
And navigate to "http://uniformm1.upskills.in/" site
And Click on Contact Us link in home page to land on Contact us page
And  user enters <Your name> ,<E-mail Address>, <Enuiry>
And Click on Submit
And Click on continue
And close the browser