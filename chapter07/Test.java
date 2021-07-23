/*
    文件复制
    只能复制文本文件
*/

import java.io.*;
public class Test{
    
    public static void main(String[] args) throws Exception{
        FileReader fr = null;
        FileWriter fw = null;
        try{
            fr = new FileReader("Test2.txt");
            fw = new FileWriter("D:/StanLong/git_repository/Java/chapter06/abc2.txt"); 
            
            char[] chars = new char[512];
            int temp = 0;
            
            while((temp = fr.read(chars)) != -1){
                fw.write(chars, 0 , temp);
            }
            
            
            fw.flush();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(fw != null){
                try{
                    fr.close();
                    fw.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
                
            }
            
        }
    }
}
