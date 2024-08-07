package pages;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                features="D:\\LearningTools\\ClipboardHealth\\Selenium-Docker-BDD\\src\\test\\resources\\Features"
                ,monochrome=true,
                strict=true,
                glue= {"D:\\LearningTools\\ClipboardHealth\\Selenium-Docker-BDD\\src\\test\\java\\tests"},
                dryRun=false, format= {"pretty","html:test-output"}
                ,tags= {"@scenario"})
public class TestRunner {
}
