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
        String numpeople = in.readLine();
        Map<String, Integer> peoplemap = new Hasmap<String, Integer>();
        while(i < numpeople)
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));
        out.close();
    }

    public static long getNumber(String str){
        long result = 1;
        for(int i = 0; i < str.length(); i++){
            result *= str.charAt(i) - 'A' + 1;
        }
        return result;
    }
}