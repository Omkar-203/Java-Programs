import java.util.Scanner;
import java.util.StringTokenizer;

public class St {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        Scanner sc= new Scanner(System.in);
        String s;
        System.out.println("Enter the value with space");
        s=sc.nextLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        while(st.hasMoreTokens()){
            String temp = st.nextToken();
            n= Integer.parseInt(temp);
            System.out.println(temp);
            sum=sum +n;
        }
        System.out.println("sum of the integer is :"+sum);
        sc.close();
    }
}
