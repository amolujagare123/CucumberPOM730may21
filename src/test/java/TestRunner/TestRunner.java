package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features" ,
        glue="stepDefinition" ,
        //tags = "@bgDemo"
  plugin = { "html:target/cucumber/report.html"
, "json:target/cucumber.json" ,"junit:target/cuckes.xml"})
public class TestRunner {
}
