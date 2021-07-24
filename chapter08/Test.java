/*
    �߳����ȼ�
    ���ȼ��ߵĻ�ȡCPUʱ��Ƭ��Զ�һЩ
    ���ȼ�: 1-10 
    ��� 1  MIN_PRIORITY
    ��� 10 MAX_PRIORITY
    Ĭ�� 5  NORM_PRIORITY
*/

import java.io.*;
public class Test{
    
    public static void main(String[] args) throws Exception{
        Thread t1 = new Processor();
        t1.setName("t1");
        
        Thread t2 = new Processor();
        t2.setName("t2");
        
        // �������ȼ�
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        
        t1.setPriority(1);
        t2.setPriority(10);
        
        t1.start();
        t2.start();
        
    }
    
}

class Processor extends Thread{
    
    // ��дrun����
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println(Thread.currentThread().getName() + " ---> " + i);
        }
    }
}
