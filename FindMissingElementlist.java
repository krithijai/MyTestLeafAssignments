package week3.Classassign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMissingElementlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[]= {1,4,3,2,8,6,7,10,12};
		List<Integer>arr1=new ArrayList<Integer>();
		arr1.add(1);
		arr1.add(4);
		arr1.add(3);
		arr1.add(2);
		arr1.add(8);
		arr1.add(6);
		arr1.add(7);
		arr1.add(10);
		arr1.add(12);
		int sum=0,flag = 0;
		//System.out.println(arr1.get(0));
		//System.out.println(arr1.size()-1);
		//for(int i=0;i<=arr1.size()-1-1;i++)
		for(int i=0;i<=arr1.size()-1;i++)
		{
			Collections.sort(arr1);
			//System.out.println(arr[i]);
			sum=sum+1;
				 if (arr1.get(i)==sum)
				 {
					flag=0;
				 }
				 else
				 {
					System.out.println("The missing number is:"+sum);
					flag=1;
				 }
				 if (flag==1)
				 {
					 sum=sum+1; 
				 }
		}
	}
}
		
		
		/**********************************/
		/*for(int i=1;i<=12;i++)
		{
			Collections.sort(arr1);
			//System.out.println("i loop:"+i);
			for(int j=0;j<=arr1.size()-1;j++)
			{
				//System.out.println("j loop:"+arr1.get(j));
				if (i==arr1.get(j))
				{
					//System.out.println("Match Found"+arr1.get(j));
					flag=1;
					break;
				}
				else
				{
					flag=0;
				}

			}
			if (flag==0)
			{
				//System.out.println("The missing number is:"+i);
				//flag=0;
			}*/
			/*System.out.println(arr1.get(0));
			System.out.println(arr1.size()-1);
			//Arrays.sort(arr1);
				 sum=sum+1;
				 if (arr1.contains(i))
				 {
						flag=0;
				 }
				 else
				 {
					System.out.println("The missing number is:"+sum);
					flag=1;
				 }
				 if (flag==1)
				 {
					 sum=sum+1; 
				 }*/
		
