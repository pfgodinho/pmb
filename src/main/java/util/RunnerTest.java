package util;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\opet\\IdeaProjects\\pmb\\src\\main\\resources",
//        features = "src/main/resources",
        glue = {"steps", "util"}
)
public class RunnerTest {
}
