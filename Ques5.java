import java.util.Scanner;
public class Ques5 {
    public static void main(String arr[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number: ");
        int n = input.nextInt();
        input.close();
        System.out.println("i i^2 i^3 i^4");
        for(int i=1;i<=n;i++)
        {
            int first = i;
            int second =i*i;
            int third = i*i*i;
            int fourth = i*i*i*i;
            System.out.println(first+" "+second+" "+third+" "+fourth);
        }
        
    }
}
