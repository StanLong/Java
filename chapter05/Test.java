/*
    ��װ����
    ������������	��װ����
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
    
    // ���󣺹涨m1�������Խ���java���κ�һ����������
    // Objectֻ�ܽ��ܻ����������ͣ����ܽ��������������ͣ�
    // ����m1������������byte���͵����ݣ����Խ�byte�����Ȱ�װ��java.lang.Byte�� �ٴ��ݲ���
    public static void m1(Object o){
        System.out.println(o);
    }
    
    public static void main(String[] args){
        // ������������
        byte b = 10;
        
        // ��������
        Byte b1 = new Byte(b);
        
        m1(b);
    }
}
