package leetcodeExample;

/**
 *     N -> user input
 *     should be validated as a positive integer
 *     F(0) = 1
 *     F(1) = 1
 *     F(i) = F(i-1) + F(i-2)
 *
 * i=0,1,2,3,..,N-1
 *     N = 5
 *     1,1,2,3,5
 *
 */
public class FibonacciSeries {

    public static void main(String[] args) {





        //Scanner sc = new Scanner(System.in);
        int intputVal = 0;

        intputVal=10;

        int a =0,b=1,c=0;

        System.out.print("0" + " " + "1" + " ");
       for(int i=0; i <intputVal;i++){
            c= a+b;
            System.out.print(c+ " ");
            a=b;
            b=c;

        }
    }

}

