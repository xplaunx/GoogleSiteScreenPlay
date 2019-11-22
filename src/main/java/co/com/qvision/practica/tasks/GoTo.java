package co.com.qvision.practica.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.qvision.practica.userinterfaces.GoogleAppComponents;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class GoTo implements Task {
	
	//private SwitchFrame switchFrame;
	//private JSWaiter jSWaiter;
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(GoogleAppComponents.GOOGLE_APPS));
		//actor.attemptsTo(WaitUntil.the(GoogleAppComponents.GOOGLE_TRANSLATE, isVisible()).forNoMoreThan(50).seconds());
		actor.attemptsTo(Click.on(GoogleAppComponents.GOOGLE_TRANSLATE));
		
	}

	public static GoTo theApp() {
		return instrumented(GoTo.class);
		
	}

}
