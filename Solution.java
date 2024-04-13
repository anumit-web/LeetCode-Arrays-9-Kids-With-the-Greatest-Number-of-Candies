/*
rm *.class
/usr/local/Cellar/openjdk/21.0.2/bin/javac *.java
/usr/local/Cellar/openjdk/21.0.2/bin/java Main
*/

import java.io.*;
import java.util.*;

class Solution {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> list = new ArrayList<>();

        int max = 0;
        int n = candies.length;
        for (int i = 0; i < n; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        int greatestCandies = 0;
        for (int i = 0; i < n; i++) {
            greatestCandies = candies[i] + extraCandies;
            if (greatestCandies >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }

        return list;
        
    }

}
