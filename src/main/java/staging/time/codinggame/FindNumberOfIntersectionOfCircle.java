package staging.time.codinggame;

import javax.print.DocFlavor;
import java.lang.invoke.StringConcatFactory;
import java.util.Scanner;

public class FindNumberOfIntersectionOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int num = scanner.nextInt();
        int c = 0;
        for(int i = 1; i<num; i++){
            c+= i*2;
        }
        System.out.println(c);


    }

        /**
         * ou got lost in a size 5x5 mini maze.
         * The starting point is (1,1) and the goal is (3,3), always the same.
         *
         * The outside of the maze is always a wall.
         *
         *
         * Please lead to the goal in the shortest distance.
         * The moving method is familiar L, R, U, D.
         *
         * There is always one way to answer.
         * Input
         * 5 lines: a string LINE where ”.” is a passage and "#" is a wall
         * Output
         * Line 1 : The shortest path.
         * ex. RRDD
         * Constraints
         * LINE length 5
         * Example
         * Input
         * #####
         * #.###
         * #.###
         * #...#
         * #####
         * Output
         * DDRR
         */

}