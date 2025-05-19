import java.lang.*;
import java.util.*;

class B
{
    int n;
    Scanner sc=new Scanner(System.in);

    void input()
    {
        System.out.println("Enter the value of n=");
        n=sc.nextInt();
    }

    void loop()
    {
        System.out.println("This the output of for loop");
        for(int i=1;i<n;i++)
        {
            System.out.println("Harsh");
        }
    }
}
public class forloop {
    public static void main(String args[])
    {
        B a1=new B();
        a1.input();
        a1.loop();
    }
}
