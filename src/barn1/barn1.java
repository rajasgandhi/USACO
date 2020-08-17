package src.barn1;

/*
ID: rajasmg1
LANG: JAVA
PROG: barn1
*/

import java.util.*;
import java.io.*;

public class barn1 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new FileReader("barn1.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("barn1.out")));
		//input
		int M = in.nextInt();
		//int S = in.nextInt();
		int C = in.nextInt();
		int[] stalls = new int[C];
		int answer = 0;
		for(int i = 0; i < C; i++) {
			stalls[i] = in.nextInt();
		}
		Arrays.sort(stalls);
		ArrayList<Integer> diffs = new ArrayList<Integer>();
		for(int i = 1; i < C; i++)
			diffs.add(stalls[i]-stalls[i-1]);
		ArrayList<Integer> largestIndices = new ArrayList<Integer>();
		if(M == 1) {
			answer = stalls[stalls.length - 1] - stalls[0] + 1;
			out.println(answer);
		} else {
			for(int i = 0; i < M - 1; i++) {
				largestIndices.add(diffs.indexOf(Collections.max(diffs)));
				int index = diffs.indexOf(Collections.max(diffs));
				diffs.set(index, 0);
				
				if(i == C - 2) break;
				
			}
			
			Collections.sort(largestIndices);
			
			int startindex = 0;
			int endindex = largestIndices.get(0);
			
			for(int i = 0; i < largestIndices.size(); i++) {
				
				endindex = largestIndices.get(i);
				
				answer += stalls[endindex] - stalls[startindex] + 1;
				
				startindex = endindex + 1;
			}
			
			int lastindex = largestIndices.get(largestIndices.size() - 1);
			answer += stalls[C - 1] - stalls[lastindex + 1] + 1;
			out.println(answer);
		}
		in.close();
		out.close();	
		System.exit(0);
	}
}