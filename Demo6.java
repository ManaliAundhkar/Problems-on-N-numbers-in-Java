//Write java program which accept N numbers from user and accept one another number as NO , return index of first occurrence of that NO.

//Input : N : 6
//NO: 66
//Elements : 85 66 3 66 93 88
//Output : 1

//Input : N : 6
//NO: 12
//Elements : 85 11 3 15 11 111
//Output : -1

import java.util.*;

class Array
{
	public int ChkNo(int Arr[],int No)
	{
		int i=0,temp=0;
		for(i=0;i<Arr.length;i++)
		{
			if(Arr[i]==No)
			{
				temp=i;
				break;
			}
		}
		if(i!=Arr.length)
		{
			return temp;
		}
		else
		{
			return (temp-1);
		}
		
		
	}
}
class Demo6
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
	
		
		int iRet=mobj.ChkNo(Arr,No);
		
		System.out.println("The 1st occurence is at index "+iRet);
	
	}
}







