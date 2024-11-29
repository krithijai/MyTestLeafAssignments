package week3.Classassign;
//Sorting arrays and print string in descending order
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>arr1=new ArrayList<String>();
		arr1.add("HCL");
		arr1.add("WIPRO");
		arr1.add("ASPIRE SYSTEMS");
		arr1.add("CTS");
		Collections.sort(arr1);
		System.out.println(arr1);
		for (int i=arr1.size()-1;i>=0;i--)
		{
			System.out.println(arr1.get(i));
		}
	}

}
