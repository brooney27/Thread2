import java.util.Scanner;

public class Thread2 {
	public static void main(String[] args){
		System.out.println("Press enter to stop the timer");
		Thread counter = new Thread(new Counter());
		Thread counter2 = new Thread(new Counter2());
		counter.start();
		counter2.start();
		Scanner in = new Scanner(System.in);
		String s = "start";
		while(!s.equals("")){
			s=in.nextLine();
		}
		counter.interrupt();
		counter2.interrupt();
		in.close();
	}
}
