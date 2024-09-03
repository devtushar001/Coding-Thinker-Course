package ictmq.exceptionHandling;

import java.util.Scanner;

public class exceptionalHandling {
    public static void main(String[] args) {
    int [] marks = new int[6];
    marks[0] = 34;
    marks[1] = 14;
    marks[2] = 07;
    marks[3] = 71;
    marks[4] = 24;
    marks[5] = 21;

    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the array index : ");
    int ind = sc.nextInt();

    System.out.println("Enter the number you want to divide the value with : ");
    int number = sc.nextInt();

    System.out.println(marks[0]);

    try {
        System.out.println("The value at array index entered is : " +marks[ind]);
        System.out.println("The value of array-value/number is : " +marks[ind] / number);
    } catch (ArithmeticException e) {
        System.out.println("Arithmatic Exception Occured!");
        System.out.println(e);
    } catch (IndexOutOfBoundsException e) {
        System.out.println("The value of this index does't exist ! ");
        System.out.println(e);
    } catch (Exception e) {
        System.out.println("Some other exception occured!");
        System.out.println(e);
    }  
 }
}
