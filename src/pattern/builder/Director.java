package pattern.builder;

/**
 * 导演类，预先持有各个产品的建造者，
 * 为需要不同于默认产品的用户提供不同的组装方式 
 * @author hp
 *
 */
public class Director {

	private AbstractBuilder builderA = new ConcreteBuilderA();
	private AbstractBuilder builderB = new ConcreteBuilderB();

	public AbstractProduct getProductA() {
		this.builderA.buildPart();
		return this.builderA.buildProduct();
	}

	public AbstractProduct getProductB() {
		this.builderB.buildPart();
		return this.builderB.buildProduct();
	}

}
