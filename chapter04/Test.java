/*
  使用数组模拟栈
  栈： 后进先出
*/

public class Test{
    
    public static void main(String[] args){
       Stack stack = new Stack();
       
       User user1 = new User("zs", 10);
       User user2 = new User("li", 20);
       User user3 = new User("ww", 30);
       User user4 = new User("zl", 40);
       User user5 = new User("cq", 50);
       
       
       // 压栈
       try{
           stack.push(user1);
           stack.push(user2);
           stack.push(user3);
           stack.push(user4);
           stack.push(user5);
       }catch(StackOperationException e){
           System.out.println(e.getMessage());
       }
       
       
       // 弹栈
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
    // 使用数组存储数据
    Object[] elements;
       
    // 指向栈顶元素
    int index;
       
    // 栈默认的初始化容量是5个
    Stack(){
        this(5);
    }
    
    Stack(int max){
        elements = new Object[max];
    }
    
    // 压栈
    public void push(Object element) throws StackOperationException{
        elements[index] = element;
        index ++ ;        
        if(index == elements.length){
            throw new StackOperationException("栈满了");
        }
    }
    
    // 弹栈
    public Object pop() throws StackOperationException{ // 栈顶的元素往外弹
        index--;
        if(index == 0){
            throw new StackOperationException("栈已空");
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

// 异常处理
class StackOperationException extends Exception{
    public StackOperationException(){
        
    }
    
    public StackOperationException(String msg){
        super(msg);
    }
}