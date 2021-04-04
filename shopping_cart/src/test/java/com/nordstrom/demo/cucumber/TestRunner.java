package com.nordstrom.demo.cucumber;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "./features", glue = {"stepDefinition"})
public class TestRunner extends AbstractTestNGCucumberTests{
	
	
	
}

