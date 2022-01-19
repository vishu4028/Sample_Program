/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loop;

/**
 *
 * @author thaka
 */
public class Reverse_String {
    
    public static void main(String [] arg)
    {
        String s="Vishal Thakare";
        
        
        for(int i=s.length()-1 ;i>=0;i--)
        {
            
            System.out.print(s.charAt(i));
              
        }
        
    }
    
}
