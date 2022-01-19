package Loop;

public class Prime_1to100 {
    
    public static void main(String []argd)
    {
        int temp=0,total=0;
        for(int i=1;i<=100;i++)
        {
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    temp=temp+1;
                }
            }
            if(temp==0)
            {
                System.out.println(i);
                total=total+1;
            }
            else
            {
                temp=0;
            }
        }
        System.out.println("Total no :-  "+total);
    }
    
}
