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

    public void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        // return arr;
    }

    public int[] insert(int[] arr,int index,int value){

         int pos = 0;
         int[] temp = new int[arr.length+1];
         int j=0 ; 

         for(int i=0 ; i<temp.length;i++){
             if(i==index){
                temp[i]=value;
             }else{
                temp[i]=arr[j];
                j++;
             }
         }
         return temp;
    }

    public int[] delete(int[] arr, int index){
        int[] temp = new int[arr.length-1];
        int j =0;
        for(int i=0; i<arr.length;i++){
            if(i==index){
                continue;
            }else{
                temp[j] = arr[i];
            }
            j++;
        }
        return temp;
    }

    public static void leftRotate(int[] arr, int d){
        int n = arr.length;
        d = d%n;
        int[] temp = new int[n];
        int j = 0;
        //add elements next to the range in the front for temporary array
        for(int i=d; i<n; i++){
            temp[j] = arr[i];
            j++;
        }
        //adding the rotated elements at the end of array
        for(int i=0; i<d;i++){
            temp[j] = arr[i];
            j++;
        }
        //copying the temporary array to the original array 
        for(int i=0; i<n;i++){
            arr[i] = temp[i];
        }

    }
 
    public static void rightRotate(int[]arr, int d){
        int n = arr.length;
        d = d%n ;
        int[] temp = new int[n];
        int j=0;
        //adding the elements upto range in front of the temporary array at end
        for(int i=d;i<n;i++){
            temp[i] = arr[j];
            j++;
        }
        // adding next to range in front of temporary array
        for(int i=0;i<d;i++){
            temp[i] = arr[j];
            j++;
        
        }

        // updating the original array

        for(int i=0;i<n ;i++){
            arr[i]=temp[i];
        }
    }
 
    public static void prefix_sum(int[] arr){
        int[] temp = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            int total = 0;
            for(int j=0; j<=i;j++){
                total = total + arr[j];
            }
            temp[i] = total;
        }
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = temp[i];
        }
    }
}
