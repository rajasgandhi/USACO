package src.transform;

/*
ID: rajasmg1
LANG: JAVA
TASK: transform
*/
import java.io.*;
import java.util.*;

public class transform {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new File("transform.in"));
		PrintWriter out = new PrintWriter(new FileWriter("transform.out", true), true);
		int N = in.nextInt();
		char[][] beforearr = new char[N][N];
		char[][] afterarr = new char[N][N];
		for(int i = 0; i < beforearr.length; i++) {
			beforearr[i] = in.next().toCharArray();
		}
		for(int i = 0; i < N; i++) {
			afterarr[i] = in.next().toCharArray();
		}
		if(equals(rotate(beforearr), afterarr)) 
			out.println("1");
		else if(equals(rotate(rotate(beforearr)), afterarr))
			out.println("2");
		else if(equals(rotate(rotate(rotate(beforearr))), afterarr))
			out.println("3");
		else if(equals(reflect(beforearr), afterarr)) 
			out.println("4");
		else if(equals(reflect(rotate(beforearr)), afterarr)) 
			out.println("5");
		else if(equals(reflect(rotate(rotate(beforearr))), afterarr))
			out.println("5");
		else if(equals(reflect(rotate(rotate(rotate(beforearr)))), afterarr)) 
			out.println("5");
		else if(equals(beforearr, afterarr))
			out.println("6");
		else 
			out.println("7");
		in.close();
		out.close();
	}
	
	public static char[][] rotate(char[][] one) {
		int length = one.length;
		char[][] ret = new char[one.length][one.length];
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < length; j++) {
				ret[j][length - i - 1] = one[i][j];
			}
		}
		return ret;
	}
	
	public static boolean equals(char[][] one, char[][] two) {
		for(int i = 0; i < one.length; i++) {
			for(int j = 0; j < one[0].length; j++) {
				if(one[i][j] != two[i][j])
					return false;
			}
		}
		return true;
	}
	
	public static char[][] reflect(char[][] one) {
		int length = one.length;
		char[][] ret = new char[length][length];
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < length; j++) {
				ret[i][j] = one[i][length - j - 1];
			}
		}
		return ret;
	}
}
