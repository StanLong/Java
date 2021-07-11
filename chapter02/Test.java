/*
  hashCode
*/

public class Test{
    public static void main(String[] args){
        // hashCode 返回的是该对象的哈希码值
        // java对象的内存地址是经过哈希算法得出的int类型的数值
        Test t = new Test();
        System.out.println(t.hashCode());
    }
}
