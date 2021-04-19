import org.openqa.selenium.WebDriver;

public class EnterProductDataPage {

	private DSL dsl;

	public EnterProductDataPage(WebDriver driver) {		
		dsl = new DSL(driver); 
	}
			
	public void setStartDate() {				
			dsl.preencherStartDate("01/01/2022");		
	}
	
	public void setInsuranceSum(String valor) {		
		dsl.selecionarCombo("insurancesum", valor);
	}
	
	public void setMeritRating(String valor) {		
		dsl.selecionarCombo("meritrating", valor);
	}
	
	public void setDamgeInsurance(String valor) {		
		dsl.selecionarCombo("damageinsurance", valor);
	}
	
	public void setOptionalProducts() {
		dsl.clicarRadio("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span");		
	}
	
	public void setCourtesyCar(String valor) {		
		dsl.selecionarCombo("courtesycar", valor);
	}
	
	public void clickButtonNext() {		
		dsl.clicarBotao("nextselectpriceoption");
	}
	
	
}
