public class star {
    public static void main(String args[])
    {
        System.out.println("This is a program of star print");
        int n=5;
        for(int i= 0; i<n;i++)
        {
            for(int j=n-1;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
        for(int i= 0; i<n;i++)
        {
            
            for(int k=0;k<=i;k++)
            {
                System.out.print(" ");
            }
            for(int j=n-1;j>i;j--)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    
}
