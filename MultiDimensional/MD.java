/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logmein;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Hrishikesh
 */
public class MD {

    static Long sum = 0L;

    public static Long getValue(int... length) {
        Long n = 1L;
        return n;
    }

    public static Long sum(int[] lengthOfDeminsion) {
        // Your resolution 
        // Time complexity:  O(N^2)
        // Space complexity: O(n), taking a List<Integer> and some variables
        int i = 0;
        int num = 0;
        while (i < lengthOfDeminsion.length) 
        {
            num = num * 10 + lengthOfDeminsion[i];
            i++;
        }
        for (int j = 0; j < num; j++) {
            int j1 = j;
            List<Integer> ar = new ArrayList<>();
            while (j1 > 0) 
            {
                ar.add(j1 % 10);
                j1 = j1 / 10;
            }
            while (ar.size() < lengthOfDeminsion.length) 
            {
                ar.add(0, 0);
            }
            if (isValid(ar, lengthOfDeminsion)) 
            {
                sum = sum + getValue(j);
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        int[] arr = {2,2,2,3};
        System.out.println(sum(arr));
    }

    private static boolean isValid(List<Integer> ar, int[] lengthOfDeminsion) {
        int i = 0;
        while (i < ar.size()) {
            if (ar.get(i) >= lengthOfDeminsion[i]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
