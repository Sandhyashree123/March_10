Feature: User should be inthe Adactin Webpage
Background: 
Given User should be in Adactin homepage



   Scenario: User should be in the vaild credentials
   When User should enters vaild Username and Password vaildcredentials
  #one Dimensational without header aslist
  #no need Scenario outline
   |sandhyasaurabh|
   |123456789|
 
  And User should verify the login sucessful message
  
  
  Scenario: User should be in the invaild credentials
  When User should enters vaild Username and Password invaildcredentials
  #two Dimensational without header aslists
  #no need Scenario outline
   |shri|12345678|
   
 
  And User should verify the login error message
  
  Scenario: User should be in the vaild credentials based on the map
  When User should enters vaild Username and Password vaildcredentials based on the map
  #one Dimensational with header maps
  #no need Scenario outline
   |username|sandhyasaurabh|
   |password|123456789|
   And User should verify the login sucessful message based on the map
   
   
   
  Scenario: User should be in the vaild credentials based on the maps
  When User should enters vaild Username and Password vaildcredentials based on the maps
  #two Dimensational with header maps
  #no need Scenario outline
   |username|password|
   |sandhyasaurabh|123456789|
   |shri|123456789|
   And User should verify the login sucessful message based on the maps
   