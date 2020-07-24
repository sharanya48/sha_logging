package com.vnr.epam.logging;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HouseConstruction {
	private static Logger LOGGER=LogManager.getLogger(HouseConstruction.class);
	public void constructionCost()
	{	Scanner reader=new Scanner(System.in);
		LOGGER.info("enter your choice for material to be used");
		LOGGER.info("1.Standard Materials 2.Above Standard Materials 3.High standard materials 4.High standard materials andAutomated house");
		int materialChoice=reader.nextInt();
		LOGGER.info("Enter area of house in square feets");
		float area=reader.nextInt();
        double totalCost[]={12000*area,15000*area,18000*area,25000*area};
        LOGGER.info("cost for constructing a house is "+totalCost[materialChoice-1]);
     }


}
