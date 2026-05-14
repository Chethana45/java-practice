import java.util.Scanner;

public class School
{
    String PassOrFail(int Tmarks)
    {
        if(Tmarks>=35)
        {
            return "Student is pass";
        }
        else
        {
            return "Student is fail";
        }
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the total marks: ");
        int marks = scan.nextInt();
        School stu1 = new School();
        String info = stu1.PassOrFail(marks);
        System.out.print(info);
    }
}