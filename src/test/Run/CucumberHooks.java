package Run;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooks extends Base {

    @Before
    public void beforeTest() {
        getDriver();
    }
    @After
    public void afterTest() {
        driver.close();
    }
}