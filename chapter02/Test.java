/*
  成员内部类
    成员内部类可以等同看作成员变量
    成员内部类中不能有静态声明
    成员内部类可以访问外部所以的数据
*/

public class Test{
    
    // 静态变量
    private static String name="StanLong";
    
    // 成员变量
    private int id = 10; 
    
    // 静态方法
    private static void m1(){
        System.out.println("static m1");
    }
    
    // 成员方法
    private void m2(){
        System.out.println("method m2");
    }
    
    // 成员内部类
    class InnerClass{
        // 静态方法
        /*public static void m3(){
            //System.out.println(name);
            //m1();
            
            System.out.println(id);
            m2();
        }*/
        
        // 成员方法
        public void m4(){
            System.out.println(name);
            m1();
            
            System.out.println(id);
            m2();
        }
    }
   
    
    public static void main(String[] args){
        // 创建外部类对象
        Test t = new Test();
        // 外部类实例化成员内部类对象
        InnerClass inner = t.new InnerClass();
        // 调用成员内部类的方法
        inner.m4();
    }
}
