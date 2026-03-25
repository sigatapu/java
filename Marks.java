// This is mini project helped me how to use methods efficiently according to our use 
// i had got a great idea with this mini project 

// --------------------------------------------------------------------------------------------------------
//                                      STUDENT MARKS CALCULATOR
// --------------------------------------------------------------------------------------------------------                                      

import java.util.*;

class Marks {
    // it gives the sum of all elements in the array
    public static int sum(int arr[]) {
        int total = 0;
        for (int i : arr) {
            total = total + i;
        }
        return total;
    }

    // this function will checks if the student is passed in all subjects or not
    public static boolean pass_or_fail(int[] arr) {
        for (int i : arr) {
            if (i < 35) {
                return false;
            }
        }
        return true;
    }

    // this function will called when student is failed in particular subject
    public static void fail(int[] arr, String[] subjects) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 35) {
                System.out.println("Failed in " + subjects[i] + " you got " + arr[i] + " marks");
            }
        }
    }

    // this function checks whether the student is passed or failed
    // it means the student should get more than or equal to 35 in every subject
    // if student passed every subject it should give percentage
    // otherwise it shoould give the failed subject of the student
    public static void result(int arr[], String subjects[]) {
        if (pass_or_fail(arr)) {
            System.out.println("percentage : " + sum(arr) / arr.length);
        } else {
            fail(arr, subjects);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);// scanner class to take input

        String[] subjects = { "Telugu", "Hindi", "English", "Maths", "Science", "Social" };
        int[] arr = new int[6];

        for (int i = 0; i < subjects.length; i++) {
            System.out.print("Enter the marks for " + subjects[i] + ": ");
            int n = sc.nextInt();
            // System.out.println("");
            arr[i] = n;
        }
        System.out.println("");
        System.out.println("");

        // for (int i : arr) {
        // System.out.print(i + " ");
        // }

        result(arr, subjects);
    }
}