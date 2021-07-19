/*
    集合
*/

import java.util.*;
public class Test{
    
    public static void main(String[] args) throws Exception{
        // 创建集合对象
        Collection c = new LinkedList();
        c.add(100);
        c.add(3.14);
        c.add(false);
        
        Iterator it = c.iterator(); // c 集合
        
        while(it.hasNext()){
            Object element = it.next();
            System.out.println(element);
        }
        
    }
}
