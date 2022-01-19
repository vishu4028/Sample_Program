package Loop;

public class Add_Rec{
    
    public int m1(int n) 
    {
        if( n==0)
        {
            return 0;
        }
        else
        {
            return n+(m1(n-1));
        }
    }
    public int path(int n, int m)
    {
        if(n==1 || m==1)
        {
            return 1;
        }
        
        return path(n,m-1) +path(m,n-1);
        
    }
    
    public static void main(String[] arg)
    {
        Add_Rec n=new Add_Rec();
        
        //int sum=n.m1(5);
        
        System.out.println(n.path(4,4));
    }
    
}
