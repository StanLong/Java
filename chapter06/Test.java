/*
    ����
*/

import java.util.*;
public class Test{
    
    public static void main(String[] args) throws Exception{
        // �������϶���
        Collection c = new LinkedList();
        c.add(100);
        c.add(3.14);
        c.add(false);
        
        Iterator it = c.iterator(); // c ����
        
        while(it.hasNext()){
            Object element = it.next();
            System.out.println(element);
        }
        
    }
}
