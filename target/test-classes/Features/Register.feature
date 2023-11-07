#Feature: Register to demo web application
#
#Scenario: Registering the demo web application
#
#Given User is on register page
#When User clicks register
#And User clicks gender
#And User provides the credentials
#And User clicks register button
#Then User successfully registered 

Feature: Registering the demo application using data Table
 Scenario: Register the demo application
 
 Given User launches the webpage
 When User clicks the register
 And User clicks the gender checkbox
 And User provides the credentials to register
    | FirstName  | LastName    |            Email        | Password    | Confirm Password |
    | Sania      | Mirza       | saniamirza@gmail.com    | SaniaMirza  |  SaniaMirza      |
 And User clicks register button
 Then Checking for registration
  