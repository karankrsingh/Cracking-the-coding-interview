package ArraysAndStrings;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// 1.1
// Implement an algorithm to determine if a string has all unique characters.
// What if you cannot use additional data structure.
public class IsUnique {
    public static boolean isUnique(String str){
        if(str.length() > 256){
            return false;
        }
        boolean[] visited = new boolean[256];
        for(int i=0;i<str.length();i++){
            int val = str.charAt(i);
            if(visited[val]){
                return false;
            }
            visited[val] = true;
        }
        return true;
    }
};
