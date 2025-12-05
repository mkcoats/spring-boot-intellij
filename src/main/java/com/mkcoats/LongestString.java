package com.mkcoats;

public class LongestString {
    public String findLongestString(String[] arr){
        int maxLength = 0;
        String longestStr = null;
        for (String str : arr) {
            if (str.length() > maxLength) {
                maxLength = str.length();
                longestStr = str;
            }
        }
        return longestStr;
    }

}
