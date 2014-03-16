package thread.test;

public class TaskRunnable implements Runnable {

	public static void main(String[] args){
		System.out.println(Thread.currentThread().getName() + " 线程运行开始!");
		
		TaskRunnable run = new TaskRunnable();
		Thread t1 = new Thread(run, "test1");//线程的名字
		Thread t2 = new Thread(run, "test2");
		//t1.setPriority(1);
		//t2.setPriority(10);
		
		t1.start();
		t2.start();
		
		System.out.println(Thread.currentThread().getName() + " 线程运行结束!");
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " 线程运行开始!");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());
            try {
                Thread.sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " 线程运行结束!");	
	}

}
