import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pack1 {

	
	private static final Logger log=LogManager.getLogger(Pack1.class.getName());
	public static void main(String[] args) {
		
		
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Projects\\ChromeDriver\\chromedriver.exe");
		//WebDriver dr=new ChromeDriver();
		log.info("Debug Message");
		//dr.get("http://www.seleniumframework.com/Practiceform/");
		log.error("Error Occured");
		log.fatal("Fatal Message");
				
	}
	
}
