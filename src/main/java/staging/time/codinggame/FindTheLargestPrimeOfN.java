package staging.time.codinggame;

import java.util.Scanner;

public class FindTheLargestPrimeOfN {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int answer = 0;
        Boolean isPrime = true;
        for (int i = 0; i < N; i++) {
            int M = in.nextInt();
            if (answer < M) {
                for (int x = 2; x < M; x++) {
                    if (M % x == 0) {
                        isPrime = false;
                    }
                }

                if (isPrime == true) {
                    answer = M;
                }
            }

            isPrime = true;
        }
        System.out.println(answer);
    }
}

