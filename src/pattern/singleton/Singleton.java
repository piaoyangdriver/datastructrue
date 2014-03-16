/**
 * 
 */
package pattern.singleton;

/**
 * @author hp
 *单利模式需要系统保持一个对他的引用，谁来保存对这个对象的引用呢，以保证他不被
 *垃圾回收。最好是由他自己，这样这个单例的对象一旦创建，就永远不会被收集。
 *
 *单例模式创建的对象能够一直存在于内存中不被释放，并不只是由于持有一个自身的引用，
 *本质是因为这个引用是静态的。
 *也就是说，如果成员变量是非静态的，它持有一个自身的引用，那么这个对象还是会被回收。
 *http://www.cnblogs.com/iyangyuan/archive/2013/04/22/3036776.html
 *
 * 单例模式中成员变量是静态的，它并不保存在堆内存中，而是在方法区中，是一块持久的内存空间，
 * 不会被自动回收，因此指向自身的引用是安全的，自身不会被回收。
 */
public class Singleton {
	
	private static Singleton instance;
	
	private Singleton(){		
	}
	
	public static Singleton getInstance(){
		if(instance == null){
			synchronized(Singleton.class){
				if(instance == null){
					instance = new Singleton(); 
				}
			}
		}
		return instance;		
	}

	
}
