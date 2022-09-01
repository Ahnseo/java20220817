package ch08.book.s080303;

public class SmartTv implements RemoteControl, Searchable {
	private int volume ;
	private boolean mute;

	@Override
	public void Search(String url) {
		System.out.println(url + "을 검색합니다.");
		
	}

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
		
	}
	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println("무음 처리합니다.");
		}else {
			System.out.println("무음 해제합니다.");
		}
		
	}

	
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUM) {
			this.volume = RemoteControl.MAX_VOLUM;
		}else if (volume<RemoteControl.MIN_VOLUM){
			this.volume = RemoteControl.MIN_VOLUM;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 볼륨값은: "+this.volume);
	}
	
}
