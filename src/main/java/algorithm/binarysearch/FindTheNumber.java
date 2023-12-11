package algorithm.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindTheNumber {

    /**
     * Method to find the number using binary search
     *
     * @throws IOException
     */

    public static void findNumber() throws IOException {
        BufferedReader scn = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(scn.readLine());
        int left = 0, right = N;
        int cnt = 1;
        while(left<=right){
            int mid = left + (right-left)/2;
            int flag = userInput(scn, mid, cnt );
            if(flag == 0){
                System.out.println("We guess the number");return;
            }else if(flag == 1){
                right = mid-1;
            }else if(flag == 2){
                left = mid+1;
            }else{
                System.out.println("You entered wrong number");return;
            }
            cnt++;
        }
    }

    private static int userInput(BufferedReader scn, int mid, int cnt) throws IOException {
        System.out.println("Our " + cnt + " guess is "+ mid);
        System.out.println("if " + mid + " is equal to guess number then enter 0");
        System.out.println("if " + mid + " is greater than guess number then enter 1");
        System.out.println("if " + mid + " is less than guess number then enter 2");
        int flag = Integer.parseInt(scn.readLine());
        return flag;
    }


    public static void main(String[] args) {
        try {
            findNumber();
        }catch (IOException e){
            System.out.println("Error: ioexception");
        }

    }
}
