import java.util.Scanner;

public class ourInformation
{
    String getName()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        return name;
    }
    int getNumber()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your phone number: ");
        int number = scan.nextInt();
        return number;
    }

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        ourInformation person1 = new ourInformation();
        String name = person1.getName();
        int phoneNumber = person1.getNumber();
        System.out.println("Informations about the person\n\t"+ name +"\n\t"+ phoneNumber);
    }
}