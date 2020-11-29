#Author: DERLY ANGEL

  @Stories

  Feature: UTest platform

    As a user unregistered , I want to register on the uTest platform

  @Scenario1

  Scenario Outline: Registry on the uTest platform


    Given then Rose want to subscribe to the uTest platform

    When she fills out the registration form

    |  firstName    |  lastName   | email     | dateOfBirth   | password       | confirmPassword  |
    | <firstName>   |  <LastName> | <email>   | <dateOfBirth> |  <password>    | <confirmPassword>|

   Then she finds the message called The last step

    Examples:

    | firstName    |  LastName    | email                      | dateOfBirth    | password             | confirmPassword      |
    |Ana            |  Medina     |   testChoucair3@gmail.com  | August-12-1994 | Anamedinavilla19990  | Anamedinavilla19990  |
