package Page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class Homepage {
	
	
	WebDriver D ;
    String baseUrl = "https://www.ndtv.com/";
    
    
    public Homepage(WebDriver driver)
    {
    	this.D=driver;
    }
    
	 public String getLoginTitle()
	    {
	    	
	        D.manage().window().maximize();
	        D.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	        return    D.getTitle();
	    }


	public void Login() {
		// TODO Auto-generated method stub
		D.get(baseUrl);	
	}

}
