/*
    Comparator
*/

import java.util.*;
public class Test{
    
    public static void main(String[] args) throws Exception{
        // 创建TreeSet集合的时候提供一个比较器
        // SortedSet products = new TreeSet(new ProductComparator());
        
        // 使用匿名内部类的方式
        SortedSet products = new TreeSet(new Comparator(){
            // 按商品价格排序
            public int compare(Object o1, Object o2){
                double price1 = ((Product)o1).price;
                double price2 = ((Product)o2).price;
                if(price1 == price2){
                    return 0;
                }else if(price1>price2){
                    return 1;
                }else{
                    return -1;
                }
            }
        });
        
        Product p1 = new Product(3.1);
        Product p2 = new Product(2.1);
        Product p3 = new Product(3.1);
        Product p4 = new Product(3.5);
        Product p5 = new Product(4.1);
        Product p6 = new Product(4.4);
        
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);
        products.add(p6);
        
        Iterator it = products.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

class Product{
    double price;
    
    Product(double price){
        this.price = price;
    }
    
    public String toString(){
        return price + "";
    }
}

// 单独编写一个比较器
class ProductComparator implements Comparator{
    
    // 按商品价格排序
    public int compare(Object o1, Object o2){
        double price1 = ((Product)o1).price;
        double price2 = ((Product)o2).price;
        if(price1 == price2){
            return 0;
        }else if(price1>price2){
            return 1;
        }else{
            return -1;
        }
    }
}