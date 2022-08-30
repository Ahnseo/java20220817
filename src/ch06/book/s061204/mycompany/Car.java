package ch06.book.s061204.mycompany;

//import ch06.book.s061204.hankook.SnowTire
//import ch06.book.s061204.hyundai.Engine;
import ch06.book.s061204.hyundai.*; // .* package 내 모든 클래스를 import
import ch06.book.s061204.hankook.*;
import ch06.book.s061204.kumho.BigWidthTire;

public class Car {
	
	//필드
	Engine engine =new Engine(); // ctrl + shift + o  : 자바 힌트
	
	SnowTire tire1 = new SnowTire();
	
	BigWidthTire tire2 = new BigWidthTire();
	
	ch06.book.s061204.hankook.Tire tire3 = new ch06.book.s061204.hankook.Tire();
	ch06.book.s061204.kumho.Tire tire4 = new ch06.book.s061204.kumho.Tire();
	
}
