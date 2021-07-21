/*
    HeshSet 集合
    
    HeshSet 相当于 HashMap 中的key， 往HashMap中添加元素使用put方法， put{key, value} key是无序，不可重复。
    添加元素时会先调用key的hashCode方法， 如果hashCode没有重复的，则新增元素。
    
    以下代码中
    e1 和 e2 是new出来的两个对象，他们内存地址并不一样，e1和e2的hashCode值也不一样。
    因此需要重写hashCode方法。 如果 hashCode 返回的值一样就需要重写equals方法来判断
    
    存储在HashSet集合或者HashMap集合key部分的元素，需要同时重写hashCode() 和 equals() 方法。
*/

import java.util.*;
public class Test{
    
    public static void main(String[] args) throws Exception{
        // 创建集合
        Set es = new HashSet();
        
        // 创建对象
        Employee e1 = new Employee("zhangsan", "10"); 
        Employee e2 = new Employee("zhangsan", "10"); 
        Employee e3 = new Employee("lise", "20");
        Employee e4 = new Employee("wangwu", "30");
        Employee e5 = new Employee("zhaoliu", "40");
        Employee e6 = new Employee("chenqi", "50");
        
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
        
        // 添加元素
        es.add(e1);
        es.add(e2);
        es.add(e3);
        es.add(e4);
        es.add(e5);
        es.add(e6);

        System.out.println(es.size());
        
        
    }
}


class Employee{
    String name;
    String no;
    
    Employee(String name, String no){
        this.name = name;
        this.no = no;
    }
    
    // 重写equals 方法
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o instanceof Employee){
            Employee e = (Employee)o;
            if(e.no == this.no && e.name == this.name){
                return true;
            }
        }
        return false;
    }
    
        
    // 重写hashCode方法
    public int hashCode(){
        // 以编号分组
        return no.hashCode(); // 均匀分布到不同的链表上
    }
    
}
