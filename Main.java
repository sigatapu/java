import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int n = sc.nextInt();
        System.out.println(count(n));
    }
    public static int count(int n){
        int count = 0;
        int temp = n ;
        while(temp>0){
            count = count+1 ;
            temp = temp/10;
        }
        return count;
    }
    
}
