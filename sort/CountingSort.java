package Sort;

public class CountingSort {
    void sort(int[] arr) {
        int n = arr.length;

        int output[] = new int[n];

        int count[] = new int[20];
        for (int i = 0; i < 20; i++) {
            count[i] = 0;
        }
        for (int i = 0; i < n; ++i) {
            ++count[arr[i]];
        }
        for (int i = 1; i < 20; ++i) {
            count[i] += count[i - 1];
        }
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            --count[arr[i]];
        }

        for (int i = 0; i < n; ++i) {
            arr[i] = output[i];
        }

    }
    public static void main(String[] args){
         CountingSort ob = new CountingSort();
         int arr[] = {2,2,1,1,5,10,9};
         ob.sort(arr);
         for (int i=0;i<arr.length;i++){
             System.out.print(arr[i]);
         }
    }

}