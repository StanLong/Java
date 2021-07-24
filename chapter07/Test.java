/*
    带缓冲区的字节字符输入输出流
    字节
    BufferedInputStream
    BufferedOutputStream
    
    字符
    BufferedReader
    BufferedWriter
    
    转换流
    InputStreamReader
*/

import java.io.*;
public class Test{
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = null;
            
        /*FileInputStream fis = new FileInputStream("Test.java"); // 文件字节输入流
        
        InputStreamReader isr = new InputStreamReader(fis); // 将字节流转换成字符流
       
        br = new BufferedReader(isr);*/
        
        // 简写
        br = new BufferedReader(new InputStreamReader(new FileInputStream("Test.java")));
        
        // 开始读
        String temp = null;
        while((temp = br.readLine()) != null){ // br.readLine() 行尾不带换行符
            System.out.println(temp);
        }
        
        br.close(); // 使用了装饰者模式，这里只要关闭最外层的流即可
    }
}