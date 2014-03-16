/**
 * 
 */
package pattern.adapter.classadapter;

/**
 * @author hp
 *现在客户要一个新类B，要求能在保留类A功能的情况下增加一个运算减法的功能，
 *并要求B能随时替换掉A但不能对已有系统造成影响。这样我们只能新建一个类B，
 *并让B继承A.为了避免重复去设计该函数，我们决定引入C类，
 *通过适配C类来达到我们的期望
 */
public class B extends A {
	
	private C c;
	
	public void setC(C c) {
		this.c = c;
	}


	public int minus(int a,int b){
		return c.minus(a, b);
	} 

}
