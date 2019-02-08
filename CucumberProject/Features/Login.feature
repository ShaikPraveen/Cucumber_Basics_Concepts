Feature: Login My Account Feature
  Description: I am Testing My Account Login Functionality

 #SIMPLE LOGIN FEATURE FILE WITHOUT PARAMETERS
  #Scenario: Login with Valid Username and Valid Password
   # Given Open Browser
    #When Enter the URL "http://practice.automationtesting.in"
    #And Click on My Account Link
    #And Enter Register Username and Password
    #And Click on Login button
    #Then User Successfully Login into the webpage
    
    
  #SIMPLE LOGIN FEATURE FILE WITH PARAMETERS
  #Scenario: Login with Valid Username and Valid Password
  #Given Open Browser
  #When Enter the URL "http://practice.automationtesting.in"
  #And Click on My Account Link
  #And Enter Register Username "pavanoltraining@gmail.com" and password "Test@selenium123"
  #And Click on Login button
  #Then User Successfully Login into the webpage
  
  
  #SIMPLE DATA DRIVEN TESTING LOGIN WITH INVAIL USERNAME AND PASSWORD
  #Scenario Outline: Login with Valid Username and Valid Password
  #Given Open Browser
  #When Enter the URL "http://practice.automationtesting.in"
  #And Click on My Account Link
  #And Enter Register Username "<username>" and password "<password>"
  #And Click on Login button
  #Then Verify Login 
  #Then close the broser
  
 #Examples:
  
      #| username                | password    |
      #|pavanoltraining@gmail.com|Test@selenium|
      #|pavanoltraining@gmail.com|Test@selenium|
      #|pavanoltraining@gmail.com|Test@selenium|	
      
      
      
      
  #SIMPLE  DATA TABLE SINGLE INPUT PARAMETER
  #Scenario: Login with Valid Username and Valid Password
  #Given Open Browser
  #When Enter the URL "http://practice.automationtesting.in"
  #And Click on My Account Link
  #And Enter Registered Username and password 
  #|pavanoltraining | Test@selenium|
  #And Click on Login button
  #Then Verify Login 
  #Then close the broser
      
      
      
  #SIMPLE  DATA TABLE WITH HEADER
  Scenario: Login with Valid Username and Valid Password
  Given Open Browser
  When Enter the URL "http://practice.automationtesting.in"
  And Click on My Account Link
  And Enter Registered Username and password 
  |username|password|
  |pavanoltraining@gmail.com | Test@selenium123|
  And Click on Login button
  Then close the broser
  
  
    
