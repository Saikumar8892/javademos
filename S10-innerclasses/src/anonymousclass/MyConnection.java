package anonymousclass;

public class MyConnection implements IConnection {

	@Override
	public void connect(String connectionDetails) {
		System.out.println("Successfully established Connection to the server - " + connectionDetails);
	}
}
