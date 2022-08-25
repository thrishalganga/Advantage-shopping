Feature: Validation of Reg scenario

  #Author:Thrishal
  Background: login with valid credential
    Given Open the browser
    Given Open Createnewaccount
    When Enter valid Username "Advantage.Demo" and Password "12345Asdf"
    Then execute the login successfully


  Scenario Outline: Payment with valid credentials
    Given open cart
    When Enter Valid Shipping address
    Then save shipping details successfully
    Given open payment
    When Enter valid Cardnumber "<payment.cardno>" and cvv "<payment.cvv>"
    Then payment successful

    Examples: 
      | payment.cardno | payment.cvv |
      | cardno         | cvv         |
