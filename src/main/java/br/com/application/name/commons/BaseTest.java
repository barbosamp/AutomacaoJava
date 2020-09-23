package br.com.application.name.commons;

import br.com.application.name.interfaces.WebApplication;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 *
 */
public class BaseTest {

	protected static WebDriver webDriver;
	protected static WebDriverWait wait;
	protected static WebDriverWait shortWait;
	protected static boolean initialized;
	protected static DataGenerator dataGenerator = new DataGenerator();
	protected PropertiesManager propertiesManager = new PropertiesManager();

	/**
	 * Inicializa o {@code WebDriver} e o {@code WebDriverWait}
	 */
	protected void initializeWebApplication(WebApplication webApplication) {

		webDriver = webApplication.getDriver();
		webDriver.manage().window().maximize();
		webDriver.get(PropertiesManager.getPropertiesValue("URL_QA"));
		wait = new WebDriverWait(webDriver, 80);
	}

	/**
	 * fecha o driver web
	 */
	protected static void closeWeb() {
		webDriver.quit();
	}

	/**
	 * tira prints
	 * 
	 * @param driver
	 * @return
	 */
	private String takeScreenshot(WebDriver driver) {
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
	}

}
