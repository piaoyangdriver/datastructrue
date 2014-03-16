package pattern.builder;

/**
 * 抽象建造者，制定每一种产品应该实现的组合方式
 * buildPart()和生产buildProduct()的标准 
 * @author hp
 *
 */
public abstract class AbstractBuilder {
	
	 public abstract void buildPart();
	 
	 public abstract AbstractProduct buildProduct();
}
