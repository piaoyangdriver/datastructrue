/**
 * 
 */
package thread.synchronizedpackage;

/**
 * @author hp
 * 
 */
public class CountDanger implements Runnable {

	private Account acc = new Account();

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		for(int x = 0; x<5; x++){
			makeWithdraw(10);
			if(acc.getBalance() < 0){
				System.out.println("accout is overdrawn !");
			}
		}
	}

	private synchronized void  makeWithdraw(int amt) {
		if (acc.getBalance() >= amt) {
			System.out.println(Thread.currentThread().getName()
					+ "is going to  withdraw");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			acc.withdraw(amt);
			System.out.println(Thread.currentThread().getName()
					+ "completes the withdraw");
		}else{
			System.out.println("Not enough in account for" + Thread.currentThread().getName()
					+ " to draw " + acc.getBalance());
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Runnable r = new CountDanger();
		Thread one = new Thread(r);
		Thread two = new Thread(r);
		
		one.setName("Fred");
		two.setName("Lucy");
		
		one.start();
		two.start();

	}

}
