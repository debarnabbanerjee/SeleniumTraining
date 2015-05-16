package TrainingDay3;

import org.apache.log4j.Logger;



public class LoggerClass {
	
	public static void main(String[] args) {
		
		Logger APP_LOGS= Logger.getLogger("devpinoyLogger");
		APP_LOGS.debug("starting testing");
		

	}

}
