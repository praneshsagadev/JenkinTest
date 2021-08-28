package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)



@CucumberOptions(features="src\\test\\resources\\Feature"
,glue = "stepDefinations"
,monochrome=true
,publish=true)


public class RunnerTest {

}

