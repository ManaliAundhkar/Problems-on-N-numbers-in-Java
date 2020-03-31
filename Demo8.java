//Write java program which accept N numbers from user and accept Range, Display all elements from that range

//Input : N : 6
//Start: 60
//End : 90
//Elements : 85 66 3 76 93 88
//Output : 66 76 88

//Input : N : 6
//Start: 30
//End : 50
//Elements : 85 66 3 76 93 88
//Output :

import java.util.*;

class Array
{
	public void ChkNo(int Arr[],int iStart,int iEnd)
	{
		int i=0;
		for(i=0;i<Arr.length;i++)
		{
			if((Arr[i]>iStart)&&(Arr[i]<iEnd))
			{
				System.out.print(Arr[i]+"\t");
			}
		}
	}
}
class Demo8
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
		
		System.out.println("Enter the starting point of range");
		int iStart=sobj.nextInt();
		
		System.out.println("Enter the ending point of range");
		int iEnd=sobj.nextInt();
		
		Array mobj=new Array();
	
		
		mobj.ChkNo(Arr,iStart,iEnd);
	}
}







