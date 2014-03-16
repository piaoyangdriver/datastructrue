/**
 * 
 */
package pattern.adapter;

/**
 * @author hp
 *目标接口
 *适配目标角色：Operation(客户提供的是接口)
 */
public interface Operation {
	
	/**
	 * 实现两个整数相加,但是这个功能已经在别的类中实现
	 * @param a
	 * @param b
	 * @return
	 */
	 public abstract int add(int a, int b);

}
