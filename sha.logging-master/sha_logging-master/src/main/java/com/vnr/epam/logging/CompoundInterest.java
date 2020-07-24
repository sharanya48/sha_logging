package com.vnr.epam.logging;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

public class CompoundInterest {
	private static Logger LOGGER=LogManager.getLogger(CompoundInterest.class);
	public void findingCompoundInterest()
    {
		Scanner read=new Scanner(System.in);
		LOGGER.info("enter the principle amount");
		int principleAmount=read.nextInt();
		LOGGER.info("enter time period");
		int time=read.nextInt();
		LOGGER.info("enter rate of interest");
		int rateOfInterest=read.nextInt();
		double compoundInterest=principleAmount*Math.pow((1.0+(rateOfInterest/100.0)),time);
		LOGGER.info("Compound interest is "+compoundInterest);
        
    }
}
