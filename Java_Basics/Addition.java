/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_practice;
import java.lang.*;
import java.util.*;

class A
{
    int a,b,c;
    Scanner sc=new Scanner(System.in);
    void input(){
        System.out.println("Enter the value of a=");
        a=sc.nextInt();
        System.out.println("Enter the value of b=");
        b=sc.nextInt();
        
    }
    void add()
    {
        c=a+b;
        System.out.println("Addition of two number ="+c);
    }
}
public class Addition 
{
    public static void main(String args[])
    {
       A a1=new A();
       a1.input();
       a1.add();
    }
}
