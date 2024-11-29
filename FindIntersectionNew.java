package week3.Classassign;

import java.util.*;
public class FindIntersectionNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>arr1=new ArrayList<Integer>();
		List<Integer>arr2=new ArrayList<Integer>();
		arr1.add(3);
		arr1.add(2);
		arr1.add(11);
		arr1.add(4);
		arr1.add(6);
		arr1.add(7);
		arr2.add(1);
		arr2.add(2);
		arr2.add(8);
		arr2.add(4);
		arr2.add(9);
		System.out.println(arr1);
		System.out.println(arr2);
		for (int i = 0; i < arr1.size(); i++)
		{
			for (int j = 0; j < arr2.size(); j++)
			{
					if(arr1.retainAll(arr2)==true)
					{
						System.out.println("Matching Values:" +arr1);
					}
			}	
		}
	}
}
