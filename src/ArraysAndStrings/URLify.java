package ArraysAndStrings;

// 1.3
// Write a method to replace all spaces in a string with '%20'.
// You may assume that the string has sufficient space at the end to hold the additional characters,
// and that you are given the "true" length of the string.
// (Note: If implementing in Java,please use a character array so that you can perform this operation in place.)
// EXAMPLE
// Input: "Mr John Smith ", 13 Output: "Mr%20John%20Smith"

public class URLify {
    public static String urlify(String str){
        int charCounts = 0;
        int spaceCounts = 0;
        for(int i=0;i<str.length();i++){
            if(Character.isLetterOrDigit(str.charAt(i))){
               charCounts++;
            }
            else{
                spaceCounts++;
            }
        }
        System.out.println(spaceCounts+" "+charCounts);
        int newLength = (spaceCounts*3)+charCounts+1;
        char[] resString = new char[newLength];
        resString[newLength-1] = '\0';
        System.out.println(resString);
        int newStrInd = newLength - 2;
        for(int i=str.length()-1;i>=0;i--){
            if(Character.isLetterOrDigit(str.charAt(i))){
                resString[newStrInd--] = str.charAt(i);
            }
            else{
                resString[newStrInd--]='0';
                resString[newStrInd--]='2';
                resString[newStrInd--]='%';
            }
        }
        return new String(resString);
    }
}
