package Loop;

public class Power_Recursion {
    
    public int m1(int n,int pow) 
    {
        if( pow==0)
        {
            return 1;
        }
        else
        {
            return n*(m1(n,pow-1));
        }
    }
    
    public static void main(String[] arg)
    {
        Power_Recursion n=new Power_Recursion();
        
        int sum=n.m1(3,4);
        System.out.println(sum);
    }
    
}
