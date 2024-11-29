package week3.Classassign;
//Find the second largest number
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>arr1=new ArrayList<Integer>();
		arr1.add(3);
		arr1.add(2);
		arr1.add(11);
		arr1.add(4);
		arr1.add(6);
		arr1.add(12);
		Collections.sort(arr1);
		System.out.println(arr1);
		int max=arr1.get(arr1.size()-2);
		System.out.println("The second largest number:"+max);
		
	}
}
