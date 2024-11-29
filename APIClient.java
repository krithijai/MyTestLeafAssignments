package week3.Classassign;
//Method Overloading
public class APIClient {

	public void sendRequest(String endpoint)
	{
		System.out.println("EndPoint:"+endpoint);
	}
	public void sendRequest(String endpoint,String requestBody,boolean requestStatus)
	{
		System.out.println("EndPoint:"+endpoint+ "\nRequest body:"+requestBody+ "\nRequest Status" +requestStatus);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	APIClient ac=new APIClient();
	ac.sendRequest("Reached");
	ac.sendRequest("Reached","Start from Google",true);
	}

}
