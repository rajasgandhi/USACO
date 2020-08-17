package src.combo;

/*
		ID: rajasmg1
		LANG: JAVA
		TASK: combo
		*/
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class combo {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new FileReader("combo.in"));
        PrintWriter out = new PrintWriter(new FileWriter("combo.out"));

        // read in
        int N = in.nextInt();
        int[] farmerLock = new int[3];
        int[] masterLock = new int[3];

        // init
        for (int i = 0; i < farmerLock.length; i++)
            farmerLock[i] = in.nextInt();
        for (int i = 0; i < masterLock.length; i++)
            masterLock[i] = in.nextInt();

        int finalOutput = 0;

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                for (int k = 1; k <= N; k++) {
                    if (dist(i, farmerLock[0], N) && dist(j, farmerLock[1], N) && dist(k, farmerLock[2], N)
                            || dist(i, masterLock[0], N) && dist(j, masterLock[1], N) && dist(k, masterLock[2], N)) {
                        finalOutput++;
                    }
                }
            }
        }

        out.println(finalOutput);
        in.close();
        out.close();
    }

    private static boolean dist(int a, int b, int N) {
        return (Math.min(Math.min(Math.abs(a - b), Math.abs((a - b) + N)), Math.abs((a - b) - N)) <= 2);
    }
}