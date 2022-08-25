Feature: Validation of Reg scenario

  #Author:Thrishal
  @smoketest
  Scenario: login with valid credential
    Given Open the browser
    Given Open Createnewaccount
    When Enter valid username "<login.username>" and Password "<login.password>"
    Then execute login successfully
    Examples:
    |login.username|login.password|
    |Username|Password|
