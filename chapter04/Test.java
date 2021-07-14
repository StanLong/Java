/*
  ʹ������ģ��ջ
  ջ�� ����ȳ�
*/

public class Test{
    
    public static void main(String[] args){
       Stack stack = new Stack();
       
       User user1 = new User("zs", 10);
       User user2 = new User("li", 20);
       User user3 = new User("ww", 30);
       User user4 = new User("zl", 40);
       User user5 = new User("cq", 50);
       
       
       // ѹջ
       try{
           stack.push(user1);
           stack.push(user2);
           stack.push(user3);
           stack.push(user4);
           stack.push(user5);
       }catch(StackOperationException e){
           System.out.println(e.getMessage());
       }
       
       
       // ��ջ
       try{
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());    
       }catch(StackOperationException e){
            System.out.println(e.getMessage());
       }
    }
}

class Stack{
    // ʹ������洢����
    Object[] elements;
       
    // ָ��ջ��Ԫ��
    int index;
       
    // ջĬ�ϵĳ�ʼ��������5��
    Stack(){
        this(5);
    }
    
    Stack(int max){
        elements = new Object[max];
    }
    
    // ѹջ
    public void push(Object element) throws StackOperationException{
        elements[index] = element;
        index ++ ;        
        if(index == elements.length){
            throw new StackOperationException("ջ����");
        }
    }
    
    // ��ջ
    public Object pop() throws StackOperationException{ // ջ����Ԫ�����ⵯ
        index--;
        if(index == 0){
            throw new StackOperationException("ջ�ѿ�");
        }
        return elements[index];
    }
}


class User{
    String name;
    int age;
    
    User(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public String toString(){
        return "User[name=" + name + ", age= " + age + "]";
    }
}

// �쳣����
class StackOperationException extends Exception{
    public StackOperationException(){
        
    }
    
    public StackOperationException(String msg){
        super(msg);
    }
}