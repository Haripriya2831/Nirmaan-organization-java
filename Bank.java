package Assessment2;

public class Bank {
	private long AccountNo=216082316;
	private String AccHolderName="S.keerthana";
	private int AccBal=200000;
	private int Pin=1607;
	
	public long getAccountNo() {
		return AccountNo;
	}
	
	public void setAccountNo(long AccountNo) {
		this.AccountNo = AccountNo;
	}
	
	public String getAccHolderName() {
		return AccHolderName;
	}
	
	public void setAccHolderName(String AccHolderName) {
		this.AccHolderName =AccHolderName;
	}
	
	public int getAccBal() {
		return AccBal;
	}
	
	public int setAccBal(int AccBal) {
		this.AccBal = AccBal;
		return AccBal;
	}
	
	public int getPin() {
		return Pin;
	}
	public void setPin(int Pin) {
		this.Pin = Pin;
	}
	@Override
	public String toString() {
		return "Bank [AccountNo=" + AccountNo + ", AccHolderName=" + AccHolderName + ", AccBal=" + AccBal  + "]";
		
	}
	


}
