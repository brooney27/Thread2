
public class Counter implements Runnable {
	public void run(){
		System.out.println("Start Mom");
		
		while(true){
			try{
				Thread.sleep(2000);
			}catch (InterruptedException e){
				break;
			}
			System.out.println("Mom?");
		}
		System.out.println("Mom stopped");
	}
}
