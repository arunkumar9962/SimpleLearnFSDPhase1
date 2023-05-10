package Logging;

import java.io.FileInputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;

public class LoggingEg {
	
	static Logger logger = Logger.getLogger(LoggingEg.class.getName());
	
	
	public static void main(String[] args) {
		
		try {
			LogManager.getLogManager().readConfiguration(new FileInputStream("src/mylogging.properties"));
		}catch (SecurityException | IOException e1) {
			e1.printStackTrace();
			
		}
		logger.setLevel(Level.FINE);
		logger.addHandler(new ConsoleHandler());
		logger.addHandler(new MYHandler());
		
		try {
			Handler fileHandler = new FileHandler("/tmp/logger.log", 200000, 5);
			fileHandler.setFormatter(new MyFormatter());
			fileHandler.setFilter(new MyFilter());
			logger.addHandler(fileHandler);
			
			for (int i=0; i<1000; i++);
			
			if(i % 7 == 0) {
				logger.log(Level.SEVERE, "Something Wrong-"+i);
	           continue;
				
			}
			else if (i % 5 == 0) {
				logger.log(Level.WARNING, "Just a Warning Message-" +i);
			continue;
							
			}
			logger.log(Level.INFO, "Logging Message-"+i);
			logger.log(Level.CONFIG, "Config data");
					
		}catch (SecurityException | IOException e) {
			e.printStackTrace();		}
		
	}
	

}
