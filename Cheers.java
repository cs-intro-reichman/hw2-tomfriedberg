public class Cheers {
        public static void main(String[] args) {
	    
        String word = args[0].toUpperCase();
        int times = Integer.parseInt(args[1]);
        int l = 0;
        String notvalidChars = "AEFHILMNORSX";

        while(l<word.length())
        {
                if(notvalidChars.indexOf(word.charAt(l)) >= 0)
                {
                        System.out.println("Give me an " + word.charAt(l) + ": " + word.charAt(l) + "!");
                }
                else
                {
                        System.out.println("Give me a  " + word.charAt(l) + ": " + word.charAt(l) + "!");
                }
                l = l +1;
        }

        l = 0;
        System.out.println("What does that spell?");

        while(l<times)
        {
                System.out.println(word + "!!!");
                l++;
        }







        }
}
