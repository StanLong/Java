/*
    java.lang.Integer
*/
public class Test{
    
    
    public static void main(String[] args){
        // 获取int类型的最大值和最小值
        System.out.println("int最小值: " + Integer.MIN_VALUE);
        System.out.println("int最大值: " + Integer.MAX_VALUE);
        
        // 创建Integer类型的对象
        Integer i1 = new Integer(10);
        Integer i2 = new Integer("123");
        // Integer i3 = new Integer("abc"); 编译成功，运行时报异常
        
        System.out.println(i1);
        System.out.println(i2);
        
        
        // 进制转换
        String s1 = Integer.toBinaryString(10); // 十进制转二进制
        System.out.println(s1);
        String s2 = Integer.toHexString(10);  // 十进制转十六进制
        System.out.println(s2);
        String s3 = Integer.toOctalString(10); // 十进制转八进制
        System.out.println(s3);
        
        
        // int --> Integer
        Integer i4 = Integer.valueOf(10);
        System.out.println(i4);
        
        // String --> Integer
        Integer i5 = Integer.valueOf("10");
        System.out.println(i5);
        
        // Integer， int ， String 三种类型相互转换
        Integer i6 = Integer.valueOf(10); // int --> Integer
        System.out.println(i6);
        
        int i7 = i6.valueOf(10); // Integer --> int
        System.out.println(i7);
        
        Integer i8 = Integer.valueOf("10");  // String --> Integer
        System.out.println(i8);
        
        String s4 = i8.toString(); // Integer --> String
        System.out.println(s4);
        
        int i9 = Integer.parseInt("123");  // String --> int
        System.out.println(i9);
        
        String s5 = 10 + ""; // int --> String 
        System.out.println(s5);
        
        
    }
}
