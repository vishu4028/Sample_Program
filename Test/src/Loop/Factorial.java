package Loop;


public class Factorial {
    
    public static void main(String [] args)
    {
        int val=5,fact=1;
        
        for(int i=1;i<=5;i++)
        {
            fact=fact*i;
            System.out.println(fact+" * "+i);
        }
        System.out.println(fact);
    }
    
}
