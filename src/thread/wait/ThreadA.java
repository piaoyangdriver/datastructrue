package thread.wait;

public class ThreadA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + "线程启动");
		
		ThreadB b = new ThreadB("threadB");
		b.start();
		
		//线程A拥有b对象上的锁。
		//线程为了调用wait()或notify()方法，该线程必须是那个对象锁的拥有者 
		synchronized(b){
			try{
				System.out.println("等待对象b完成计算。。。"); 
                //当前线程A等待 
                b.wait();
			}catch (InterruptedException e) { 
               e.printStackTrace(); 
            }
            System.out.println("b对象计算的总和是：" + b.total);
		}
		
		System.out.println(Thread.currentThread().getName() + "线程结束");

	}

}


