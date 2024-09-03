package javaC.HandlinSpecificException;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // System.out.println("Hello World");
        int [] marks = new int[4];
        marks[0] = 31;
        marks[1] = 50;
        marks[2] = 17;
        marks[3] = 19;

        // System.out.println(marks[1]);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index : ");
        int ind = sc.nextInt();
        System.out.println("Give a number to devide with : ");
        int number = sc.nextInt();

        try {
            System.out.println("Choosen a index value: " +marks[ind]);
            System.out.println("Answer :" +marks[ind]/number);
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("Arithmatic exception Occured!");
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException Occured!");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Some exception occured!");
            System.out.println(e);
        }
    }
}
