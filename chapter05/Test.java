/*
    String
    ������Java��ʹ��""���������ַ����������ַ����������д���һ�ݣ��ַ����������ڷ������б��洢
*/
public class Test{
    
    public static void main(String[] args){
        String s1 = "Hello"; // ���ַ������������½���һ��"Hello" ���� �ö��󲻱�
        String s2 = "Hello"; // ���ַ���������������ֱ����
        System.out.println(s1 == s2); // true
        
        
        
        String s3 = new String("Hello"); 
        String s4 = new String("Hello");
        
        // s3��s4��������ͬ���ַ������� == �Ƚϵ����ڴ��ַ�����Խ����false
        System.out.println(s3 == s4);  // false
        
        // �Ƚ������ַ����Ƿ�һ�£�����ʹ��String���ṩ��equals����
        System.out.println(s3.equals(s4)); // true
        
        // s2 �� s3�����ַ������������
        // s2 ֻ���ַ����������ﴴ��һ������
        // s3 ���ڶ��ڴ���ַ�����������ֱ𴴽�һ�������˷��ڴ�
        
        // ����14��15�о����ڴ��д������������� �����������������ַ�����������һ��
        
        // �����ַ����Ĺ��췽��
        byte[] bytes = {97, 98, 99, 100};
        String s5 = new String(bytes);
        String s6 = new String(bytes, 1, 2);
        System.out.println(s5); // abcd
        System.out.println(s6); // bc
        
        char[] c1 = {'��','��','��','��','��'};
        String s7 = new String(c1);
        String s8 = new String(c1, 2, 2);
        System.out.println(s7); // �����й���
        System.out.println(s8); // �й�
    }
}
