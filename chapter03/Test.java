/*
  自定义异常
    1. 编译时异常 直接继承 Exception
    2. 运行时异常 直接继承 RuntimeException
*/

public class Test{
    
    public static void main(String[] args){
        String username = "jack";
        CustomerService cs = new CustomerService();
        try{
            cs.register(username);
        }catch(IllegalNameException e){
            System.out.println(e.getMessage());
        }
        
    }
    
    
}

// 编译时异常
class IllegalNameException extends Exception{
    
    // 定义异常一般提供两个构造方法
    public IllegalNameException(String msg){
        super(msg);
    }
}

class CustomerService{
    public void register(String name) throws IllegalNameException{
        if (name.length() < 6){
            // 创建异常对象
            //IllegalNameException e = new IllegalNameException("用户名长度不能少于6位");
            // 手动抛出异常
            // throw e;
            
            //可简写
            throw new IllegalNameException("用户名长度不能少于6位");
        }
        System.out.println("注册成功");
    }
}