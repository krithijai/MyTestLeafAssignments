package week3.Classassign;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String companyName="TestLeaf";
		char[] ch=companyName.toCharArray();
		System.out.print("The given String is :" +companyName+ "\n");
		
		String rev="";
		char str;
		for(int i=ch.length-1;i>=0;i--)
		{
			str=ch[i];
			rev= rev + str ;
		}
		System.out.print("The Reversed String is:\n" +rev );
	}

}
