$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/amazonarama.feature");
formatter.feature({
  "name": "Amazon urun Arama",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "TC06_user searches the product in Amazon",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@amazonurunarama"
    }
  ]
});
formatter.step({
  "name": "user goes to the \"https://amazon.com\" that page",
  "keyword": "Given "
});
formatter.step({
  "name": "user text \"\u003cword\u003e\" in the searchbox",
  "keyword": "And "
});
formatter.step({
  "name": "user text the result count on the console",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "word"
      ]
    },
    {
      "cells": [
        "headphones"
      ]
    },
    {
      "cells": [
        "tv"
      ]
    },
    {
      "cells": [
        "sponge"
      ]
    }
  ]
});
formatter.scenario({
  "name": "TC06_user searches the product in Amazon",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@amazonurunarama"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user goes to the \"https://amazon.com\" that page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.ExplicitStepDefinition.user_goes_to_the_that_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user text \"headphones\" in the searchbox",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.AmazonStepDefinitions.user_text_in_the_searchbox(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user text the result count on the console",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.AmazonStepDefinitions.user_text_the_result_count_on_the_console()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "TC06_user searches the product in Amazon",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@amazonurunarama"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user goes to the \"https://amazon.com\" that page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.ExplicitStepDefinition.user_goes_to_the_that_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user text \"tv\" in the searchbox",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.AmazonStepDefinitions.user_text_in_the_searchbox(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user text the result count on the console",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.AmazonStepDefinitions.user_text_the_result_count_on_the_console()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "TC06_user searches the product in Amazon",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@amazonurunarama"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user goes to the \"https://amazon.com\" that page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.ExplicitStepDefinition.user_goes_to_the_that_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user text \"sponge\" in the searchbox",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.AmazonStepDefinitions.user_text_in_the_searchbox(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user text the result count on the console",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.AmazonStepDefinitions.user_text_the_result_count_on_the_console()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});