package assistedproject8;

public class main {

	public main(String[] args, String online) {
		
		Bus sleeper = new Bus();
		Bus nonsleeper = new Bus();
		
		sleeper.name = "Garuda";
		sleeper.color = "Blue";
		sleeper.Booking = online;
		sleeper.sleep();
		
		

		nonsleeper.name = "superluxury";
		nonsleeper.color = "red";
		nonsleeper.Booking = online;
		nonsleeper.play();
	}
}
