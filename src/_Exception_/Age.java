package _Exception_;

import java.util.Scanner;

class InvalidAgeException extends Throwable {
    InvalidAgeException(String s)
    {
        super();
    }
}
public class Age
{
    public static void main(String[] args) throws InvalidAgeException {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter age");
        int age;
        age=sc.nextInt();
        AgeCE obj=new AgeCE();
        obj.Eligible(age);
    }
}
class AgeCE{
    public void Eligible(int age) throws InvalidAgeException {
        if(age<18)
        {
            throw new InvalidAgeException("not eligible for vote");
        }
        else
            System.out.println("eligible");
    }
}
