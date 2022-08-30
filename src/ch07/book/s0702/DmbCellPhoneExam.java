package ch07.book.s0702;

public class DmbCellPhoneExam {
	public static void main(String[] args) {
		
	//DmbCellPhone객체 생성
	DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
	
//	CellPhone 으로부터 상속받은 필드
	System.out.println(dmbCellPhone);
	System.out.println(dmbCellPhone.color);

	System.out.println(dmbCellPhone.channel);
	
	dmbCellPhone.powerOn();
	dmbCellPhone.bell();
	dmbCellPhone.sendVoice();
	dmbCellPhone.receiveVoice();
	dmbCellPhone.sendVoice();
	dmbCellPhone.hangUp();
	
	dmbCellPhone.turnOnDmb();
	dmbCellPhone.changeChannelDmb(12);
	dmbCellPhone.turnOffDmb();
	
	
	}
}
