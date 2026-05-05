package arrays;

public class Arr {
    public void print_array(int[] arr){
        System.out.print("[ ");
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.print("]");
        System.out.println("");
    }

    public int[] reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
