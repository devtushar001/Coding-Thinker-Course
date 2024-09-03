package javaC.throwThrows;

/**
 * NegetiveRadiusException extends Exception */
public class NegetiveRadiusException extends Exception{
    @Overried
    public String toString() {
       return "Radius can not be negetive";
    }

    @Override
    public String getMessage() {
        return "Radius can not be negetive"
    }
}

public class test {

    public static double area(int r) throws Exception {
        if (r < 0) {
            
        }
        double field = Math.PI * r * r;
        return field;
    }

    public static int divide(int a, int b) throws ArithmeticException{
        // Made by harry to devide
          int result = a/b;
          return result;
    }
    public static void main(String[] args) {
        try {
            int c = divide(4, 2);
            double z = area(3);
            System.out.println(c);
            System.out.println(z);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception Got");
        }
       
    }
}
