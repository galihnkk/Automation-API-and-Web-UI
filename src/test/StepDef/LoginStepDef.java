package StepDef;

import Run.Base;
import Page.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef extends Base{

    LoginPage loginPage;
    @Given("user berada pada halaman login")
    public void HalamanLogin() {
        loginPage = new LoginPage(driver);
        loginPage.HalamanUtama();
    }
    @And("user memasukan username dengan {string}")
    public void InputUsername(String username) {
        loginPage.inputUsername(username);
    }
    @And("user memasukan password dengan {string}")
    public void InputPassword(String password) {
        loginPage.inputPassword(password);
    }
    @When("user menekan tombol login")
    public void KlikTombolLogin() {
        loginPage.clickButton();
    }
    @Then("user mendapatkan pesan error {string}")
    public void ValidasiPesanError(String pesan) {
        loginPage.ValidasiPesan(pesan);
    }
}