package StepDef;

import Run.Base;
import Page.HomePage;
import io.cucumber.java.en.Then;

public class HomePageStepDef extends Base {
    HomePage homePage;
    @Then("user masuk ke halaman utama")
    public void TampilanUtama() {
        homePage = new HomePage(driver);
        homePage.validasihomepage();
    }
}