package ArraysAndStrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        /*
        // for isUnique
        String str1 = bufferedReader.readLine();
        System.out.println(IsUnique.isUnique(str1));
        // for checkPermutation
        String str1 = bufferedReader.readLine();
        String str2 = bufferedReader.readLine();
        System.out.println(CheckPermutation.checkPermutation(str1,str2));
        // for urlify
        String str1 = bufferedReader.readLine();
        System.out.println(URLify.urlify(str1));
         // for palindromePermutation
         */
        String str1 = bufferedReader.readLine();
        System.out.println(PalindromePermutation.palindromePermutation(str1));
    }
}
