package week3.Classassign;
//Reverse odd words in a string
public class ReverseOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strtext="I am a software tester";
		char strnew;
		String rev="";
		String[] spl=strtext.split(" ");
		for(int i=0;i<spl.length;i++)
		{
			//System.out.println(spl[i]);
			char[] ch=spl[i].toCharArray();
			//System.out.println(ch);
			if(i%2==1)
			{
				for(int k=ch.length-1;k>=0;k--)
				{
					//System.out.println("the word" +ch[k]);
					strnew=ch[k];
					rev= rev + strnew ;
					//System.out.println("The reversed string is:" +rev);
				}
			}
			else
			{
				rev=rev+" "+spl[i]+" ";
				//System.out.println("The string is:" +rev);
			}
		}
		System.out.println("The string is:" +rev);		
	}

}
