package LogInfoPack;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test1 {

	
	private static final Logger log=LogManager.getLogger(Test1.class.getName());
	
	public static void main(String[] args) {
		
		
	   log.info("Info Msg");
	   log.error("Error Message");
		
	}
	
	
}
