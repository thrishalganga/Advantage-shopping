Feature: Validation of Reg scenario

  #Author:Thrishal
  Background:login with valid credential
    Given Open the browser
    Given Open Createnewaccount
    When Enter valid Username "Advantage.Demo" and Password "12345Asdf"
    Then execute the login successfully
    @smoketest
  Scenario Outline: shipping with valid credential
    Given open cart
    When Enter Valid Shipping address
    Then save shipping details successfully