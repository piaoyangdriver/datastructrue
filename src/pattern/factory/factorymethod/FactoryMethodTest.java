package pattern.factory.factorymethod;

import pattern.factory.simple.Animal;

/**
 * 将工厂角色独立出来,具体的产品工厂继承或实现改
 * 产品的接口
 * 生产产品交给具体的生产改产品的工厂来生产
 * @author hp
 *
 *工厂方法模式：
 *一个抽象产品类，可以派生出多个具体产品类。
 *一个抽象工厂类，可以派生出多个具体工厂类。
 *每个具体工厂类只能创建一个具体产品类的实例。
 */
public class FactoryMethodTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CreatFactoryInterface cfi = new DogCreatFactory();
		Animal animal = cfi.getInstance();
		animal.eat();
	}

}
