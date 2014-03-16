package pattern.singleton;

public class SingletonTest {

    public static void main(String[] args) {
        
        //调用测试方法
        test();
         
        //通知jvm回收无用资源
        System.gc();
        
        System.out.println("main finalize ...");
    }
    
    //测试方法
    public static void test(){
        //创建A类的对象
        A a = new A();
        //让对象的成员变量指向其自身
        a._a=a;
    }
    
}