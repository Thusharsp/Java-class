import java.util.Scanner;

class Averagecalculator {

    public static void mian(String []arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();
        float sum =num1+num2+num3;
        double avg = sum/3;
        System.out.println("Sum and average is " +sum +avg);
    }
}

