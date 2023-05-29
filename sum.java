import java.util.Scanner;

public class sum {
    public static void main(String []arg)
    {
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter two number");
        //int num1 = sc.nextInt();
        //int num2 = sc.nextInt();
        //int c = num1+num2;
        //System.out.println("Addition:"+c);
        //c= num1 - num2;
        //System.out.println("Sub:"+c);
        //c = num1 * num2;
        //System.out.println("Mul:"+c);
        //if(num2!=0)
        //{
          //  c= num1 / num2;
            //System.out.println("Div:"+c);
       // }
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter 3 numbers");
       float num1 = sc.nextFloat();
       float num2 = sc.nextFloat();
       float num3 = sc.nextFloat();
       float sum =num1+num2+num3;
       double avg = sum/3;
       System.out.println(" average is "  +avg);


        
    }
}
