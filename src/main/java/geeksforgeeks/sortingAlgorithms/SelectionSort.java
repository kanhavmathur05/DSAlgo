package geeksforgeeks.sortingAlgorithms;

import java.util.Scanner;

public class SelectionSort {
    public int[] sort(int[] arr) {
        int i, j,temp;
        for (i = 0; i < arr.length-1; i++) {
            int minIndex = i;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[i]>arr[j])
                {
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }

        return arr;
    }

    public static void main(String args[]) {

        SelectionSort sortObj=new SelectionSort();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sizxe of array:-");
        int size=sc.nextInt();
        System.out.println("Enter the elements in array:-");
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        int[] sortedArr=new int[size];

        sortedArr=sortObj.sort(arr);

        System.out.println("Sorted Array:-");

        for(int i=0;i<size;i++)
        {
            System.out.println(" "+sortedArr[i]);
        }
    }
}
