/*
    �����������ֽ��ַ����������
    �ֽ�
    BufferedInputStream
    BufferedOutputStream
    
    �ַ�
    BufferedReader
    BufferedWriter
    
    ת����
    InputStreamReader
*/

import java.io.*;
public class Test{
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = null;
            
        /*FileInputStream fis = new FileInputStream("Test.java"); // �ļ��ֽ�������
        
        InputStreamReader isr = new InputStreamReader(fis); // ���ֽ���ת�����ַ���
       
        br = new BufferedReader(isr);*/
        
        // ��д
        br = new BufferedReader(new InputStreamReader(new FileInputStream("Test.java")));
        
        // ��ʼ��
        String temp = null;
        while((temp = br.readLine()) != null){ // br.readLine() ��β�������з�
            System.out.println(temp);
        }
        
        br.close(); // ʹ����װ����ģʽ������ֻҪ�ر�������������
    }
}