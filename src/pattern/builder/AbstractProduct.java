package pattern.builder;

public abstract class AbstractProduct {
	
	protected abstract void part01();
	
	protected abstract void part02();
	
	protected abstract void part03();
	
	public final AbstractProduct defaultProduct(){
		part01();
		part02();
		part03();
		return this;//返回当前对象，即默认组装方式的产品 
	}

}
