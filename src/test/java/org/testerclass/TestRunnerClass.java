package org.testerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.*;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",glue = "org.Cucumberfile",monochrome = true)

public class TestRunnerClass {

}
