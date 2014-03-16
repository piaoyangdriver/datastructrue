package thread.synchronizedpackage;

public class User {
	private String code;

	private int cash;

	User(String code, int cash) {
		this.code = code;
		this.cash = cash;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void operate(int x) {
		try {
			Thread.sleep(100L);

			//synchronized (this) {
				this.cash += x;
				System.out.println(Thread.currentThread().getName()
						+ "运行结束，增加“" + x + "”，当前用户账户余额为：" + cash);
			//}

			Thread.sleep(100L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "User{" + "code='" + code + '\'' + ", cash=" + cash + '}';
	}
}