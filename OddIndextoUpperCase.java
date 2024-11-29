package week3.Classassign;
//Converting the odd index character to uppercase
import java.util.*;
public class OddIndextoUpperCase {
public static void main(String[] args)
{
		// TODO Auto-generated method stub
		String test="changeme";
		char[] ch=test.toCharArray();
		System.out.print("The given String is :" +test+ "\n");
		String rev="";
		String chstr="";
		char str = 0;
		for(int i=ch.length-1;i>=0;i--)
		{
			if(i%2==0)
			{
				//System.out.println(ch[i]);
				str=Character.toLowerCase(ch[i]);
				rev= rev + str ;
				/*System.out.println(ch[i]);
				System.out.println(str);
				System.out.println(rev);*/
			}
			else
			{
				str=Character.toUpperCase(ch[i]);
				rev= rev + str ;
			}
			//System.out.println(rev);
		}
		//System.out.print("The Reversed String is:\n" +rev );
		char[] strtest=rev.toCharArray();
		System.out.print("The Result String is:");
		for(int k=strtest.length-1;k>=0;k--)
		{
			System.out.print(strtest[k]);
			//chstr=chstr+strtest[k];
		}
		//System.out.print("The Result String is:\n" +chstr );
		
	}
}
