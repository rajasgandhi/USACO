/*
		ID: rajasmg1
		LANG: JAVA
		TASK: gift1
		*/
import java.util.*;
import java.io.*;

public class gift1 {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("gift1.in"));
        int numpeople = in.hashCode();
        Map<String, Integer> peoplemap = new HashMap<String, Integer>();
        PrintWriter out = null;
        int i = 0;
        while(i < numpeople) {
            out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));
        }
        out.close();
        in.close();
    }

    public static long getNumber(String str){
        long result = 1;
        for(int i = 0; i < str.length(); i++){
            result *= str.charAt(i) - 'A' + 1;
        }
        return result;
    }
}