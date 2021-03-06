package com.bridgelabz.Algorithmic;

import com.bridgelabz.utility.Utility;

public class VendingMachine 
{
	static int i=0;
	static int total=0;
	static int[] notes = { 1000,500,100,50,10,5,2,1};
	static int money;
	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		System.out.print("Enter the Amount:");
		money =utility.inputInteger();
		calculate(money,notes);
		System.out.println("Total Number of Notes are :"+total);
	}
	public static  int calculate(int money,int[]notes )
	{
		int rem;
		if(money==0)
		{
			return -1 ;
		}
		else
		{
			if(money>=notes[i])
			{
				int calNotes =money/notes[i];
				rem = money%notes[i];
				money =rem;
				total += calNotes;
				System.out.println(notes[i]+   " Notes ---> " +calNotes );
			}
			i++;
			return calculate(money, notes);
		}
	}

}