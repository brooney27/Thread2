
public class Counter2 implements Runnable {
	public void run(){
		System.out.println("Start Counter");
		
		while(true){
			try{
				Thread.sleep(3000);
			}catch (InterruptedException e){
				break;
			}
			for(int i=0;i<=10000;i++){
				if(i%200==0)System.out.println(i);
			}
		}
		System.out.println("Counter stopped");
	}
}
