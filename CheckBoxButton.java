package week3.Classassign;

public class CheckBoxButton extends Button {
	public void clickCheckButton()
	{
		System.out.println("Clicking checkbox button");
		super.submit();
		super.click();
		super.setText("From checkboxbutton class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBoxButton cb=new CheckBoxButton();
		cb.clickCheckButton();
	}

}
