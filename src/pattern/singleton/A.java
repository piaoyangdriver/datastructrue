package pattern.singleton;

public class A{    
    //定义一个成员变量，用来保存对象本身
    public A _a = null;
    
    //对象被销毁时执行的方法
    protected void finalize() throws Throwable {
        System.out.println("A finalize ...");
    }
}