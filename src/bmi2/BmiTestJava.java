package bmi2;

import java.util.Scanner;

public class BmiTestJava {

	public void main(String[] args) {
		Bmi bmi= new Bmi();
		int x=3;
		Bmi[] arrBmi = new Bmi[x];
		double[] calculatedBmi = new double[x];
		String[] interpretBmi = new String[x];
		Scanner sc = new Scanner(System.in);
		//split(x, arrBmi);
		indexOfAndSubs(x , arrBmi);
		for(int j=0; j<x; j++)
		{
			calculatedBmi[j] = bmi.getBMI(arrBmi[j].getWeight(), arrBmi[j].getWeight());
		}
		for(int k=0; k<x; k++)
		{
			interpretBmi[k] = bmi.getStatus(calculatedBmi[k]);
		}
		for(int l=0; l<x; l++)
		{
			System.out.println("** The BMI result for " +arrBmi[l].getName()+"( Age: "+arrBmi[l].getAge()+" Weight: "+arrBmi[l].getWeight()+" Height: "+arrBmi[l].getHeight()+") "+ interpretBmi[l]);
		}
		

	}

	private void split(int x,Bmi[] arrBmi) {
		Scanner sp= new Scanner(System.in);
		for(int i = 0 , kisi = 0 ; i < x ; i++, kisi++) {
			System.out.println("---ENTER PERSON " +(i+1)+ " 'S VALUES---");
			System.out.println("Enter name, age, weight, height: (as space separated) ");
			String target = sp.nextLine();
			String [] array = target.split(" ");
			arrBmi[kisi].setName(array[0]);
			arrBmi[kisi].setAge(Integer.parseInt(array[1]));
			arrBmi[kisi].setWeight(Integer.parseInt(array[2]));
			arrBmi[kisi].setHeight(Integer.parseInt(array[3]));
		}
	}
	private void indexOfAndSubs(int x, Bmi[] arrBmi) {
		Scanner sp= new Scanner(System.in);
		for(int i = 0 , kisi = 0 ; i < x ; i++, kisi++) {
			System.out.println("---ENTER PERSON " +(i+1)+ " 'S VALUES---");
			System.out.println("Enter name, age, weight, height: (as space separated) ");
			String target = sp.nextLine();
			String [] array = new String [4];
			int temp = 0;
			for(int j = 0 ; j < 4 ; j++) {
				int spaceLocation= target.indexOf(" ");
				array[j] = target.substring(temp, spaceLocation);
				target = target.substring(spaceLocation);
				temp = spaceLocation;
			}
			arrBmi[kisi].setName(array[0]);
			arrBmi[kisi].setAge(Integer.parseInt(array[1]));
			arrBmi[kisi].setWeight(Integer.parseInt(array[2]));
			arrBmi[kisi].setHeight(Integer.parseInt(array[3]));
		}
	}

}
