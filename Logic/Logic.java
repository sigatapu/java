package Logic;

public class Logic {
    public int sum_of_n(int arr[]){
        int result = 0;
        for(int i:arr){
            result = result+i;
        }
        return result;
    }

    public int count_digit(int n){
        int temp = n ; 
        int count = 0;
        while(temp>0){
            count = count + 1;
            temp = temp/10;
        }
        return count;
    }
}
