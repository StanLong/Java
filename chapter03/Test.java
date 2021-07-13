/*
  �Զ����쳣
    1. ����ʱ�쳣 ֱ�Ӽ̳� Exception
    2. ����ʱ�쳣 ֱ�Ӽ̳� RuntimeException
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

// ����ʱ�쳣
class IllegalNameException extends Exception{
    
    // �����쳣һ���ṩ�������췽��
    public IllegalNameException(String msg){
        super(msg);
    }
}

class CustomerService{
    public void register(String name) throws IllegalNameException{
        if (name.length() < 6){
            // �����쳣����
            //IllegalNameException e = new IllegalNameException("�û������Ȳ�������6λ");
            // �ֶ��׳��쳣
            // throw e;
            
            //�ɼ�д
            throw new IllegalNameException("�û������Ȳ�������6λ");
        }
        System.out.println("ע��ɹ�");
    }
}