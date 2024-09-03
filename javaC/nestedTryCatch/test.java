package javaC.nestedTryCatch;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int [] marks = new int[4];
        marks[0] = 23;
        marks[1] = 22;
        marks[2]= 17;
        marks[3] = 13;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a index value : ");
        boolean escm = true;
        while (escm) {
        try {
            System.out.println("Nested if else statement in java");
            int ind = sc.nextInt();
            // System.out.println("Process 1 completed");
            try {
                System.out.println(marks[ind]);
                escm = false;
            } catch (ArrayIndexOutOfBoundsException e) {
                // TODO: handle exception
                System.out.println("Exception in level 2");
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception in level 1");
        }
    }
    System.out.println("Thanks for using this program");
  }
}
