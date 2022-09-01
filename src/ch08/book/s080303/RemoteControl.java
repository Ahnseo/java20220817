package ch08.book.s080303;

public interface RemoteControl {
	int MAX_VOLUM = 10;
	int MIN_VOLUM = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//인터페이스의 디폴트 메소드
	public void setMute(boolean mute);
}

