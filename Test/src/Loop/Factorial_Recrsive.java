package Loop;

public class Factorial_Recrsive {
    public int fact(int n)
    {
        int fa=1;
        if(n==0)
        {
            return 1;
        }
        else
        {
            System.out.println(n);
            return (n *fact(n-1));
            
        }
    }
    
    public static void main(String [] arg)
    {
        Factorial_Recrsive fr = new Factorial_Recrsive();
        int res=fr.fact(5);   
        System.out.println(res);
    }
}
