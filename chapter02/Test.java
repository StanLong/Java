/*
  �����ڲ���
  �ŵ�:�ٶ���һ����
  ȱ��:�޷��ظ�ʹ��
*/

public class Test{
    
    // ��̬����
    public static void t(CustomerService cs){
        cs.logout();
        
    }
    
    
    public static void main(String[] args){
        // ����t����
        t(new CustomerServiceImpl());
        
        // ʹ�������ڲ���ķ�ʽ����t����
        // ���� new CustomerService(){} ���������ڲ���
        t(new CustomerService(){
            public void logout(){
                System.out.println("ϵͳ�Ѱ�ȫ�˳���");
            }
        });
        
    }
}

interface CustomerService{
    void logout();
}

// ��дһ����ʵ�� CustomerService �ӿ�
class CustomerServiceImpl implements CustomerService{
    public void logout(){
        System.out.println("ϵͳ�Ѱ�ȫ�˳���");
    }
}