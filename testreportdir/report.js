$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("appTest.feature");
formatter.feature({
  "line": 1,
  "name": "app test",
  "description": "\r\nRule: only test on the app",
  "id": "app-test",
  "keyword": "Feature"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "start app",
  "keyword": "Given "
});
formatter.match({
  "location": "CucumberAppTest.beforeAll()"
});
formatter.result({
  "duration": 21781294100,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "error Login, only username",
  "description": "",
  "id": "app-test;error-login,-only-username",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@App"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "Error login only with the username",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberAppTest.errorLogin1()"
});
formatter.result({
  "duration": 2061027400,
  "status": "passed"
});
formatter.after({
  "duration": 1955434900,
  "status": "passed"
});
formatter.after({
  "duration": 34600,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "start app",
  "keyword": "Given "
});
formatter.match({
  "location": "CucumberAppTest.beforeAll()"
});
formatter.result({
  "duration": 18799559800,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "error Login, only password",
  "description": "",
  "id": "app-test;error-login,-only-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@App"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "Error login only with the password",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberAppTest.errorLogin2()"
});
formatter.result({
  "duration": 2635122100,
  "status": "passed"
});
formatter.after({
  "duration": 1707936500,
  "status": "passed"
});
formatter.after({
  "duration": 19400,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "start app",
  "keyword": "Given "
});
formatter.match({
  "location": "CucumberAppTest.beforeAll()"
});
formatter.result({
  "duration": 18657355100,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "error Login, without user and psw",
  "description": "",
  "id": "app-test;error-login,-without-user-and-psw",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@App"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "Error login only without username and password",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberAppTest.errorLogin3()"
});
formatter.result({
  "duration": 1504277500,
  "status": "passed"
});
formatter.after({
  "duration": 2021243000,
  "status": "passed"
});
formatter.after({
  "duration": 26200,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "start app",
  "keyword": "Given "
});
formatter.match({
  "location": "CucumberAppTest.beforeAll()"
});
formatter.result({
  "duration": 19096475100,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Login user",
  "description": "",
  "id": "app-test;login-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 20,
      "name": "@App"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "Login with username \u0027user\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberAppTest.loginUser()"
});
formatter.result({
  "duration": 4381732400,
  "status": "passed"
});
formatter.after({
  "duration": 1746675300,
  "status": "passed"
});
formatter.after({
  "duration": 30300,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "start app",
  "keyword": "Given "
});
formatter.match({
  "location": "CucumberAppTest.beforeAll()"
});
formatter.result({
  "duration": 18904317300,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "verify login user",
  "description": "",
  "id": "app-test;verify-login-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 24,
      "name": "@App"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "verify welcome user",
  "keyword": "Then "
});
formatter.match({
  "location": "CucumberAppTest.welcomeUser()"
});
formatter.result({
  "duration": 4610467100,
  "status": "passed"
});
formatter.after({
  "duration": 1767973100,
  "status": "passed"
});
formatter.after({
  "duration": 29400,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "start app",
  "keyword": "Given "
});
formatter.match({
  "location": "CucumberAppTest.beforeAll()"
});
formatter.result({
  "duration": 19351897000,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "test button reset",
  "description": "",
  "id": "app-test;test-button-reset",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 28,
      "name": "@App"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "Login user admin password admin and click refresh btn",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 11
    },
    {
      "val": "admin",
      "offset": 26
    }
  ],
  "location": "CucumberAppTest.resetBtn(String,String)"
});
formatter.result({
  "duration": 2570819000,
  "status": "passed"
});
formatter.after({
  "duration": 1912255100,
  "status": "passed"
});
formatter.after({
  "duration": 29800,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "start app",
  "keyword": "Given "
});
formatter.match({
  "location": "CucumberAppTest.beforeAll()"
});
formatter.result({
  "duration": 18556486500,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "login with parameter",
  "description": "",
  "id": "app-test;login-with-parameter",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 32,
      "name": "@App"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "Insert user admin password admin",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 12
    },
    {
      "val": "admin",
      "offset": 27
    }
  ],
  "location": "CucumberAppTest.loginWithParameter(String,String)"
});
formatter.result({
  "duration": 2051223100,
  "status": "passed"
});
formatter.after({
  "duration": 2041643100,
  "status": "passed"
});
formatter.after({
  "duration": 32700,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "start app",
  "keyword": "Given "
});
formatter.match({
  "location": "CucumberAppTest.beforeAll()"
});
formatter.result({
  "duration": 19766887400,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "add one Contact",
  "description": "",
  "id": "app-test;add-one-contact",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 36,
      "name": "@App"
    }
  ]
});
formatter.step({
  "line": 38,
  "name": "add one contact",
  "keyword": "Given "
});
formatter.match({
  "location": "CucumberAppTest.addContact()"
});
formatter.result({
  "duration": 6579993100,
  "status": "passed"
});
formatter.after({
  "duration": 1871431500,
  "status": "passed"
});
formatter.after({
  "duration": 27000,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "start app",
  "keyword": "Given "
});
formatter.match({
  "location": "CucumberAppTest.beforeAll()"
});
formatter.result({
  "duration": 19291681700,
  "status": "passed"
});
formatter.scenario({
  "line": 41,
  "name": "delete",
  "description": "",
  "id": "app-test;delete",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 40,
      "name": "@App"
    }
  ]
});
formatter.step({
  "line": 42,
  "name": "delete contact after login",
  "keyword": "When "
});
formatter.match({
  "location": "CucumberAppTest.deleteContact()"
});
formatter.result({
  "duration": 4874651300,
  "status": "passed"
});
formatter.after({
  "duration": 1854472300,
  "status": "passed"
});
formatter.after({
  "duration": 28300,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "start app",
  "keyword": "Given "
});
formatter.match({
  "location": "CucumberAppTest.beforeAll()"
});
formatter.result({
  "duration": 18993044500,
  "status": "passed"
});
formatter.scenario({
  "line": 45,
  "name": "add multiple contac",
  "description": "",
  "id": "app-test;add-multiple-contac",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 44,
      "name": "@App"
    }
  ]
});
formatter.step({
  "line": 46,
  "name": "contact1 Vito contact2 Giuseppe contact3 Gennaro",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "Vito",
      "offset": 9
    },
    {
      "val": "Giuseppe",
      "offset": 23
    },
    {
      "val": "Gennaro",
      "offset": 41
    }
  ],
  "location": "CucumberAppTest.add3Contact(String,String,String)"
});
formatter.result({
  "duration": 11974893500,
  "status": "passed"
});
formatter.after({
  "duration": 1893052900,
  "status": "passed"
});
formatter.after({
  "duration": 21700,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "start app",
  "keyword": "Given "
});
formatter.match({
  "location": "CucumberAppTest.beforeAll()"
});
formatter.result({
  "duration": 19281172800,
  "status": "passed"
});
formatter.scenario({
  "line": 49,
  "name": "verify if exist contact",
  "description": "",
  "id": "app-test;verify-if-exist-contact",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 48,
      "name": "@App"
    }
  ]
});
formatter.step({
  "line": 50,
  "name": "add contact1 Vito contact2 Giuseppe contact3 Gennaro and verify if exist",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "Vito",
      "offset": 13
    },
    {
      "val": "Giuseppe",
      "offset": 27
    },
    {
      "val": "Gennaro",
      "offset": 45
    }
  ],
  "location": "CucumberAppTest.addAndVerify(String,String,String)"
});
formatter.result({
  "duration": 8399119800,
  "status": "passed"
});
formatter.after({
  "duration": 1745828700,
  "status": "passed"
});
formatter.after({
  "duration": 28600,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "start app",
  "keyword": "Given "
});
formatter.match({
  "location": "CucumberAppTest.beforeAll()"
});
formatter.result({
  "duration": 19524066400,
  "status": "passed"
});
formatter.scenario({
  "line": 53,
  "name": "error btn",
  "description": "",
  "id": "app-test;error-btn",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 52,
      "name": "@App"
    }
  ]
});
formatter.step({
  "line": 54,
  "name": "insert username admin password admin",
  "keyword": "Given "
});
formatter.step({
  "line": 55,
  "name": "click button errore",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 16
    },
    {
      "val": "admin",
      "offset": 31
    }
  ],
  "location": "CucumberAppTest.loginPara(String,String)"
});
formatter.result({
  "duration": 2728831200,
  "status": "passed"
});
formatter.match({
  "location": "CucumberAppTest.erroreBtn()"
});
formatter.result({
  "duration": 2704757100,
  "status": "passed"
});
formatter.after({
  "duration": 1999934700,
  "status": "passed"
});
formatter.after({
  "duration": 24500,
  "status": "passed"
});
});