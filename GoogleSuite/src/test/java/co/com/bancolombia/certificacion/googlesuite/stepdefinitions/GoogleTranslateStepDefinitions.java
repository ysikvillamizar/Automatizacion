package co.com.bancolombia.certificacion.googlesuite.stepdefinitions;
import org.apache.tools.ant.filters.TokenFilter.ContainsString;
import org.openqa.selenium.WebDriver;
import co.com.bancolombia.certificacion.googlesuite.questions.TheText;
import co.com.bancolombia.certificacion.googlesuite.tasks.GoTo;
import co.com.bancolombia.certificacion.googlesuite.tasks.OpenTheBrowser;
import co.com.bancolombia.certificacion.googlesuite.userinterfaces.GoogleAppsComponent;
import co.com.bancolombia.certificacion.googlesuite.userinterfaces.GoogleHomePage;
import co.com.bancolombia.certificacion.googlesuite.userinterfaces.GoogleTranslatePage;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import static org.hamcrest.CoreMatchers.containsString;

public class GoogleTranslateStepDefinitions {
	
	@Managed (driver="chrome")
	private WebDriver herBrowser; 
	
	private Actor susan= Actor.named("Susan");
	private GoogleHomePage googleHomePage;
	private GoogleTranslatePage googleTranslate;
	
	@Before
	public void setUp() {
	susan.can(BrowseTheWeb.with(herBrowser));	
	
	
	}
	
	@Given("^that Susan wants to translate a word$")
	public void thatSusanWantsToTranslateAWord() throws Exception {
	
	   susan.wasAbleTo(OpenTheBrowser.on(googleHomePage));
			
	   
	}


	@When("^she translates the word cheese from English to Spanish$")
	public void sheTranslatesTheWordCheeseFromEnglishToSpanish() throws Exception {
		 susan.wasAbleTo(GoTo.theApp(GoogleTranslatePage.SOURCE_LANGUAJE_TEXTAREA));
		
	}

	@Then("^she should see the word (.*) in the screen$")
    public void sheShouldSeeTheWordQuesoInTheScreen(String queso) throws Throwable {
		susan.should(seeThat(TheText.ofFollowingTarget(GoogleAppsComponent.GOOGLE_TRANSLATE), containsString(queso)));
    }
	
	


}
