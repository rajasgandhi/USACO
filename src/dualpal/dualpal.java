package src.dualpal;

import java.io.*;
import java.util.*;

/*
TASK: dualpal
LANG: JAVA
ID: rajasmg1
 */

public class dualpal {
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(new File("dualpal.in"));
		PrintWriter out = new PrintWriter(new FileWriter("dualpal.out", true), true);
		
		int N = in.nextInt();
		int S = in.nextInt();
		
		ArrayList<Integer> outputlist = new ArrayList<Integer>();
		int[] bases = new int[] {2,3,4,5,6,7,8,9,10};
		int start = S + 1;
		while(outputlist.size() < N) {
			int temp = 0;
			for(int j : bases) {
				if(isPal(Integer.toString(start, j))) {
					temp++;
					
				}
			}
			if(temp >= 2) {
				outputlist.add(start);
			}
			start++;
		}
		Collections.sort(outputlist);
		for(Integer i : outputlist)
			out.println(i);
		in.close();
		out.close();
	}
	
	public static boolean isPal(String num) {
		String r = new StringBuilder(num).reverse().toString();
		return num.equals(r);
	}
}
