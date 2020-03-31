//Write Java program which accept N numbers from user and return difference between summation of even elements and summation of odd elements.

//Input : N : 6
//Elements : 85 66 3 80 93 88
//Output : 53 (234 - 181)

import java.util.*;

class Array
{
	public int EveOdd(int Arr[])
	{
		int iEven=0,iOdd=0;
		
		for(int i=0;i<Arr.length;i++)
		{
			if((Arr[i]%2)==0)
			{
				iEven=iEven+Arr[i];
			}
			if((Arr[i]%2)!=0)
			{
				iOdd=iOdd+Arr[i];
			}
		}
		return (iEven-iOdd);
		
	}
}
class Demo
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
		
		int iRet=mobj.EveOdd(Arr);
		
		System.out.println("The Difference is: "+iRet);
		
	}
}







