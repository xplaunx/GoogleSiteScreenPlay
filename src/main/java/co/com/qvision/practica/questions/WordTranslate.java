package co.com.qvision.practica.questions;

import co.com.qvision.practica.userinterfaces.GoogleTranslatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.questions.Text;

public class WordTranslate implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return GoogleTranslatePage.TRANSLATION_DESTINY.resolveFor(actor).getText();
	}

	public static Question<String> value() {
		return new WordTranslate();
	}

}
