package com.eBay.Test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/AdvancedSearch.feature", glue="com.eBay.Test.steps")
public class DefinitionTestSuite {}