package week3.Classassign;

public  class JavaConnection extends MySqlConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaConnection JC=new JavaConnection();
		JC.connect();
		JC.disconnect();
		JC.executeUpdate();
		JC.executequery();
	}
	@Override
	public void executequery()
{
		System.out.println("Execute query from JavaConnection");	
}

	/*@Override
	public void connect() {
		// TODO Auto-generated method stub
	System.out.println("Connect database");	
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("DisConnect database");
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Execute the update command in database");
	}*/
	

}
