/*
    ������ʽ
*/
import java.lang.StringBuffer;
import java.lang.StringBuilder;
public class Test{
    
    public static void main(String[] args){
        // ���� У��qq��
        // Ҫ�� ����5-15, ������0��ͷ��ֻ��������
        
        String qq = "a1534824780";
        
        // У�����
        String regex = "[1-9][0-9]{4,14}";
        
        boolean flag = qq.matches(regex);
        
        if(flag){
            System.out.println("У��ɹ�");
        }else{
            System.out.println("У��ʧ��");
        }
    }
}
