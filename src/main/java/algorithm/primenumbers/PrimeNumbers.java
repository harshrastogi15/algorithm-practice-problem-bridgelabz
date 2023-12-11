package algorithm.primenumbers;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeNumbers {

    /**
     * Method to find Prime Number in range [0,N]
     *
     * @param N
     * @return array
     */
    public static ArrayList<Integer> findPrimeNumbers(int N){
        ArrayList<Integer> prime = new ArrayList<>();
        boolean[] flag = new boolean[N+1];
        Arrays.fill(flag,false);
        for(int i=2;i<=N;i++){
            if(!flag[i]){
                prime.add(i);
                flag[i] = true;
                for(int k=i;k<=N;k+=i){
                    flag[k] = true;
                }
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        ArrayList<Integer> prime = findPrimeNumbers(1000);
        System.out.println("Prime: " + prime);
        ArrayList<Integer> palindrome = findPalindrome(prime);
        System.out.println("Palindrome: " + palindrome);
    }

    /**
    * Method to get all palindrome from primes
    *
     */

    public static ArrayList<Integer> findPalindrome(ArrayList<Integer> prime){
        ArrayList<Integer> palindrome = new ArrayList<>();
        for(Integer i : prime){
            if(isPalindrome(i)){
                palindrome.add(i);
            }
        }
        return palindrome;
    }


    /**
     * Method for checking Palindrome
     *
     * @param n
     * @return boolean
     */
    public static boolean isPalindrome(int n){
        String strNumber = String.valueOf(n);
        return strNumber.equals(new StringBuilder(strNumber).reverse().toString());
    }

}
