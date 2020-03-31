//Write java program which accept N numbers from user and return product of all odd elements.

//Input : N : 6
//Elements : 15 66 3 70 10 88
//Output : 45

//Input : N : 6
//Elements : 44 66 72 70 10 88
//Output : 0

import java.util.*;

class Array
{
	public int ChkNo(int Arr[])
	{
		int i=0,iOdd=0;
		
		if(Arr[i]==1)
		{
			return 1;
		}
		
		for(i=0,iOdd=1;i<Arr.length;i++)
		{
			if((Arr[i]%2)!=0)
			{
				iOdd=iOdd*Arr[i];
			}
		}
		if(iOdd>1)
		{
			return iOdd;
		}
		else
		{
			return (iOdd-1);
		}
		
	}
}
class Demo9
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
	
		
		int iRet=mobj.ChkNo(Arr);
		
		System.out.println("The product of odd elements is "+iRet);
	}
}







