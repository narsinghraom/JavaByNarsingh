package com.ss4code.programs.logics;

import java.util.Scanner;

public class ArrayMinMax 
{
    static void arrayMinMax(int size,int[] array)
    {
        int min=0,max=0;
        for(int i=0;i<=size-1;i++)
        {
            for(int j=0;j<=size-1;j++)
            {
                if(array[i]<array[j])
                {
                    min=array[i];
                    array[i]=array[j];
                }
                else max=array[j];
            }
            
        }
        System.out.println("Min= "+min +" & "+"Max= "+max);
        
    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=input.nextInt();
        System.out.println("Enter the Arrays of integers");
        int[] array=new int[size];
        for(int i=0;i<=size-1;i++)
            array[i]=input.nextInt();
        arrayMinMax(size,array);
    }
    
}

