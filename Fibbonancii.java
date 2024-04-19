import java.util.Scanner;

public class Fibonacci
{
    public static void main(String[] args) {
        //Initialization of variables
        int m = 0;
        int p = 1;
        int n = 0;
        
        do {
            System.out.println("Fibonacci Series Is:");
            System.out.println("Enter Number:");
            Scanner scanner = new Scanner(System.in);

            //Try catch block for exception handling
            try {
                n = scanner.nextInt();
                for (int i = 1; i <= n; ++i) {
                    System.out.print(m + ", ");
                    int Tn = m + p;
                    m = p;
                    p = Tn;
                }
            } catch (Exception exception)
              {
                System.out.println("Exception is" + exception);
              }
        } while (n <=100);
    }
}
