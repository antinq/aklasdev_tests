Feature: Login
  I am registered user
  I entered in my account
  I want Create project to github
  so that I can create project


  Scenario Outline: Create project
    Given I entered to LogIn page
    When I enter "tigrenaltd" to textfield Username or email adress
    And I enter "jl3xg6cd9l"  to textfield Password
    And Click button Sign in
    And I press dropdown item Create New Repository
    And I enter "<RepositoryName>"
    And I press button Create Repository
    Then I should see: "<RepositoryName>"

    Examples:
      |RepositoryName|
      |MyProject1|

