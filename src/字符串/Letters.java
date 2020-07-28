package 字符串;/*
 *@author tanguochao
 *@description
 *@date
 */

import java.util.Arrays;

public class Letters {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        System.out.println(nextLetter(letters, target));
    }

    public static char nextLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (letters[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        if (left == letters.length - 1 && letters[letters.length - 1] <= target)
            return letters[0];
        else
            return letters[left];
    }
}
