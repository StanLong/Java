/*
    �ݹ��ҳ�ָ��Ŀ¼�µ�����Ŀ¼���ļ�
    
*/

import java.io.*;
public class Test{
    
    public static void main(String[] args) throws Exception{
        String path = "D:/StanLong/git_repository/Java";
        File file = new File(path);
        m1(file);
    }
    
    public static void m1(File f){
        
        if(f.isFile()){
            return;
        }
        
        File[] fs = f.listFiles();
        
        for(File subFile : fs){
            System.out.println(subFile.getAbsolutePath());
            m1(subFile);
        }
    }
}
