/**
 * 
 */
package pattern.adapter.object;

import pattern.adapter.OtherAdd;

/**
 * @author hp
 *对象适配器模式(客户提供的是接口)
 */
public class AdapterOperationObject implements OpreationObject {
	
	private OtherMinus otherMinus;
	
	private OtherMultiplied otherMultiplied;
		
	private OtherAdd otherAdd;
	
	public OtherMinus getOtherMinus() {
		return otherMinus;
	}

	public void setOtherMinus(OtherMinus otherMinus) {
		this.otherMinus = otherMinus;
	}

	public OtherMultiplied getOtherMultiplied() {
		return otherMultiplied;
	}

	public void setOtherMultiplied(OtherMultiplied otherMultiplied) {
		this.otherMultiplied = otherMultiplied;
	}

	public OtherAdd getOtherAdd() {
		return otherAdd;
	}

	public void setOtherAdd(OtherAdd otherAdd) {
		this.otherAdd = otherAdd;
	}

	/* (non-Javadoc)
	 * @see pattern.adapter.object.OpreationObject#add(int, int)
	 */
	@Override
	public int add(int a, int b) {
		return otherAdd.otherAdd(a, b);
	}

	/* (non-Javadoc)
	 * @see pattern.adapter.object.OpreationObject#minus(int, int)
	 */
	@Override
	public int minus(int a, int b) {
		return otherMinus.minus(a, b);
	}

	/* (non-Javadoc)
	 * @see pattern.adapter.object.OpreationObject#multiplied(int, int)
	 */
	@Override
	public int multiplied(int a, int b) {
		return otherMultiplied.multiplied(a, b);
	}

}
