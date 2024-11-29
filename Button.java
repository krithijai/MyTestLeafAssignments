package week3.Classassign;

public class Button extends WebElementNew {

	public void submit()
	{
		System.out.println("Submitted");
		super.setText("From button class accessing webelement");
		super.click();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button b=new Button();
		b.submit();
	}

}
