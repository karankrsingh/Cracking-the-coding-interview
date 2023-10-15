package ArraysAndStrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1.2
// Given two strings, write a method to decide if one is a permutation of the other.
public class CheckPermutation {
    public static boolean checkPermutation(String str1,String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        int[] countCharacters = new int[256];
        for(int i=0;i<str1.length();i++){
            countCharacters[str1.charAt(i)]++;
        }
        for(int i=0;i<str2.length();i++){
            if(countCharacters[str2.charAt(i)] > 0){
                countCharacters[str2.charAt(i)]--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
