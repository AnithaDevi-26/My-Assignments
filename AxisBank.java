package bank;

public class AxisBank extends BankInfo{
	public void deposit() {
		System.out.println("deposit() from AxisBank");
	}
	public static void main(String[] args) {
		AxisBank axis = new AxisBank();
		axis.saving();
		axis.fixed();
		axis.deposit();
	}
	

}
