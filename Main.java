import arrays.Arr;
public class Main {
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5};
        Arr a = new Arr();
        a.print_array(arr);
        arr = a.reverse(arr);
        a.print_array(arr);
    }
}
