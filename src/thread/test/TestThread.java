package thread.test;

public class TestThread {

	public static void main(String[] rags) {
		System.out.println(Thread.currentThread().getName() + " 线程运行开始!");
		Thread A = new ThreadByName("A");
		A.start();
		System.out.println(" A 线程名字 : " + A.getName());
		
		new ThreadByName("B").start();
		System.out.println(Thread.currentThread().getName() + " 线程运行结束!");
	}

}
