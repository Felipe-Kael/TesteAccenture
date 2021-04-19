import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;

public class TesteCadastro {

	private WebDriver driver;
	private DSL dsl;	
	private EnterVehicleDataPage vehicle;
	private EnterInsurantDataPage insurant;
	private EnterProductDataPage product;
	private SelectPriceOptionPage option;
	private SendQuotePage send;
	
	@Before
	public void inicializa() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://sampleapp.tricentis.com/101/app.php");	
		dsl = new DSL(driver);
		vehicle = new EnterVehicleDataPage(driver);
		insurant = new EnterInsurantDataPage(driver);
		product = new EnterProductDataPage(driver);
		option = new SelectPriceOptionPage(driver);
		send = new SendQuotePage(driver);
	}
	
	@After
	public void finaliza() {
		driver.quit();
	}	
	
	@Test
	public void CadastroCompleto() {
		
		//Enter Vehicle Data
		vehicle.setMake("BMW");
		vehicle.setModel("Moped");
		vehicle.setCylinderCapacity("1000");
		vehicle.setEnginePerformance("250");
		vehicle.setDateOfManufacture("01/05/2021");
		vehicle.setNumberOfStSeats1("2");
		vehicle.setHandDriveYes();
		vehicle.setNumberOfStSeats2("3");
		vehicle.setFuelType("Gas");
		vehicle.setPayload("1000");
		vehicle.setTotalWright("1500");
		vehicle.setListPrice("9876");
		vehicle.setLicensePlateNumber("550123");
		vehicle.setAnnuealMileage("100");
		vehicle.clickButtonNext();
		
		//Enter Insurant Data
		insurant.setFirstName("Felipe");
		insurant.setLastName("Oliveira");
		insurant.setDateOfBirth("09/02/1997");
		insurant.setGenderMale();
		insurant.setStreetAdrdress("Rufino Alves");
		insurant.setCountry("Brazil");
		insurant.setZipCode("37200000");
		insurant.setCity("Lavras");
		insurant.setOccupation("Farmer");
		insurant.setHobies();
		insurant.setWebsite("https://www.linkedin.com/in/felipeoliveira-qa/");
		
		insurant.clickButtonNext();
		
		//Enter Product Data	
		
		product.setStartDate();
		
		product.setInsuranceSum("7.000.000,00");
		product.setMeritRating("Bonus 4");
		product.setDamgeInsurance("Partial Coverage");
		product.setOptionalProducts();
		product.setCourtesyCar("No");
		product.clickButtonNext();
		
		//Select Price Option
		option.selectOption("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]/span");
		option.clickButtonNext();
		
		// Send Quote
		
		send.setEmail("teste@gmail.com");
		send.setPhone("3599887744");
		send.setUsername("ZarakiKenpachi");
		send.setPassword("Teste123");
		send.setConfirmPassword("Teste123");
		send.setComments("Finalizando");
		send.clicarBotaoSend();	
	}
	
	
	
}
