import org.openqa.selenium.WebDriver;

public class EnterVehicleDataPage {

	private DSL dsl;

	public EnterVehicleDataPage(WebDriver driver) {		
		dsl = new DSL(driver); 
	}
	
	public void setMake(String valor) {		
		dsl.selecionarCombo("make", valor);
	}
	public void setModel(String valor) {		
		dsl.selecionarCombo("model", valor);
	}
	public void setCylinderCapacity(String valor) {		
		dsl.escreveNoCampo("cylindercapacity", valor);
	}
	public void setEnginePerformance(String valor) {		
		dsl.escreveNoCampo("engineperformance", valor);
	}
	public void setDateOfManufacture(String valor) {		
		dsl.escreveNoCampo("dateofmanufacture", valor);
	}
	public void setHandDriveYes() {		
		dsl.clicarRadio("//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[1]/span");
	}
	public void setNumberOfStSeats1(String valor) {		
		dsl.selecionarCombo("numberofseats", valor);
	}
	public void setNumberOfStSeats2(String valor) {		
		dsl.selecionarCombo("numberofseatsmotorcycle", valor);
	}
	public void setFuelType(String valor) {		
		dsl.selecionarCombo("fuel", valor);
	}
	public void setPayload(String valor) {		
		dsl.escreveNoCampo("payload", valor);
	}
	public void setTotalWright(String valor) {		
		dsl.escreveNoCampo("totalweight", valor);
	}
	public void setListPrice(String valor) {		
		dsl.escreveNoCampo("listprice", valor);
	}
	public void setLicensePlateNumber(String valor) {		
		dsl.escreveNoCampo("licenseplatenumber", valor);
	}
	public void setAnnuealMileage(String valor) {		
		dsl.escreveNoCampo("annualmileage", valor);
	}
	public void clickButtonNext() {		
		dsl.clicarBotao("nextenterinsurantdata");
	}
	
	
	
	
	
	
	
}
