/*
    正则表达式
*/
import java.lang.StringBuffer;
import java.lang.StringBuilder;
public class Test{
    
    public static void main(String[] args){
        // 需求 校验qq号
        // 要求， 长度5-15, 不能以0开头，只能是数字
        
        String qq = "a1534824780";
        
        // 校验规则
        String regex = "[1-9][0-9]{4,14}";
        
        boolean flag = qq.matches(regex);
        
        if(flag){
            System.out.println("校验成功");
        }else{
            System.out.println("校验失败");
        }
    }
}
