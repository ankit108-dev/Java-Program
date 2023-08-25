import java.util.Scanner;
public class prime {
    public static void checkPrime(int n)
    {
       int  flag=0;
        for(int i=2;i<+n-1;i++)
        {
            if(n%i==0)
            flag=1;
        }
        if(flag==0)
        {
            System.out.println("number is prime");
        }
        else{
            System.out.println("number is not prime");
        }

    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        checkPrime(n);
        scan.close();
    }
    
}
