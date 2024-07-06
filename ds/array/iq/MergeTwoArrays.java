package ds.array.iq;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {11,16,19,89,91};
        int[] arr2 = {1,5,19,86,91};
        System.out.println(mergeTwoSortedArray(arr1, arr2));
    }

    private static List mergeTwoSortedArray(int[] arr1, int[] arr2){
        List finalMergedArray = new ArrayList<>();
        boolean a = true;
        int i = 0;
        int j = 0;
        while(a){
            if(arr1[i] < arr2[j]){
                finalMergedArray.add(arr1[i]);
                if(i < arr1.length-1) {
                    i++;
                }else{
                    finalMergedArray.add(arr2[j]);
                    break;
                }
            }else if(arr1[i] > arr2[j]){
                finalMergedArray.add(arr2[j]);
                if(j < arr2.length-1) {
                    j++;
                }else{
                    finalMergedArray.add(arr1[i]);
                    break;
                }
            }else if(arr1[i] == arr2[j]){
                finalMergedArray.add(arr1[i]);
                if(i < arr1.length-1) {
                    i++;
                }else{
                    finalMergedArray.add(arr2[j]);
                    break;
                }
                finalMergedArray.add(arr2[j]);
                if(j < arr2.length-1) {
                    j++;
                }else{
                    finalMergedArray.add(arr1[i]);
                    break;
                }
            }else{
                a = false;
            }
        }
        return finalMergedArray;
    }
}
