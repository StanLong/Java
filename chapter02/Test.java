/*
  ������
  �������޷���ʵ����
  ��Ȼ������û�а취ʵ���������ǳ�����Ҳ�й��췽�����ù��췽���Ǹ����ഴ�������õ�
  �������в�һ���г��󷽷������ǳ��󷽷���������ٳ������С�
  �ǳ������̳г����࣬���뽫�������еķ���������д��
*/

public class Test{
    public static void main(String[] args){
        // �������޷���ʵ����
        // A a = new A();
        A a = new B();
        a.m1();
    }
}


abstract class A {  
    A(){
        System.out.println("A....");
    }
    
    public abstract void m1();
}

class B extends A{
    B(){
        // ������һ����ʽ�Ĵ��� super(); ���ø�����޲ι��췽���� ���췽����Ȼ�����ˣ����ǲ�û�д�������
        System.out.println("B....");
    }
    
    public void m1(){
        System.out.println("���󷽷����뱻��д");
    }
}