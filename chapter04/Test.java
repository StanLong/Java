/*
    Arrays ������
*/
import java.util.Arrays;
public class Test{
    
    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        
        // ����
        Arrays.sort(a);
        
        for(int i =0; i<a.length; i++){
            System.out.println(i);
        }
        
        // ������֮������ݽ��ж��ֲ���
        int index = Arrays.binarySearch(a, 2);
        System.out.println("�±�: " + index);
        
    }
}
