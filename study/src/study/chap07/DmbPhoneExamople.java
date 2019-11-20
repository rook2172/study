package study.chap07;

public class DmbPhoneExamople {

	public static void main(String[] args) {
		CellPhone cp = new CellPhone();
		cp.powerOn();
		cp.sendMessage("¾È³ç");
		String msg = cp.receivelMessage();
		cp.powerOff();
		
		DmbPhone dp = new DmbPhone();
		String rxMsg = dp.receivelMessage();
		dp.changeChannel(11);
		dp.dmb_powerOff();
				
	}

}
