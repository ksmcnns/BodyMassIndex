package bmi2;

public class Bmi {

	private String name;
	private int age;
	private double weight;
	private double height;
	public static final double KILOGRAMS_PER_POUND = 0.45359237;
	public static final double METERS_PER_INCH = 0.0254;
	
	Bmi()
	{
		
		//constructor method
	}
	
	Bmi(String name,double weight, double height , int yas)
	{
		String sname=name;
		double dweight=weight;
		double dheight=height;
		yas = 20;
		age = yas;
		
	}
	Bmi(String name,int age, double weight, double height)
	{
		String sname=name;
		double dweight=weight;
		double dheight=height;		
		int iage=age;		
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public double getWeight()
	{
		return weight;
	}
	public double getHeight()
	{
		return height;
	}
	public void setName(String _name)
	{
		name = _name;
	}
	public void setAge(int _age)
	{
		age = _age;
	}
	public void setWeight(double _weight)
	{
		weight = _weight;
	}
	public void setHeight(double _height)
	{
		height = _height;
	}
	public  double getBMI(double kg, double m)
	{
		m=m/100;
		double poundResult = 0;
		poundResult = KILOGRAMS_PER_POUND/kg;
		double inchResult =METERS_PER_INCH/m;		
		return (poundResult/(inchResult*inchResult))*703;
	}
	public String getStatus(double bmi)
	{
		double x = bmi;
		String str1 ="is underweight";
		String str2 ="is normal";
		String str3 ="is overweight";
		String str4 ="is obese";
		
		if(x<18.5)
		{
			return str1;
		}
		else if(x<=18.5 && x<25) 
		{
			return str2;
		}
		else if(x<=25 && x<30) 
		{
			return str3;
		}
		else 
		{
			return str4;
		}		
	}
}
