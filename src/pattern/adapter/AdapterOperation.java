/**
 * 
 */
package pattern.adapter;

/**
 * @author hp
 * 适配器角色(类适配器)
 *(客户提供的是接口)
 */
public class AdapterOperation extends OtherAdd implements Operation {

	@Override
	public int add(int a, int b) {
		return otherAdd(a, b);
	}

}
