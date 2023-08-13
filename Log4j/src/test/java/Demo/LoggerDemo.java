package Demo;


import org.apache.logging.log4j.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


 /*{
	
	public static void main(String[] args) {
		
		//Creating reference variable 
		Logger log = LogManager.getLogger("LoggerDemo");
		
		//information log
		System.out.println("The log demo ");
		
		log.info("For info only");
		log.debug("For debug");
		log.error("error");
		log.warn("warning message");
		
		
	}
	*/
public class LoggerDemo{
private static final Logger logger = LogManager.getLogger(LoggerDemo.class);

public static void main(String[] args) {
    // Some example log messages
    logger.trace("This is a trace message.");
    logger.debug("This is a debug message.");
    logger.info("This is an info message.");
    logger.warn("This is a warning message.");
    logger.error("This is an error message.");
    logger.fatal("This is a fatal message.");
}


	

}
