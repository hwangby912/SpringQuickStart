package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("SamsungTV")
public class SamsungTV implements TV {
	@Autowired
	private Speaker speaker;
	private int price;
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker() 호출");
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		System.out.println("===> setPrice() 호출");
		this.price = price;
	}

	public SamsungTV() {
		System.out.println("===> SamsungTV 객체(1) 생성");
	}
	
	public SamsungTV(Speaker speaker) {
		System.out.println("===> SamsungTV 객체(2) 생성");
		this.speaker = speaker;
	}
	
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("===> SamsungTV 객체(3) 생성");
		this.speaker = speaker;
		this.price = price;
		System.out.println(this.getClass() + "의 Speaker는 " + this.speaker.getClass().getName() + "이고 가격은 " + this.price + " 원 입니다.");
	}
	
	public void initMethod() {
		System.out.println("SamsungTV 객체 초기화 작업");
	}
	
	public void destroyMethod() {
		System.out.println("SamsungTV 객체 삭제 전 처리 로직");
	}
	
	public void powerOn() {
		System.out.println("SamsungTV --- 전원 켠다 (가격 : " + price + ")");
	}
	
	public void powerOff() {
		System.out.println("SamsungTV --- 전원 끈다");
	}
	
	public void volumeUp() {
		speaker.volumeUp();
	}

	public void volumeDown() {
		speaker.volumeDown();
	}
}
