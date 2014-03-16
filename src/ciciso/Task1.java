package ciciso;

public class Task1 implements Runnable {

	@Override
	public void run() {
		try{
			Thread.sleep(2000);
			
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("定时任务3");
		
	}

}
