import java.util.ArrayList;
public class Practice {
    public static void main(String[] args){

        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        
        for(int i=10 ; i<=100; i=i+10){ a.add(i);}
        System.out.println(a);
        a.add(1,30);
           
        System.out.println(a);
        b=a;
        System.out.println(b);
    }
}
