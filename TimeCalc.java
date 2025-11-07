public class TimeCalc {
    public static void main(String[] args) {
        
        String time24h = args[0];
        int MinToAdd = Integer.parseInt(args[1]);


        int hours24 = Integer.parseInt(time24h.substring(0, 2)); 
        int minutes = Integer.parseInt(time24h.substring(3, 5)); 


        int totalMinutes = hours24*60 + minutes + MinToAdd;
        int totalHours = totalMinutes/60;
        int newHours = totalHours%24;
        int newMinutes = totalMinutes - (totalHours*60);



        if(newHours<10 || newMinutes<10)
        {
            if(newHours<10 && newMinutes<10)
            System.out.println("0" + newHours + ":0" + newMinutes);
            if(newHours<10 && newMinutes>10)
            System.out.println("0" + newHours + ":" + newMinutes);
            if(newHours>10 && newMinutes<10)
            System.out.println(newHours + ":0" + newMinutes);
        }
        else
        {
        System.out.println(newHours + ":" + newMinutes);
        }

    }
}
