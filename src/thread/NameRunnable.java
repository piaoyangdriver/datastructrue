package thread;

public class NameRunnable implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i < 4; i++){
			System.out.println("Run by currentthread:" + 
		Thread.currentThread().getName() + " " + i);
			try{
				Thread.sleep(4000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}

}
