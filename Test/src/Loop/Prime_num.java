package Loop;

public class Prime_num {
    
    public static void main(String [] arg)
    {
        int num=3,temp =0;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                temp=temp+1;
            }
        }
        if(temp>0)
        {
            System.out.print(" this not prime number:- "+num);
        }
        else
        {
            System.out.print(" this prime number:- "+num);
        }
    }
    
}
