import java.util.*;
public class Practice {
    public static void main(String[] args){

       ArrayList<Integer> a = new ArrayList<>();
       ArrayList<Integer> b = new ArrayList<>();
       b= a;
       for(int i=10; i<=100 ; i=i+10){
           a.add(i);
       }
       a.set(0,999);
//        System.out.println(a.set(0,999));
        a.set(1,20);
        Collections.sort(a,Collections.reverseOrder());
        System.out.println(a);
     }
}
