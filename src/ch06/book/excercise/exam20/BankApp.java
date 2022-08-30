package ch06.book.excercise.exam20;

import java.util.Arrays;
import java.util.Scanner;

public class BankApp {
	/**field 선언 */
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int size =0;	
			
	/**main method*/
	public static void main(String[] args) {		
		 boolean run =true;
		 
		 
		 while(run) {
			 System.out.println("---------------------------------------------------");
			 System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			 System.out.println("---------------------------------------------------");
			 System.out.print("선택");
			 
			 int selectNo = scanner.nextInt();
			 
			 if(selectNo == 1) {
				 createAccount();
			 }else if(selectNo == 2) { 
				 accountList();		 
			 }else if(selectNo == 3) {
				 deposit();
			 }else if(selectNo == 4) {
				 withdraw();
			 }else if(selectNo == 5) {
				run =false;	
			 }	
		 }
		 System.out.println("프로그램 종료");
	}
	
	private static void createAccount() {
		 System.out.println("--------");
		 System.out.println("계좌생성");
		 System.out.println("--------");
		 System.out.print("계좌번호: ");
		 String ano = scanner.next();
		
		 System.out.print("계좌주: ");
		 String owner = scanner.next();
			 
		 System.out.print("초기입금액: ");
		 int balance = scanner.nextInt();
		  
		 Account a1 = new Account(ano, owner, balance);
		 accountArray[size] = a1;
		 size++;
		 System.out.println("계좌가 생성 되었습니다.");
		 
	}
	private static void accountList() {
		 System.out.println("--------");
		 System.out.println("계좌목록");
		 System.out.println("--------");
		 
		 for(int i =0; i < size; i++) {
			 
			 System.out.println(accountArray[i].getAno()
			 			+"\t"+ accountArray[i].getOwner()
			 			+"\t"+accountArray[i].getBalance());
		 }
	}
	private static void deposit() {	
		 System.out.println("--------");
		 System.out.println("예금");
		 System.out.println("--------");
		 System.out.print("계좌번호: ");
		 String ano = scanner.next();
		 Account a1 = findAccount(ano);
		 
		 System.out.print("예금액: ");
		 int money = scanner.nextInt();
		 
		 money = a1.getBalance() + money; 
		 a1.setBalance(money);
		 
		
	}
	private static void withdraw() {
		// TODO Auto-generated method stub
		
	}
	private static Account findAccount(String ano) {
		//주소가 같은지 ?
		Account result = null;
		for(int i=0; i<size; i++) {
			if(accountArray[i].getAno().equals(ano)) {
				result = accountArray[i];
				break;
			}
		}
		return result;
	}
//	

	

	
}
