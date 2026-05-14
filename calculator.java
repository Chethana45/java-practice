import java.util.Scanner;

public class calculator
{
    void sum(float a, float b)
    {
        System.out.println("Addition of two numbers is "+ (a+b));
    }
    void sub(float a, float b)
    {
        System.out.println("Subtraction of two numbers is "+ (a-b));
    }
    void mul(float a, float b)
    {
        System.out.println("Multiplication of two numbers is "+ a*b);
    }
    void div(float a, float b)
    {
        System.out.println("Division of two numbers is "+ a/b);
    }

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter tha value of a: ");
        float a = scan.nextFloat();
        System.out.print("Enter the value of b: ");
        float b= scan.nextFloat();
        
        calculator calc1 = new calculator();
        calc1.sum(a,b);
        calc1.sub(a,b);
        calc1.mul(a,b);
        calc1.div(a,b);
    }
}