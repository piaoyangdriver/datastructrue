package thread.wait;

public class ThreadB extends Thread {
	
	public int total = 0;
	
	public ThreadB(String name){
		super(name);
	}
	
	public void run(){
		System.out.println(Thread.currentThread().getName() + "线程启动");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		synchronized(this){
			for(int i = 0; i < 100; i++){
				total++;
			}
			this.notify();
		}
		
		System.out.println(Thread.currentThread().getName() + "线程结束");
	}
	
}