Feature: Add Company

  @AddCompany
  Scenario: Ensure user can create new company for the first time
    Given user in Welcome page
    When user click Create a new Company
    And user fill Company Name
    And user fill Description
    And user click Create
    Then show toaster success create new Company
    Then user is in Company Home page

#  @AddCompany
  Scenario: Ensure user can not create new company if mandatory field is not filled
    Given user in Welcome page
    When user click Create a new Company
    And user click Create
    Then show error toaster must be filled name and description

  @Login
  Scenario: Ensure user can Login
    Given user is in Login page
    When user click Login with Google Account
    And user select account
    Then user is in Company Home page