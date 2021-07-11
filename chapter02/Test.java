/*
  接口也是一种引用类型，可以等同的看作类
  接口是一种特殊的抽象类，接口是完全抽象的，只有抽象方法和常量
  接口没有构造方法，不能被实例化
  接口和接口之间可以多继承
  一个类可以实现多个接口
*/

/*public class Test{
    public static void main(String[] args){
    }
}*/

public interface Test{
    public static final String SUCCESS = "success";
    
    // public static final可以省略
    String FAILED = "failed";
    
    public abstract void m1();
    
    // public abstract 是可以省略的
    void m2();
    
    
}
