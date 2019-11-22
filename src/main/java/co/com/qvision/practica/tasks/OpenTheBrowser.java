package co.com.qvision.practica.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.Keys;

import co.com.qvision.practica.userinterfaces.GoogleAppComponents;
import co.com.qvision.practica.userinterfaces.GoogleHomePage;

public class OpenTheBrowser implements Task {

	@Override
	@Step("{0} opens the browser on Google Home Page")
	public <T extends Actor> void performAs(T actor) {
		//En el interior de este metodo van todas las acciones, interacciones que hay que realizar para cumplir con dicha tarea
		actor.attemptsTo(Open.browserOn(new GoogleHomePage()));
	
	}
	

	//crea una nueva instancia de OpenTheBrowser
	public static OpenTheBrowser on() {
		 //return new OpenTheBrowser();
		return instrumented(OpenTheBrowser.class);  //Este comando permite crear una instancia
		
	}

}
