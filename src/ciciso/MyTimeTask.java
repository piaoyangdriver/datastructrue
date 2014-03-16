package ciciso;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public class MyTimeTask {
	
	public static void main(String[] args) {
		//第一种使用java.util包中中Timer类,实例化Timer类,调用schedule方法
		/*Timer timer = new Timer();
		long time = 10000;
		timer.schedule(new Task(), time);*/
		
		//第二种while(true) 和sleep配合使用
		/*while(true){
			try{
				Thread.sleep(10000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}			
			System.out.println("定时任务！");
		}*/
		
		//第三种是使用java的ScheduleExecutorService
		ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor(
				new ThreadFactory(){
					@Override
					public Thread newThread(Runnable r) {
						return new Thread(r,"test");
					}
					
				});
		executor.scheduleAtFixedRate(new Task1(), 0, 10, TimeUnit.SECONDS);
	}

}
