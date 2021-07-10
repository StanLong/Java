/*
   final
   final 修饰的类无法被继承
   final 修饰的方法无法被覆盖
   final 修饰的局部变量，一旦被赋值，不会再改变。
   final 修饰的成员变量，必须显示的初始化。要求再构造方法结束之前赋值
   final 修饰的成员变量一般和 static 连用, 避免资源浪费。
   Java规定 public static final 修饰常量
*/

public class Test{
    public static void main(String[] args){
        
    }
}

final class A {
    
}

class B extends A {
    
    
}