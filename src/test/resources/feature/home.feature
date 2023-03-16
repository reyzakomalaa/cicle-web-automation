Feature: Home

  @AddHQ
  Scenario: Ensure user can add new HQ
    Given user is in Company Home page
    When user click Add HQ icon
    And user fill Name
    And user fill Description
    And user click Create
    Then show toaster success create new Company
    Then show created Team name

#  @AddHQ -> Masih bug, bisa create Team dengan empty Name
  Scenario: Ensure user can not add new HQ if mandatory field is not filled
    Given user is in Company Home page
    When user click Add HQ icon
    And user click Create
    Then show error toaster must be filled name and description

  @AddTeam
  Scenario: Ensure user can add new Team
    Given user is in Company Home page
    When user click Add Team icon
    And user fill Team Name
    And user fill Description
    And user click Create
    Then show toaster success create new Company
    Then show created Team name

#  @AddTeam -> Masih bug, bisa create Team dengan empty Name
  Scenario: Ensure user can not add new Team if mandatory field is not filled
    Given user is in Company Home page
    When user click Add Team icon
    And user click Create
    Then show error toaster must be filled name and description

  @AddProject
  Scenario: Ensure user can add new Project
    Given user is in Company Home page
    When user click Add Project icon
    And user fill Name
    And user fill Description
    And user click Create
    Then show toaster success create new Company
    Then show created Team name

#  @AddProject -> Masih bug, bisa create Team dengan empty Name
  Scenario: Ensure user can not add new Project if mandatory field is not filled
    Given user is in Company Home page
    When user click Add Project icon
    And user click Create
    Then show error toaster must be filled name and description

  @AddMember
  Scenario: Ensure user can invite new Member
    Given user is in Company Home page
    When user click Add New Member icon on Home page
    And user fill Member Email
    And user click Send
    Then show toaster success invitation has been sent

  Scenario: Ensure user can see HQ section with Empty State
    Given user is in Company Home page
    When user click Create New Company
    And user fill Name
    And user fill Description
    And user click Create
    Then user will see HQ section Empty State

  Scenario: Ensure user can see Team section with Empty State
    Given user is in Company Home page
    When user click Create New Company
    And user fill Name
    And user fill Description
    And user click Create
    Then user will see Team section Empty State

  @Logout
  Scenario: Ensure user can Logout
    Given user is in Company Home page
    When user click Avatar of Me
    And user click Logout icon
    Then user is in Login page

