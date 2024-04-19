
import java.util.Scanner;

public class NumberEvenOdd
{
    public static void main(String[] args)
    {
        System.out.println("Enter a Number:");
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();

        if (n%2==0)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is Odd");
        }
    }
}
