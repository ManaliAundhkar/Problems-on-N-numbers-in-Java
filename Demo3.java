//Write Java program which accept N numbers from user and display all such elements which are divisible by 3 and 5.

//Input : N : 6
//Elements : 85 66 3 15 93 88
//Output : 15

import java.util.*;

class Array
{
	public void EveOdd(int Arr[])
	{		
		for(int i=0;i<Arr.length;i++)
		{
			if(((Arr[i]%5)==0)&&((Arr[i]%3)==0))
			{
				System.out.print(Arr[i]+"\t");
			}
		}
	}
}
class Demo3
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the no. elements");
		int iSize=sobj.nextInt();
		
		int Arr[]=new int[iSize];//malloc
		
		System.out.println("Enter the elements");
		for(int i=0;i<iSize;i++)
		{
			Arr[i]=sobj.nextInt();
		}
		
		Array mobj=new Array();
		
		mobj.EveOdd(Arr);

		
	}
}







