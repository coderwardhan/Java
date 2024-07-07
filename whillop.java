import java.lang.*;
import java.util.*;

class D
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
        while(1<=n)
        {
            System.out.println("harsh");
            n-=1;
        }
    }
}

public class whillop
{
    public static void main(String args[])
    {
         D d1=new D();
         d1.input();
         d1.loop();
    }
    
}
