Feature: test on the app

  Rule: only the test on the login with "admin"

    @Admin
    Scenario: verify admin login
      Given start app
      Given Login in app
      Then Verify home page admin

      @Admin
      Scenario: verify welcome admin
        Given start app
        Given Login in app
        Then Verify 'benvenuto admin'