package Sort;

import java.util.Random;

public class RandomisedQuickSort {

    Random random = new Random();

    int partion(int arr[],int low,int high){
        int ran = random.nextInt(high-low)+low;
        int temp1 =arr[ran];
        arr[ran]=arr[high];
        arr[high]=temp1;

        int pivot = arr[high];
        int i = low -1;
        for(int j =low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    void sort(int arr[],int low,int high){
        if(low<high){
            int pi =partion(arr,low,high);

            sort(arr,low,pi-1);
            sort(arr,pi+1,high);

        }
    }
    static void printArray(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        RandomisedQuickSort ob = new RandomisedQuickSort();
        ob.sort(arr, 0, n-1);

        System.out.println("sorted array");
        printArray(arr);
    }


}
