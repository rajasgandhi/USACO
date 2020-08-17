package src.friday;
/*
		ID: rajasmg1
		LANG: JAVA
		TASK: friday
		*/
import java.io.*;

public class friday {
    public static void main(String[] args) throws Exception {
    	//Reads the amount of people there are and creates the necessary hashmap
        BufferedReader in = new BufferedReader(new FileReader("friday.in"));
        Integer numYears = Integer.parseInt(in.readLine());
        int[] arr = new int[7];
        int calendarDay = 0;
        int[] days = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int[] leapDays = new int[] { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        for(int i = 1900; i < 1900+numYears; i++) {
        	for(int m = 0; m < 12; m++) {
        		int day = (calendarDay + 12) % 7;
                arr[day]++;
                calendarDay += isLeap(i) ? leapDays[m] : days[m];
        	}
        }

        
        //Writes the values of the amount of money to the output file
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("friday.out")));
        out.print(arr[5]);
        out.print(' ');
        out.print(arr[6]);
        out.print(' ');
        out.print(arr[0]);
        out.print(' ');
        out.print(arr[1]);
        out.print(' ');
        out.print(arr[2]);
        out.print(' ');
        out.print(arr[3]);
        out.print(' ');
        out.print(arr[4]);
        out.println();
        in.close();
        out.close();
    }
    public static boolean isLeap(int year) {
    	if (year % 100 == 0)
    		return year % 400 == 0;
    	return year % 4 == 0;
    }
}