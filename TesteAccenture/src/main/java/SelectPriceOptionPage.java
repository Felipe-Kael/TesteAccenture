import org.openqa.selenium.WebDriver;


public class SelectPriceOptionPage {
	private DSL dsl;

	public SelectPriceOptionPage(WebDriver driver) {		
		dsl = new DSL(driver); 
	}
	
	public void selectOption(String xpath) {
		dsl.clicarRadio(xpath);		
	}
	
	public void clickButtonNext() {	
		dsl.waitTime();
		dsl.clicarBotao("nextsendquote");
	}
	
}
