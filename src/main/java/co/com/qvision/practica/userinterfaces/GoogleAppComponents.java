package co.com.qvision.practica.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.IFrame;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleAppComponents {
	
	
	
	public static final Target GOOGLE_APPS = 
			Target.the("Google apps button").located(By.id("gbwa"));	
	
	//IFRAME -> Lo encontre en modo incognito
	public static IFrame GOOGLE_IFRAME_MENU = 
			IFrame.withPath(By.xpath("//iframe[@role='presentation']"));
	

	public static final Target GOOGLE_TRANSLATE = 
			Target.the("Google Translate app button").inIFrame(GOOGLE_IFRAME_MENU).locatedBy("//a[contains(@href , 'translate')]");
	
	
	
}
