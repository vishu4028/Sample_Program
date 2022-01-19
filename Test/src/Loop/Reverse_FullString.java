package Loop;

public class Reverse_FullString {
    
    public void m1(String str)
    {
        String [ ] str1 = str.split(" ");
        String rev=" ";
        
        for(int i = 0;i<str1.length;i++)
        {
            String word = str1[i];
            String revword = " ";
            
                for(int j = word.length()-1;j>=0;j--)
                {
                    revword= revword+word.charAt(j);
                }
                rev = rev +revword+" ";
        }
        System.out.print(rev);
    }
    
    public static void main(String [] args)
    {
        Reverse_FullString rf = new Reverse_FullString();
        rf.m1("Hello I Am Vishal");
    }
    
}
