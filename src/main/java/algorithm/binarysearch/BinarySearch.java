package algorithm.binarysearch;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class BinarySearch {


    /*
    * Read From File
    */
    public static ArrayList<String> fileRead(){
        ArrayList<String> list = new ArrayList<>();
        try {
            File nw = new File("D:/GE/Training/Assignment/data-structure-algorithm-bridgelabz/algorithm-practice/src/main/java/algorithm/binarysearch/data.txt");
//            File nw = new File("algorithm/binarysearch/data.txt");
            if (!nw.exists()) {
                System.out.println("File is Not Found");
                throw new FileNotFoundException();
            }
            Scanner reader = new Scanner(nw);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] temp =  line.split(",");
                list.addAll(List.of(temp));
            }
            reader.close();
        }catch (FileNotFoundException e){
            System.out.println("File Not Found");
        }
        return list;
    }

    public static void main(String[] args){
        ArrayList<String> list = fileRead();
        Collections.sort(list);
        System.out.println(list);
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Word");
        String s = scn.next();
        Integer flag = binarySearch(list,s);
        if(flag == -1){
            System.out.println("Word not found");
        }else{
            System.out.println("Word found");
        }
    }


    /**
     * Binary Search method
     *
     *
     * @param list
     * @param s
     * @return
     */
    private static Integer binarySearch(ArrayList<String> list, String s) {
        Integer mid ;
        Integer l=0,r=list.size()-1;

        while(l<=r){
            mid = l + (r-l)/2;
            if(s.equals(list.get(mid))){
                return mid;
            }else if(s.compareTo(list.get(mid)) > 0){
                l = mid+1;
            }else{
                r = mid-1;
            }
        }

        return -1;
    }
}
