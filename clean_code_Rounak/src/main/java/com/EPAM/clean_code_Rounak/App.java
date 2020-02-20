package com.EPAM.clean_code_Rounak;

/**
 * Hello world!
 *
 */
import java.util.*;
class Interest_Calculator
{
	static double Simple_Interest(double principle, double year, double rate)
	{
		double SI=(principle*year*rate)/100;
		return SI;
	}
	static double Compound_Interest(double principle,double year, double rate)
	{
		double increment=1+(rate/100);
		double CI=Math.pow(increment, year)*principle;
		return CI;
	}
}

class ConstructionCost
{
	static double TotalCost(int materialChoice,double area)
	{
		double total_cost=0;
		switch(materialChoice)
		{
		case 1:
			total_cost=1200*area;
			break;
		case 2:
			total_cost=1500*area;
			break;
		case 3:
			total_cost=1800*area;
			break;
		case 4:
			total_cost=2500*area;
			break;
		}
		return total_cost;
	}

}
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.append("Enter the princile amount, year, and rate of interest");
    	double principle=sc.nextDouble();
    	double year=sc.nextDouble();
    	double rate=sc.nextDouble();
    	System.out.append("Press 1 to check Simple Interest\nPress 2 to check Compound Interest");
    	int choice=sc.nextInt();
    	if(choice==1)
    	{
    		Interest_Calculator.Simple_Interest(principle,year,rate);
    	}
    	else
    	{
    		Interest_Calculator.Compound_Interest(principle,year,rate);
    	}
    	System.out.append("Enter yout housing area:");
    	float area=sc.nextFloat();
    	System.out.append("Press 1 for standard material\nPress 2 for above standard material\nPress 3 for high standard material\nPress 4 for high standard material and fully automated home");
    	choice=sc.nextInt();
    	ConstructionCost.TotalCost(choice,area);
    }
}
