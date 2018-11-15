package homework1;

import java.util.Date;

public class training9_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//	账•户类 Account)设计一个名为 Account 的类，它包括:
//		• —个名为id的int类型私有数据域(默认值为0)。
//		• — 个名为 balance 的 double 类型私有数据域(默认值为 0>。
//		• — 个 名 为 annuallnterestRate 的 double 类型私有数据域存储当前利率(默认值为 0)。假
//		设所有的篆户都有相同的利率。
//		• — 个 名 为 dateCreated 的 Date 类型的私有数据域，存储账户的开户日期。
//		• — 个用于创建默认账户的无参构造方法。
//		•一个用于创建带特定id和初始余额的账户的构造方法。
//		• id 、balance 和 annuallnterstRate 的访问器和修改器。
//		• dateCreated 的访问器。
//		• 一个名为 getMonthlyInterestRate()的方法，返回月利率。
//		• —个名为 withDraw 的方法，从账户提取特定数额。
//		• —个名为 deposit 的方法向账户存储特定数额。
//		画出该类的UML图并实现这个类。
//		提示:方法 getMonthlylnterestO 用于返回月利息，而不是利率。月利息是 balance*monthly- InterestRate
//		.monthlylnterestRate 
//		是 annualInterestRate/12。注意，annualInterestRate 是一个百分教，比如4.5%。你需要将其除以100。
//		编写一个测试程序，创建一个账户ID 为1122、余额为20000美元、年利率为4.5%的 Account 对象。使用 withdraw 方法取款 2500 美元，
//		使用 deposit 方法存款 3000 美元，然后打印余额,月利息以及这个账户的开户日期。
	Account account=new Account();
	account.setId(1122);
	account.setBalance(20000);
	account.setAnnuallnterestRate(4.5);
	account.withDraw(2500);
	account.deposit(3000);
	System.out.print(account.getBalance()+" "+account.getMonthlyInterestRate()*account.getBalance()+" "+account.getDate());
	}
}
class Account{
	private int id;
	private double balance;
	private double annuallnterestRate;
	private java.util.Date dateCreated=new java.util.Date();
	public Account() {	
		id=0;
		balance=0;
		annuallnterestRate=0;
	}
	public Account(int id,double balance) {
		this.id=id;
		this.balance=balance;
	}
	public int getId(){
		return this.id;
	}
	public void setId(int id){
		this.id=id;	
	}
	public double getBalance() {
		return this.balance;
		
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public double getAnnuallnterestRate() {
		return this.annuallnterestRate;
	}
	public void setAnnuallnterestRate(double annuallnterestRate) {
		this.annuallnterestRate=annuallnterestRate;
	}
	public java.util.Date getDate(){
		return this.dateCreated;
	}
	public double getMonthlyInterestRate() {
		return this.annuallnterestRate/12/100;
	}
	public double withDraw(double count) {
		this.balance=this.balance-count;
		return this.balance;
	}
	public double deposit(double count)
	{
		this.balance=this.balance+count;
		return this.balance;
	}
	
	
	
	
	
}
