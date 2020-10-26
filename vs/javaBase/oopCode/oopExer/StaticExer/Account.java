package javaBase.oopCode.oopExer.StaticExer;

/**
 * Account
 */
public class Account {
	
	private int id;
	private String pwd = "000000";
	private double balance;
	
	private static double interestRate;
	private static double minMoney = 1.0;
	private static int init = 1001;//用于自动生成id使用的
	
	public Account(){
		id = init++;
	}
	
	public Account(String pwd,double balance){
		id = init++;
		this.pwd = pwd;
		this.balance = balance;
	}
	


	@Override
	public String toString() {
		return "Account [id=" + id + ", pwd=" + pwd + ", balance=" + balance + "]";
	}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public static double getMinMoney() {
        return minMoney;
    }

    public static void setMinMoney(double minMoney) {
        Account.minMoney = minMoney;
    }

    public static int getInit() {
        return init;
    }

    public static void setInit(int init) {
        Account.init = init;
    }
	
	
	
}
