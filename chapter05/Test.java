/*
    包装类型
    基本数据类型	包装类型
    byte	        Byte
    boolean	        Boolean
    short	        Short
    char	        Character
    int	            Integer
    long	        Long
    float	        Float
    double	        Double
*/
public class Test{
    
    // 需求：规定m1方法可以接受java中任何一种数据类型
    // Object只能接受基本数据类型，不能接收引用数据类型，
    // 所以m1方法如果想接受byte类型的数据，可以将byte类型先包装成java.lang.Byte， 再传递参数
    public static void m1(Object o){
        System.out.println(o);
    }
    
    public static void main(String[] args){
        // 基本数据类型
        byte b = 10;
        
        // 引用类型
        Byte b1 = new Byte(b);
        
        m1(b);
    }
}
