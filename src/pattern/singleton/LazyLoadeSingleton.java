package pattern.singleton;

/**
 * 单利的最好模式
 * @author hp
 *
 */
public class LazyLoadeSingleton {
	
	private LazyLoadeSingleton(){};
	
	private static class LazyHolder {
		private static LazyLoadeSingleton instance = new LazyLoadeSingleton();
	}
	
	public static LazyLoadeSingleton getInstace(){
		return LazyHolder.instance;
	}
}
