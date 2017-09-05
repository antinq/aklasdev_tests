Feature: Login
  I am registered user
  I want login to github
  so that I can create project


#  Scenario Outline: Login with Existing Credentials
  Scenario: Login with Existing Credentials
    Given  I entered to "https://aklas-dev.vis-design.com"
#    Given DeleteAllCookies
#    And RefreshAndWait
#    And I entered to "https://aklas-dev.vis-design.com"
    When opened "articles/rassrochka"
    And I clickAndWait to CssSelector "div.menu_top > ul > li > a"
#    And I enter "<password>"  to textfield Password
#    And Click button Sign in
    Then I should see: Learn Git and GitHub without any code!

#    Examples:
#      |username|password|
#      |tigrenaltd|jl3xg6cd9l|

#  Scenario Outline: Login with Non-Existing Credentials
#    Given I entered to LogIn page
#    When I enter "<username>" to textfield Username or email adress
#    And I enter "<password>"  to textfield Password
#    And Click button Sign in
#    Then I should: see Incorrect login or password
#
#    Examples:
#      |username|password|
#      |||
#      |tigrenaltd|lkj|
#      |axalay|maxalay|
#      |axa lay|jl3xg6cd9l|