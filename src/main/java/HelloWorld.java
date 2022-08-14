import java.util.Scanner;

public class HelloWorld {
    public static void main (String [] arg){

        float n = 2324435.3f;

        // here number is formatted from right margin and
        // occupies a width of 20 characters
        System.out.printf(
                "Formatted to right margin: n = %15.2f\n", n);

        n = 5.2f;

        // automatically appends zero to the rightmost part
        // of decimal
        System.out.printf(
                "Formatted to specific width: n = %.4f\n", n);

        System.out.printf("'%5.2f'%n", 5.1473);


        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%03d%n", s1, x);

            System.out.printf("%-15s%03d%n", s1, x);

        }
        System.out.println("================================");

    }
}
