import java.lang.*;
import java.util.*;

class C
{
    int num;
    Scanner sc=new Scanner(System.in);

    void input()
    {
        System.out.println("Enter the number=");
        num=sc.nextInt();
    }
    void check()
    {
        if(num%2==0)
        {
            System.out.println("Number is non prime number");
        }
        else{
            System.out.println("Number is prime number");
        }
    }
}
public class conditionalstatement {
    public static void main(String args[])
    {
        C c1=new C();
        c1.input();
        c1.check();
    }
}
