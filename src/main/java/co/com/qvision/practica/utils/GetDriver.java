package co.com.qvision.practica.utils;

import org.openqa.selenium.WebDriver;

import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;

public class GetDriver {
	
	public static WebDriver getDriver() {
		  return ThucydidesWebDriverSupport.getDriver();
		}
}
