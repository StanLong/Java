/*
    线程同步 synchronized 关键字
*/

import java.io.*;
public class Test{
    
    public static void main(String[] args) throws Exception{
        //创建一个公共账户
		Account act = new Account("123",5000.0);
		//创建线程
		Thread t1 = new Thread(new Processor(act));
		Thread t2 = new Thread(new Processor(act));	
		
 
		//启动线程
		t1.start();
		t2.start();
        
    }
}

//取款线程
class Processor implements Runnable{
	Scanner sc = new Scanner(System.in);
	
	Account act ;
	//构造方法
	 Processor(Account act) {
		this.act=act;
	}
	public void run() {
		double money;
		System.out.println("您的余额为："+act.getbalance()+"请输入要取款的金额：");
		money =sc.nextDouble();
		act.withdraw(money);
		System.out.println("取款"+money+"元成功，您的余额为："+act.getbalance());
	}
}

//账户类
class Account{
	private String actno;  //账户
	private double balance;  //余额
	
	//有参构造方法
	public Account(String actno,double balance) {
		this.actno = actno;
		this.balance = balance;
	}
	//setter and getter
	
	public String getactno() {
		return actno;
	}
	
	public double getbalance() {
		return balance;
	}
	
	public void setactno(String actno) {
		this.actno = actno;
	}
	
	public void setbalance(double balance) {
		this.balance = balance;
	}
	
	//账户类提供一个取款方法
	public void withdraw(double money) {
		//把需要同步的代码，放到同步语句块中
		synchronized(this) {   //小括号中填入共享对象，this就是账户
		double after = balance - money;
		try{Thread.sleep(1000);}catch(Exception e) {} //需要将线程执行的时间分开
	    setbalance(after);
		}    
 
	}
}