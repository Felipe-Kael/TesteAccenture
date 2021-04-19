import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;	

public class DSL {
	private WebDriver driver;
	
	public DSL(WebDriver driver) {		
		this.driver = driver;
	}
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	
	public void selecionarCombo(String id, String valor) {		
		WebElement element = driver.findElement(By.id(id));
		Select combo = new Select(element);		
		combo.selectByVisibleText(valor);		
	}
	public void escreveNoCampo(String id_campo, String texto) {
		driver.findElement(By.id(id_campo)).sendKeys(texto);		
	}
	public void clicarRadio(String xpath) {		
		driver.findElement(By.xpath(xpath)).click();		
	}
		
	public void clicarBotao(String id) {
		driver.findElement(By.id(id)).click();		
	}
	
	public void clicarBotaoPorNome(String id) {
		driver.findElement(By.name(id)).click();		
	}
	
	public void preencherStartDate(String valor){
		driver.findElement(By.name("Start Date")).sendKeys(valor);			
	}
	
	public void waitTime() {
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);		
	}
}