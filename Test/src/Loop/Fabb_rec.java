/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loop;


public class Fabb_rec {
        static int a=0,b=1,c;
    public void m1(int s)
    {
        if(s>=1)
        {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
            m1(s-1);
        }
    }
    
    public static void main(String [] arg)
    {
        
        System.out.print(a+" "+b+" ");
        Fabb_rec r = new Fabb_rec();
        
        r.m1(10);
        
    }
    
}
