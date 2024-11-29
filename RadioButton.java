package week3.Classassign;

public class RadioButton extends Button{
	public void selectRadioButton()
	{
		System.out.println("Selecting radio button");
		super.setText("From execution extending button class");
		super.click();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RadioButton rb=new RadioButton();
		rb.selectRadioButton();
		rb.submit();
	}
}
