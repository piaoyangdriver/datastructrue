package pattern.factory.simple;

public class SimpleFactoryTest {

	/**
	 * 简单工厂模式，通过传入不同的参数
	 * 实例化生成不同的类
	 * 在外面定义父类或接口指向生成的实例化类(多态)
	 * @param args
	 */
	public static void main(String[] args) {
		Animal dog = CreatFactory.getInstance("pattern.factory.simple.Dog");
		dog.eat();
	}

}
