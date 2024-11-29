package week3.Classassign;

public abstract class MySqlConnection implements DatabaseConnectionTest {
	public abstract void executequery();
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		

	}
	
	@Override
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
	}
	

}
