/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Library {
    public static void main(String[] args) {

//        int[] arr={1,2,3,4,5,5};
//        int rollNumber=8;
//        int[] arrays={1,2,3,4};
//        System.out.println(Arrays.toString(roll(rollNumber)));
//        System.out.println((containsDuplicates(arr)));
//        System.out.println((calculateAvg(arrays)));

    }

    public int[] roll (int rollNumber){
        int [] array =new  int [rollNumber];
        for(int i=0;i<array.length;i++){
            array[i]=(int)(5*Math.random())+1;
        }
        System.out.println(array);
        return array;
    }
    public  boolean containsDuplicates (int [] arr){
        boolean isThereareDuplicates =false;
        for (int i=0;i<arr.length;i++){
            for (int x=i+1;x<arr.length;x++){
                if( arr[i] == arr[x]){
                    isThereareDuplicates=true;
                }
            }
        }
        return isThereareDuplicates;
    }
    public  double calculateAvg (int[] arrays){
        int sum =0;
        for (int i=0;i<arrays.length;i++){
            sum  =sum + arrays[i];
        }
        double avg= (double) sum /arrays.length;
        return avg;

    }
    public  int [] lowestaverage ( int [][] matrixArr){
        ArrayList<Double> avgTemp = new ArrayList<>();
        for(int i=0;i<matrixArr.length;i++){
            double sum =0;
            for (int j=0;j<matrixArr[i].length;j++){
                sum =sum + matrixArr[i][j];
            }
            avgTemp.add(sum/matrixArr[i].length);
        }
        return matrixArr[avgTemp.indexOf(Collections.min(avgTemp))];
    }


}