/*
  匿名内部类
  优点:少定义一个类
  缺点:无法重复使用
*/

public class Test{
    
    // 静态方法
    public static void t(CustomerService cs){
        cs.logout();
        
    }
    
    
    public static void main(String[] args){
        // 调用t方法
        t(new CustomerServiceImpl());
        
        // 使用匿名内部类的方式调用t方法
        // 整个 new CustomerService(){} 就是匿名内部类
        t(new CustomerService(){
            public void logout(){
                System.out.println("系统已安全退出！");
            }
        });
        
    }
}

interface CustomerService{
    void logout();
}

// 编写一个类实现 CustomerService 接口
class CustomerServiceImpl implements CustomerService{
    public void logout(){
        System.out.println("系统已安全退出！");
    }
}