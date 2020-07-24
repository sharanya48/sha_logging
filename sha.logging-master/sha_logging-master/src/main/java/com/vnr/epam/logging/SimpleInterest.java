package com.vnr.epam.logging;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

public class SimpleInterest {
	private static Logger LOGGER=LogManager.getLogger(SimpleInterest.class);
	public void findingSimpleInterest()
    {
		Scanner read=new Scanner(System.in);
		LOGGER.info("enter the principle amount");
		int principleAmount=read.nextInt();
		LOGGER.info("enter time period");
		int time=read.nextInt();
		LOGGER.info("enter rate of interest");
		int rateOfInterest=read.nextInt();
		float simpleInterest=(principleAmount*time* rateOfInterest)/100;
		LOGGER.info("Simple interest is "+simpleInterest);
        
    }

}
