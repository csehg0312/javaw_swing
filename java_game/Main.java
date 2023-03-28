import java.io.*;
import java.util.Arrays;
import Sortpack.HeapSort;
import Sortpack.BinarySearch;


public class Main {
    public static void main(String[] args){
        int[] arr = {4, 1, 3, 9, 7, 0, 25, 5, 6, 9, 7, 6, 15, 4, 2, 1};
        //HeapSort sorter = new HeapSort();
        HeapSort.sort(arr);
        System.out.println(Arrays.toString(arr)); // Output: [1, 3, 4, 7, 9]


        int found = BinarySearch.search(arr, 5);
        if (found != -1){
            System.out.println(found);
        }
        else{
            System.out.println("Not found in Array");
        }
    }
    

}
