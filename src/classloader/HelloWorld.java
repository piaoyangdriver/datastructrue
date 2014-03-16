package classloader;

import java.util.Hashtable;

public class HelloWorld {
	public static void main(String[] args) throws ClassNotFoundException {
		//Hashtable 
		//类加载器的获取
		/*HelloWorld hello = new HelloWorld();
		Class c = hello.getClass();		
		ClassLoader loader = c.getClassLoader();
		String
		
		System.out.println(loader);
		System.out.println(loader.getParent());
		System.out.println(loader.getParent().getParent());*/
		
		//类加载三种方式
		
		//1 使用ClassLoader.loadClass()来加载类，不会执行初始化块 
		ClassLoader loader = HelloWorld.class.getClassLoader();
		System.out.println(loader); 
		
		//loader.loadClass("classloader.Test2");
		
		//2 使用Class.forName()来加载类，默认会执行初始化块 
		//Class.forName("classloader.Test2");
		
		 //2 使用Class.forName()来加载类，并指定ClassLoader，初始化时不执行静态块 
		Class.forName("classloader.Test2", false, loader); 
		//URLClassLoader
		
		//3 命令启动由JVM初始化加载,会执行静态块
	}
}

