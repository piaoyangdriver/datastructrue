/**
 * 
 */
package pattern.adapter.interfaceadapter;

/**
 * 接口适配器
 * 当一个类不希望全部实现接口中的方法时,
 * 让一个抽象类去实现这个接口,
 * 该类继承抽象类,重写需要的方法
 * @author hp
 *
 */
public interface Sourceable {
	
	 public void method1();  
	 
	 public void method2();

}
