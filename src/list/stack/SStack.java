/**
 * 
 */
package list.stack;

/**
 * @author hp
 *栈的接口
 */
public interface SStack<E> {

	boolean isEmpty();
	
	boolean push(E data);
	
	E pop();//出栈,删除栈顶的元素
	
	E get();//得到栈顶的元素
	
}
