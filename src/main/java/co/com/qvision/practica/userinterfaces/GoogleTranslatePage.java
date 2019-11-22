package co.com.qvision.practica.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class GoogleTranslatePage {

      	public static final Target BUTTON_LENGUAGE_SOURCE = 
		Target.the("Button source lenguage").locatedBy("//div[@class='sl-more tlid-open-source-language-list']");
	
        public static final Target LENGUAGE_SOURCE_ENGLISH =
        Target.the("Option English Lenguage").locatedBy("//div[@class='language-picker-wrapper']/div[2]/div[1]/div[2]/div[1]/div[3]/div[contains(@onclick,'sl_list_en')]");
  
        public static final Target BUTTON_LENGUAGE_DESTINY =
        Target.the("Button destiny lenguage").locatedBy("//div[@class='tl-more tlid-open-target-language-list']");
        
        public static final Target LENGUAGE_DESTINY_SPANISH =
        Target.the("Option Spanish Lenguage").locatedBy("//div[@class='language-picker-wrapper']/div[2]/div[2]/div[2]/div/div[2]/div[contains(@onclick,'tl_list_es')]");
	
        public static final Target SOURCE_INPUT =
        Target.the("Source input").locatedBy("//div[@class='source-input']//div[@id='input-wrap']//textarea");
       
        public static final Target TRANSLATION_DESTINY =
        Target.the("Destiny input").locatedBy("//div[@class='tlid-results-container results-container']/div[3]/div/div[2]/div/span[@class='tlid-translation translation']");
        
}


