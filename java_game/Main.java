import java.io.*;
import java.util.Arrays;
import Sortpack.HeapSort;


public class Main {
    public static void main(String[] args){
        int[] arr = {4, 1, 3, 9, 7, 0, 25, 6, 9, 7, 6, 15, 4, 2, 1};
        HeapSort sorter = new HeapSort();
        sorter.sort(arr);
        System.out.println(Arrays.toString(arr)); // Output: [1, 3, 4, 7, 9]
    }
    

}
