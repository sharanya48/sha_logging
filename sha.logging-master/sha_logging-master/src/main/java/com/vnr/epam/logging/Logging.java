package com.vnr.epam.logging;

public class Logging 
{	
    public static void main( String[] args )
    {
    	
    	SimpleInterest si= new SimpleInterest();
        si.findingSimpleInterest();
        
        CompoundInterest ci=new CompoundInterest();
       ci.findingCompoundInterest();
        HouseConstruction ho=new HouseConstruction();
	    ho.constructionCost();
		
    }
}
