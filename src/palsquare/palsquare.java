package src.palsquare;

/*
TASK: palsquare
LANG: JAVA
ID: rajasmg1 
 */

import java.io.*;
import java.util.*;

public class palsquare {

	public static void main(String[] args) throws IOException{
		//
		Scanner in = new Scanner(new File("palsquare.in"));
		PrintWriter out = new PrintWriter(new FileWriter("palsquare.out", true), true);
		//Map<Integer, String> outputmap = new HashMap<Integer, String>();
		Integer base = in.nextInt();
		
		for(int i = 1; i <= 300; i++) {
			String temp = Integer.toString(i * i, base);
			if(isPal(temp)) {
				//outputmap.put(Integer.parseInt(Integer.toString(i, base)), temp);
				out.println(Integer.toString(i, base).toUpperCase() + " " + temp.toUpperCase());
			}
		}
		/*TreeMap<Integer, String> sorted = new TreeMap<>(); 
		  
        // Copy all data from hashMap into TreeMap 
        sorted.putAll(outputmap); 
  
        // Display the TreeMap which is naturally sorted 
        for (Map.Entry<Integer, String> entry : sorted.entrySet())  
        	out.println(entry.getKey() +  " " + entry.getValue());*/  
		in.close();
		out.close();
	}
	
	public static boolean isPal(String num) {
		String r = new StringBuilder(num).reverse().toString();
		return num.equals(r);
	}

}
