import java.util.Scanner;

public class othercondi {
    public static void main(String []arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number between 1 to 4");
        int num = sc.nextInt();

        switch(num){

            case 1:
            System.out.println("You have entererd 1");
            break;

            case 2:
            System.out.println("You entered 2");
            break;

            case 3:
            System.out.println("ENtered 3");
            break;

            case 4:
            System.out.println("Entered number 4");
            break;

            default:
            System.out.println("Read the input statement again dumb A##");
        }
    }
}

