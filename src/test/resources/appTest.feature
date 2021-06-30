Feature: app test

  Rule: only test on the app

  Background:
    Given start app

    @App
    Scenario: error Login, only username
      Then Error login only with the username

    @App
    Scenario: error Login, only password
      Then Error login only with the password

    @App
    Scenario: error Login, without user and psw
      Then Error login only without username and password

    @App
    Scenario: Login user
      Then Login with username 'user'

    @App
    Scenario: verify login user
      Then verify welcome user

    @App
    Scenario: test button reset
      Given Login user admin password admin and click refresh btn

    @App
    Scenario: login with parameter
      Given Insert user admin password admin

    @App
    Scenario: add one Contact
      Given add one contact

    @App
    Scenario: delete
      When delete contact after login

    @App
    Scenario: add multiple contac
      Given contact1 Vito contact2 Giuseppe contact3 Gennaro

    @App
    Scenario: verify if exist contact
      Given add contact1 Vito contact2 Giuseppe contact3 Gennaro and verify if exist

    @App
    Scenario: error btn
      Given insert username admin password admin
      Then click button errore


