package B;

public class Client implements ClientInterface {
	private int accountBalance ; 
	private String name ; 
	private int customerID ;
	
	public int getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public Client(int accountBalance, String name, int customerID) {
		super();
		this.accountBalance = accountBalance;
		this.name = name;
		this.customerID = customerID;
	} 
	
	
	
}
