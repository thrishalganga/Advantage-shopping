Feature: Validation of Reg scenario

  #Author:Thrishal
  Background: login with valid credential
    Given Open the browser
    Given Open Createnewaccount
    When Enter valid Username "Advantage.Demo" and Password "12345Asdf"
    Then execute the login successfully

  Scenario Outline: Given Open search box
    When Enter valid productname "<search.product>"
    Then search product

    Examples: 
      | search.product |
      | product        |
