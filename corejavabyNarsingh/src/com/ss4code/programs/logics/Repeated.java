package com.ss4code.programs.logics;

import java.util.Scanner;

public class Repeated {
    void repeated(String str)
    {
        
        int size=str.length();
        int count=0;
        for(int j=0;j<=size-1;j++)
        {
            
        char repeat=str.charAt(j);
        count=0;
        for(int i=0;i<=size-1;i++)
        {
            if(repeat==str.charAt(i))
            {
                count++;
                repeat=str.charAt(i);
                                
            }
        }
        System.out.println(repeat +" repeated " +count +" times in " +str);
        }
       
       
    }
    public static void main(String[] args) {
        Repeated r= new Repeated();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the String to find repeated alphabts");
        String string=input.nextLine();
        r.repeated(string);

    }
    
}