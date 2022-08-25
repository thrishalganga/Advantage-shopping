Feature: Validation of Reg scenario

  #Author:Thrishal
  Scenario: Registration with valid credential
    Given Open the browser
    Given Open Createnewaccount
    When Enter valid username and Mail
    When Enter Valid fname and lname and mobilenumber
    When Enter Valid Country and Valid city and Valid Address and Valid state and ValidpostalCode
    Then execute successfully

