package pattern.builder;

public class ConcreteBuilderA extends AbstractBuilder {

	private AbstractProduct productA = new ConcreteProductA();

	public void buildPart() {
		this.productA.part03();
		this.productA.part02();
		this.productA.part01();
	}

	public AbstractProduct buildProduct() {
		return this.productA;
	}

}
