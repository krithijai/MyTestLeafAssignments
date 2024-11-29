package week3.Classassign;

public class Execution extends Button{
	public void Elements()
	{
		System.out.println("The execution class");
		super.setText("From execution extending button class");
		super.click();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Execution ex= new Execution();
		ex.Elements();
		ex.submit();
	}
}
