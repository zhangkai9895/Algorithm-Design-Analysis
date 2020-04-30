package Sort;

public class BucketSort {
    static int[] bucket_sort(int[] arr,int max_value){
        int[] bucket = new int[max_value+1];
        int[] output = new int[arr.length];

        for(int i =0;i<arr.length;i++){
            bucket[arr[i]]++;
        }
        int pos=0;
        for(int i=0;i<bucket.length;i++){
            for (int j =0;j<bucket[i];j++){
                output[pos++]= i;
            }
        }
        return output;
    }
    static int maxValue(int[] arr){
        int max_value=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>max_value){
                max_value=arr[i];
            }
        }
        return max_value;
    }
    public static void main(String[] args){
        int arr[] = {2,2,1,1,5,10,9};
        int max_value = maxValue(arr);
        int output[] = bucket_sort(arr,max_value);
        for (int i=0;i<arr.length;i++){
            System.out.print(output[i]+" ");
        }
    }
}
