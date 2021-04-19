
import org.openqa.selenium.WebDriver;

public class SendQuotePage {
	
	private DSL dsl;

	public SendQuotePage(WebDriver driver) {		
		dsl = new DSL(driver); 
	}
	
	public void setEmail(String valor) {		
		dsl.escreveNoCampo("email", valor);
	}
	public void setPhone(String valor) {		
		dsl.escreveNoCampo("phone", valor);
	}
	public void setUsername(String valor) {		
		dsl.escreveNoCampo("username", valor);
	}
	public void setPassword(String valor) {		
		dsl.escreveNoCampo("password", valor);
    }
	public void setConfirmPassword(String valor) {		
		dsl.escreveNoCampo("confirmpassword", valor);
    }
	public void setComments(String valor) {		
		dsl.escreveNoCampo("Comments", valor);
    }
	public void clicarBotaoSend() {		
		dsl.clicarBotao("sendemail");
    }
	
}
