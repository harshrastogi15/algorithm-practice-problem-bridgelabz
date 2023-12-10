package algorithm.allpermutation;

import java.util.*;

public class PrintAllPermutation {


    /*
    *   Method to swap in string
    */
    public static String swap(String s,Integer i,Integer j){
        char[] charArray = s.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;

        return new String(charArray);
    }

    /*
    *   Print all permutation of string using recursive method
    */
    public static ArrayList<String> ans = new ArrayList<>();
    public static void allPermutationRecursive(String s,Integer i,Integer j){

        if(i.equals(j)){
            ans.add(s);
        }
        for(Integer k=i;k<j;k++){
            s = swap(s,i,k);
            allPermutationRecursive(s,i+1,j);
            s = swap(s,i,k);
        }
    }

    public static void main(String[] args){
        System.out.println("Print all permutation of string");
        String s= "ABCD";
        allPermutationRecursive(s,0,s.length());
        System.out.println(ans);
    }
}
