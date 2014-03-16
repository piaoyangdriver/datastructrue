/**
 * 
 */
package thread;

/**
 * @author hp
 *
 */
public class ThreadTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Runnable r1 = new NameRunnable();
		Thread t1 = new Thread(r1);
		t1.setName("Fred");
		
		Thread t2 = new Thread(r1);
		t2.setName("Luck");
		
		Thread t3 = new Thread(r1);
		t3.setName("Ricky");
		
		t1.start();
		t2.start();
		t3.start();

	}

}
