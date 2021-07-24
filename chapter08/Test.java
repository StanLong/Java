/*
    线程优先级
    优先级高的获取CPU时间片相对多一些
    优先级: 1-10 
    最低 1  MIN_PRIORITY
    最高 10 MAX_PRIORITY
    默认 5  NORM_PRIORITY
*/

import java.io.*;
public class Test{
    
    public static void main(String[] args) throws Exception{
        Thread t1 = new Processor();
        t1.setName("t1");
        
        Thread t2 = new Processor();
        t2.setName("t2");
        
        // 设置优先级
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        
        t1.setPriority(1);
        t2.setPriority(10);
        
        t1.start();
        t2.start();
        
    }
    
}

class Processor extends Thread{
    
    // 重写run方法
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println(Thread.currentThread().getName() + " ---> " + i);
        }
    }
}
