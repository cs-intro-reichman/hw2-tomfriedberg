// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    
		int times = Integer.parseInt(args[0]);
		int num = 1;
		int mechane = 3;
		double sum = 1;
		double p = Math.PI;


		while(times>num)
		{

		if(num%2 == 0)
		{
			sum = sum + (1.0/mechane);
		}
		else
		{
			sum = sum - (1.0/mechane);
		}
		mechane = mechane + 2;
		num++;

	}
			


		System.out.println("pi according to Java: " + p);
		System.out.println("pi,  approximated:     " + sum*4.0);
	}
}
 