package Loop;


public class Reverse_Number {
    
    public static void main(String [] arg)
    {
        int num=25546,rem,rev=0;
        
        while(num!=0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println(rev);
    }
    
}
