package algorithm.anagram;

import java.util.Arrays;

public class Anagram {

    /**
     * Method to check anagram
     * First: convert string to char array
     * Second: Check length of string is equal or not
     * third: sort the char array
     *
     *
     * @param s1
     * @param s2
     * @return
     */
    public static boolean checkAnagram(String s1, String s2){
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        if(ch1.length != ch2.length){
            return false;
        }else{
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            for(int i=0;i<ch1.length;i++){
                if(ch1[i]!=ch2[i]){
                    return false;
                }
            }
        }


        return true;
    }


    public static void main(String[] args) {
        String s1 = "earth";
        String s2 = "heart";
        boolean flag = checkAnagram(s1,s2);
        if(flag){
            System.out.println("Strings are anagram");
        }else{
            System.out.println("Strings are not anagram");
        }
    }
}
