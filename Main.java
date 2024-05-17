package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {6,3,8,54,6,4,7,4,7,3,7,9,6,3,56,8,4,7};
        quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));

    }

    private static void quickSort(int[] array,int lowIndex,int highIndex){
        if(lowIndex>=highIndex){
            return ;
        }
          int pivot = array[highIndex];
          int leftPointer = lowIndex;
          int rightPointer = highIndex;

          while(leftPointer<rightPointer){
              while(array[leftPointer]<=pivot && leftPointer<rightPointer){
                  leftPointer++;
              }
              while(array[rightPointer]>=pivot && leftPointer<rightPointer){
                  rightPointer--;
              }
              swap(array,leftPointer,rightPointer);
          }
          swap(array,leftPointer,highIndex);
          quickSort(array,lowIndex,leftPointer-1);
          quickSort(array,leftPointer+1,highIndex);
    }

    private static void swap(int[] array,int left,int rigth){
        int temp = array[left];
        array[left] = array[rigth];
        array[rigth] = temp;
    }


}
