package thread.synchronizedpackage;

public class SynchronizedTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		User u = new User("张三", 100);

		Thread t1 = new ThreadTask("Thread1", u, 10);
		Thread t2 = new ThreadTask("Thread2", u, 20);
		Thread t3 = new ThreadTask("Thread3", u, 30);

		t1.start();
		t2.start();
		t3.start();

	}

}

class ThreadTask extends Thread {

	private User u;

	private int y = 10;

	ThreadTask(String name, User u, int y) {
		super(name);
		this.u = u;
		this.y = y;
	}

	public void run() {
		u.operate(y);
	}

}


