//Write java program which accept N numbers from user and accept one another number as NO , check whether NO is present or not.

//Input : N : 6
//NO: 66
//Elements : 85 66 3 66 93 88
//Output : TRUE

//Input : N : 6
//NO: 12
//Elements : 85 11 3 15 11 111
//Output : FALSE

import java.util.*;

class Array
{
	public boolean ChkNo(int Arr[],int No)
	{
		int i=0;
		for(i=0;i<Arr.length;i++)
		{
			if(Arr[i]==No)
			{
				break;
			}
		}
		
		if(i!=(Arr.length))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
}
class Demo5
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
		
		System.out.println("Enter the no to be found");
		int No=sobj.nextInt();
		
		Array mobj=new Array();
		
		boolean bRet=false;
		
		bRet=mobj.ChkNo(Arr,No);
		
		if(bRet==true)
		{
			System.out.println("The no. is present ");
		}
		else
		{
			System.out.println("The no. is not present ");
		}
	}
}







