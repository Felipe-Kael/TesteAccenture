import org.openqa.selenium.WebDriver;

public class EnterInsurantDataPage {

	private DSL dsl;

	public EnterInsurantDataPage(WebDriver driver) {		
		dsl = new DSL(driver); 
	}
	
	public void setFirstName(String valor) {		
		dsl.escreveNoCampo("firstname", valor);
	}
	public void setLastName(String valor) {		
		dsl.escreveNoCampo("lastname", valor);
	}
	
	public void setDateOfBirth(String valor) {		
		dsl.escreveNoCampo("birthdate", valor);
	}
	
	public void setGenderMale() {		
		dsl.clicarRadio("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span");
	}
	public void setStreetAdrdress(String valor) {		
		dsl.escreveNoCampo("streetaddress", valor);
	}
	public void setCountry(String valor) {		
		dsl.selecionarCombo("country", valor);
	}
	public void setZipCode(String valor) {		
		dsl.escreveNoCampo("zipcode", valor);
	}
	public void setCity(String valor) {		
		dsl.escreveNoCampo("city", valor);
    }
	public void setOccupation(String valor) {		
		dsl.selecionarCombo("occupation", valor);
	}
	public void setHobies() {		
		dsl.clicarRadio("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span");
		dsl.clicarRadio("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[4]/span");
		dsl.clicarRadio("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[2]/span");
	}
	
	public void setWebsite(String valor) {		
		dsl.escreveNoCampo("website", valor);
	}
	
	//public void setPicture(String valor) {		
	//	dsl.escreveNoCampo("website", valor);
	//}
	//public void clickButton() {		
	//	dsl.clicarBotaoXpath("//*[@id=\"open\"]");
	//}
	
	public void clickButtonNext() {		
		dsl.clicarBotao("nextenterproductdata");
	}
	

}
