/**
 * 
 */
package pattern.factory.factorymethod;

import pattern.factory.simple.Animal;

/**
 * 工厂方法模式是简单工厂模式的进一步抽象化和推广,
 * 工厂方法模式里不再只由一个工厂类决定那一个产品类应当被实例化,
 * 这个决定被交给抽象工厂的子类去做
 * @author hp
 *
 *抽象工厂模式：
 *多个抽象产品类，每个抽象产品类可以派生出多个具体产品类。
 *一个抽象工厂类，可以派生出多个具体工厂类
 *每个具体工厂类可以创建多个具体产品类的实例。
 *
 *工厂方法模式与抽象工厂模式的区别：
 *1）工厂方法模式中只有一个抽象产品类，而抽象工厂模式中有多个抽象产品类
 *2）工厂方法模式每个具体工厂类只能创建一个具体产品类的实例。
 *而抽象工厂模式每个具体工厂类可以创建多个具体产品类的实例。
 */
public interface CreatFactoryInterface {
	
	public Animal getInstance();
}
