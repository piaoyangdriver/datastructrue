package pattern.factory.simple;

/**
 * 担任这个角色的是工厂方法模式的核心，含有与应用紧密相关的商业逻辑
 * 工厂类在客户端的直接调用下创建产品对象，它往往由一个具体Java 类实现。  
 * @author hp
 *
 */
public class CreatFactory {
	public static Animal getInstance(String className){
		Animal instance = null;
		try {
			Class<?> cla = Class.forName(className);
			instance = (Animal)cla.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return instance;
	}
}
