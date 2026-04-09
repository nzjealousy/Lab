
/**
 * Lab 1 Exercise 2 activity of class TestStrList .
 *
 * Nicholas Langit
 * 8/6/2024
 *
 * */
import java.util.ArrayList;
import java.util.Scanner;

public class lab1Exercise2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numberList1 = new ArrayList<Integer>();
        ArrayList<Integer> numberList2 = new ArrayList<Integer>();
        //1. store 5 integers in the list
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            int num = scan.nextInt();
            numberList1.add(num);
        }
        //2. display list
        System.out.println("Number list: " + numberList1);
        //3. display 4th index & replace with value 3 
        System.out.println("Number 4th : " + numberList1.get(4));
        System.out.print("Replace 4th number with 3 : ");
        int num = scan.nextInt();
        numberList1.set(3, num);
        System.out.println("Updated number list: " + numberList1);
        //4. find number 2 if in the list else display not found
        System.out.println("Find if number 2 in the list:");
        num = scan.nextInt();
        if (numberList1.indexOf(num) != -1) {
            System.out.println("Number 2 is in the list.");
        } else {
            System.out.println("Number 2 is not found in the list.");
        }
        //5. count and display sum of all numbers in the list
        int sum = 0;
        for (int number : numberList1) {
            sum += number;
        }
        System.out.println("Sum of all numbers in the list: " + sum);
        //6.remove even numbers from the list to list2
        for (int number : numberList1) {
            if (number % 2 == 0) {
                numberList2.add(number);
            }
        }
        for (int i = numberList1.size() - 1; i >= 0; i--) {
            int number = numberList1.get(i);
            if (number % 2 == 0) {
                numberList1.remove(i);
            }
        }
        //7. display all list
        System.out.println("Odd Number list: " + numberList1);
        System.out.println("Even number list: " + numberList2);
    }
}
