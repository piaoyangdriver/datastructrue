package pattern.builder;

class ConcreteBuilderB extends AbstractBuilder {
	private AbstractProduct productB = new ConcreteProductB();

	public void buildPart() {
		this.productB.part02();
		this.productB.part01();
		// 特地省略掉产品B中的一个组成部分，例如该部分的功能顾客不需要
		// this.productB.part03();
	}

	public AbstractProduct buildProduct() {
		return this.productB;
	}
}