import java.util.Scanner;

public class Prime {

    public static void main(String[] args)
    {
        boolean flag=false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range 1");
        int n1=sc.nextInt();
        System.out.println("Enter the largest range");
        int n2 = sc.nextInt();

        for( int i=n1;i<=n2;i++)
        {
            if(n1%2==0)
            {
                flag =true;

            }
        }

        if(!flag)
        {
            System.out.println("it is prime number"+n1);
        }

    }


  
    }
    
