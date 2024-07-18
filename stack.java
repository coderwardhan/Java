import java.util.*;

class A 
{
    int num;
    Scanner sc=new Scanner(System.in);

    Stack<Integer> st = new Stack<>();
    void input()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.print("Enter number=");
            num=sc.nextInt();
            st.push(num);
            System.out.println();
        }
    }
    void show()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.print("Element of stack = ");
            System.out.print(st.pop());
        }
    }

}

public class stack {
    public static void main(String args[])
    {
        A a1=new A();
        a1.input();
        a1.show();

    }
}
