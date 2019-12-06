Feature: Verify the facebook home page

  Background: 
    Given User on the login page

  
  Scenario: Verify the login functionality with invalid credantials
    When User enters username  and password
    Then User clicks login button

  
  Scenario: Verify the signup functionality with invalid credantials
    When User enters fname and lname
    Then User click signup button

  
  Scenario: Verify the login functionality with in valid credantials using 1d datatable
    When User enters username  and password for 1d
      | nitish11198@gmail.com | 34567867 |
    Then User clicks login button

  
  Scenario: Verify the login functionality with invalid credantials using 2d datatable
    When User enters username  and password for 2d without header
      | nitish@gmail.com | 4638798 |
      | arun@gmail.com   | #$%^&*  |
    
