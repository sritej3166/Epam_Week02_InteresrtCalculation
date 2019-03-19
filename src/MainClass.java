import java.util.Scanner;

public class MainClass {
	public static void main(String[] args)
	{
		InterestCalculate ic=new InterestCalculate();
		double principal, rate, time, simple_i,compound_i;
	    Scanner sc=new Scanner (System.in);
	    System.out.println("Enter the amount:");
	    principal=sc.nextDouble();
	    System. out. println("Enter the No.of years:");
	    time=sc.nextDouble();
	    System. out. println("Enter the Rate of  interest");
	    rate=sc.nextDouble();
	    sc.close();
	    simple_i=ic.SimpleIntCalc(principal,time,rate);
	    compound_i=ic.CompoundIntCalc(principal,time,rate);
	    System.out.println("Simple Interest is:"+simple_i);
	    System.out.println("Compound Interest is:"+compound_i);
	}
}
