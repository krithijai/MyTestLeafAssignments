package week3.Classassign;

import java.util.*;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		String strtext="We learn Java basics as part of java sessions in java week1";
		String strnew="";
		String replace="";
		String[] spl=strtext.split(" ");
		//String[] splnew=strtext.split(" ");
		String arr1;
		String arr2="";
		for(int i=0;i<spl.length;i++)
		{
			//System.out.println(split[i]);
			//System.out.println(i);
			arr1=spl[i];
			//System.out.println(i+" "+spl[i]);
			for(int j=i+1;j<spl.length;j++)
			{
				arr2=spl[j];
				//System.out.println(split[j].toLowerCase());
				//System.out.println(arr1.toLowerCase());
				if(arr1.equalsIgnoreCase(arr2))
				{
					//if more than one duplicate then other than the first to be empty string
					count=count+1;
					//System.out.println(spl[i]);
					//System.out.println(spl[j]);
					//System.out.println(count);
					if (count>1)
					{
						//System.out.println(spl[i]);
						//System.out.println(arr1);
						replace=strtext.replace(spl[i], "");
						strnew=replace;
						//System.out.print(replace);
					}
					//System.out.print(strnew);
			   }
				//System.out.print(strnew);
			}	
			//strnew=strnew+arr1;
			//System.out.print(arr1);
			//System.out.println(spl[i]);
			
		}
		System.out.println(replace);
		/*=========for(int i=0;i<spl.length;i++)
		{
			for(int j=i+1;j<spl.length;j++)
			{
				if (spl[i].equals(spl[j]) &&! spl[i].equals(""))
				{
					System.out.println(spl[i]);
					String replace=strtext.replace(spl[i], "");
					System.out.println(replace);
				}
			}
		}*/
	}
		//System.out.println();
}
