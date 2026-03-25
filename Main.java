import java.util.*;
import methods.*;

class Main {

    public static int sum_of_naturalN(int n) {
        int result = (n * (n + 1)) / 2;
        return result;
    }

    public static int count_digit(int n) {
        int temp = n;
        int count = 0;
        while (temp > 0) {
            count = count + 1;
            temp = temp / 10;
        }
        return count;
    }

    public static boolean palindrome(int n) {
        int temp = n;
        int rev = 0;
        while(temp>0){
            int ld = temp%10 ;
            rev = (rev*10) +  ld;
            temp = temp/10;
        }
        return n==rev;
    }

    public static long factorial(int n){
        long result = 1;
        for(int i=1; i<=n ;i++){
            result = result*i;
        }
        return result;
    }

    public static void main(String[] args) {
       
        System.out.println(factorial(5));

        

    }

}