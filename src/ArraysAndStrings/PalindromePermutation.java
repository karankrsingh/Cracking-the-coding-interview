package ArraysAndStrings;
// 1.4
// Given a string, write a function to check if it is a permutation of a palindrome.
// A palindrome is a word or phrase that is the same forwards and backwards.
// A permutation is a rearrangement of letters.
// The palindrome does not need to be limited to just dictionary words.
//EXAMPLE
//Input: Tact Coa
//Output: True (permutations: "taco cat", "atco eta", etc.) Hints:#106,#121,#134,#136
public class PalindromePermutation {
     public static boolean palindromePermutation(String str){
         // creating a bitmap bitVector which will keep on toggling the character index.
         // if bit is off means even number of time otherwise odd.
         int bitVector = 0;
         for(int i=0;i<str.length();i++) {
             if (Character.isLetter(str.charAt(i))) {
                 int mask = 1 << (str.charAt(i) - 'a');
                 if ((bitVector & mask) == 0) {
                     bitVector |= mask;
                 } else {
                     bitVector &= ~mask;
                 }
             }
         }
         if(bitVector == 0)
             return true;
         return (((bitVector)&(bitVector-1)) == 0);
     }
}
