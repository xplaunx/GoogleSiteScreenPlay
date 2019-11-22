package co.com.qvision.practica.tasks;

import co.com.qvision.practica.userinterfaces.GoogleTranslatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class Translate implements Task {

	@Step("{0} translates a word of english to spanish")
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(GoogleTranslatePage.BUTTON_LENGUAGE_SOURCE),
			 (Click.on(GoogleTranslatePage.LENGUAGE_SOURCE_ENGLISH)),
			 (Click.on(GoogleTranslatePage.BUTTON_LENGUAGE_DESTINY)),
			 (Click.on(GoogleTranslatePage.LENGUAGE_DESTINY_SPANISH)),
			 (Enter.theValue("cheese").into(GoogleTranslatePage.SOURCE_INPUT))
			 );
		
	}

	public static Translate the() {
		return Tasks.instrumented(Translate.class);
	}

}
