/*
    Arrays 工具类
*/
import java.util.Arrays;
public class Test{
    
    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        
        // 排序
        Arrays.sort(a);
        
        for(int i =0; i<a.length; i++){
            System.out.println(i);
        }
        
        // 对排序之后的数据进行二分查找
        int index = Arrays.binarySearch(a, 2);
        System.out.println("下标: " + index);
        
    }
}
