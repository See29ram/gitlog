package OOPS;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test2 {

	
	private static final Logger log=LogManager.getLogger(Test2.class.getName());
	public static void main(String[] args) {
		
		log.info("info");
		log.debug("Debug");
		log.error("Error");
		System.out.println("Modified:offshore");
		System.out.println("Modified:on shore");
		
		//done in dev branch
		System.out.println("add in dev:offshore");
		
	}
	
	
}
