package ru;

import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
        features = {
                "src/test/resourses"
        },
        glue = {

        }
// классы, которые используются в тесте
)

public class CucumberFunctionalTest {
    @AfterClass
    public static void teardown() {
        WebDriverRunner.getWebDriver().quit();

    }
}
