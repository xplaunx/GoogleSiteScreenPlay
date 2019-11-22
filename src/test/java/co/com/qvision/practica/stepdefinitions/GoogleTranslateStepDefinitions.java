package co.com.qvision.practica.stepdefinitions;

import java.nio.channels.SeekableByteChannel;

import org.hamcrest.core.Is;
import org.openqa.selenium.WebDriver;

import co.com.qvision.practica.questions.WordTranslate;
import co.com.qvision.practica.tasks.GoTo;
import co.com.qvision.practica.tasks.OpenTheBrowser;
import co.com.qvision.practica.tasks.Translate;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.*;
//import static org.hamcrest.Matchers.equalTo;


public class GoogleTranslateStepDefinitions {
	
	
	
	@Managed(driver = "chrome")		
	private WebDriver hisBrowser; //si el actor fuera una mujer  herBrowser
	
	private Actor sebas = Actor.named("Sebas"); //Declaramos el actor que vamos a utilizar
	
	//Metodo para referenciar el actor con el driver
	@Before
	public void setUp() {
		sebas.can(BrowseTheWeb.with(hisBrowser)); 
	}
	
	//Apartir de aca no hablaremos del driver, hablaremos del actor
	
	/* 
	 * sebas.wasAbleTo(Tasks);    --> @Given  -> Fue capaz de  ...
	 * sebas.attemptsTo(Tasks);   --> @When   -> Intenta hacer ...
	 * */
	
	@Given("^that Sebas wants to translate a word$")
	public void thatSebasWantsToTranslateAWord() throws Exception {    
		sebas.wasAbleTo(OpenTheBrowser.on());
	}

	@When("^he translates the word cheese from english to spanish$")
	public void heTranslatesTheWordCheeseFromEnglishToSpanish() throws Exception {
		sebas.wasAbleTo(GoTo.theApp());
		sebas.wasAbleTo(Translate.the());
	    
	}

	@Then("^he shoul the word queso in the screen$")
	public void heShoulTheWordQuesoInTheScreen() throws Exception {
	    sebas.should(seeThat(WordTranslate.value(), equalTo("queso")));
	}
	
}
