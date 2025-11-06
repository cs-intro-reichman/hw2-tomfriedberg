// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {

	    int n = Integer.parseInt(args[0]);
		String letter = args[1];
		int n2 = 1;
		int n3 = 1;
		int steps = 1;
		String sh = "";

		while(n2<=n)
		{
			sh = sh + n2;
			while(n2 != 1)
				{
				if(n2%2 == 0)
				{
					n2 = n2/2;
				}
				else 
				{
					n2 = n2*3 + 1;
				}
				sh = sh + " " + n2;
				steps ++;
			}
			
				if(letter.equals("v"))
				{
					System.out.println(sh + " (" + steps + ")");
				}
			
			n3++;
			n2 = n3;
			sh = "";
			steps = 1;
	}

	System.out.println(sh);

	}
}
