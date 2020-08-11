package gift1;
/*
		ID: rajasmg1
		LANG: JAVA
		TASK: gift1
		*/
import java.util.*;
import java.io.*;

public class gift1 {
    public static void main(String[] args) throws Exception {
    	//Reads the amount of people there are and creates the necessary hashmap
        BufferedReader in = new BufferedReader(new FileReader("gift1.in"));
        String numpeople = in.readLine();
        Map<String, Integer> peoplemap = new HashMap<String, Integer>();
        String[] people = new String[Integer.parseInt(numpeople)];
        for(int i = 0; i < Integer.parseInt(numpeople); i++) {
        	String s = in.readLine();
        	peoplemap.put(s, 0);
        	people[i] = s;
        }
        //Does the whole logic of the program
        for(int i = 0; i < Integer.parseInt(numpeople); i++){
            String person = in.readLine();
            StringTokenizer st = new StringTokenizer(in.readLine());
            int money = Integer.parseInt(st.nextToken());
            int nr = Integer.parseInt(st.nextToken());
            for(int j = 0; j < nr; j++){
              String r = in.readLine();
              peoplemap.put(r, peoplemap.get(r)+money/nr);
              peoplemap.put(person, peoplemap.get(person)-money/nr);
            }
          }
        //Writes the values of the amount of money to the output file
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));
        for(int i = 0; i < Integer.parseInt(numpeople); i++) {
        	
        		out.println(people[i] + " " + peoplemap.get(people[i]));
        	
        
        }
        out.close();
    }
}