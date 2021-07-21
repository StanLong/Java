/*
    HeshSet ����
    
    HeshSet �൱�� HashMap �е�key�� ��HashMap�����Ԫ��ʹ��put������ put{key, value} key�����򣬲����ظ���
    ���Ԫ��ʱ���ȵ���key��hashCode������ ���hashCodeû���ظ��ģ�������Ԫ�ء�
    
    ���´�����
    e1 �� e2 ��new�������������������ڴ��ַ����һ����e1��e2��hashCodeֵҲ��һ����
    �����Ҫ��дhashCode������ ��� hashCode ���ص�ֵһ������Ҫ��дequals�������ж�
    
    �洢��HashSet���ϻ���HashMap����key���ֵ�Ԫ�أ���Ҫͬʱ��дhashCode() �� equals() ������
*/

import java.util.*;
public class Test{
    
    public static void main(String[] args) throws Exception{
        // ��������
        Set es = new HashSet();
        
        // ��������
        Employee e1 = new Employee("zhangsan", "10"); 
        Employee e2 = new Employee("zhangsan", "10"); 
        Employee e3 = new Employee("lise", "20");
        Employee e4 = new Employee("wangwu", "30");
        Employee e5 = new Employee("zhaoliu", "40");
        Employee e6 = new Employee("chenqi", "50");
        
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
        
        // ���Ԫ��
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
    
    // ��дequals ����
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
    
        
    // ��дhashCode����
    public int hashCode(){
        // �Ա�ŷ���
        return no.hashCode(); // ���ȷֲ�����ͬ��������
    }
    
}
