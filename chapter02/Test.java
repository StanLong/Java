/*
  ��Ա�ڲ���
    ��Ա�ڲ�����Ե�ͬ������Ա����
    ��Ա�ڲ����в����о�̬����
    ��Ա�ڲ�����Է����ⲿ���Ե�����
*/

public class Test{
    
    // ��̬����
    private static String name="StanLong";
    
    // ��Ա����
    private int id = 10; 
    
    // ��̬����
    private static void m1(){
        System.out.println("static m1");
    }
    
    // ��Ա����
    private void m2(){
        System.out.println("method m2");
    }
    
    // ��Ա�ڲ���
    class InnerClass{
        // ��̬����
        /*public static void m3(){
            //System.out.println(name);
            //m1();
            
            System.out.println(id);
            m2();
        }*/
        
        // ��Ա����
        public void m4(){
            System.out.println(name);
            m1();
            
            System.out.println(id);
            m2();
        }
    }
   
    
    public static void main(String[] args){
        // �����ⲿ�����
        Test t = new Test();
        // �ⲿ��ʵ������Ա�ڲ������
        InnerClass inner = t.new InnerClass();
        // ���ó�Ա�ڲ���ķ���
        inner.m4();
    }
}
