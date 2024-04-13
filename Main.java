/*
/usr/local/Cellar/openjdk/21.0.2/bin/javac *.java
/usr/local/Cellar/openjdk/21.0.2/bin/java Main
*/

import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) {
        System.out.println("Number of Employees Who Met the Target");

        Solution solution = new Solution();

        int[] candies1 = { 2,3,5,1,3 };
        int extraCandies1 = 3;
        List<Boolean> result1= solution.kidsWithCandies(candies1, extraCandies1);
        System.out.println("Count = " + result1);

        int[] candies2 = { 4,2,1,1,2 };
        int extraCandies2 = 1;
        List<Boolean> result2 = solution.kidsWithCandies(candies2, extraCandies2);
        System.out.println("Count = " + result2);


    }
}
