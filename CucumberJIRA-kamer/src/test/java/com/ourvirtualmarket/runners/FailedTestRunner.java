package com.ourvirtualmarket.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/failed-html-reports"
        },
        features = "@target/rerun.txt",
        glue ="com/ourvirtualmarket/step_defs"
)

public class FailedTestRunner {
}
