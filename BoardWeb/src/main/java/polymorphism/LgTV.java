package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class LgTV implements TV {
	@Autowired
//	@Qualifier("Apple")
	private Speaker speaker;
	private int price;
	
	public LgTV() {
		System.out.println("===> LGTV 객체(1) 생성");
	}
	
	public LgTV(Speaker speaker, int price) {
		System.out.println("===> LGTV 객체(2) 생성");
		this.speaker = speaker;
		this.price = price;
		System.out.println(this.getClass() + "의 Speaker는 " + this.speaker.getClass().getName() + "이고 가격은 " + this.price + " 원 입니다.");
	}
	
	public void initMethod() {
		System.out.println("LgTV 객체 초기화 작업");
	}
	
	public void destroyMethod() {
		System.out.println("LgTV 객체 삭제 전 처리 로직");
	}
	
	public void powerOn() {
		System.out.println("LgTV --- 전원 켠다");
	}
	
	public void powerOff() {
		System.out.println("LgTV --- 전원 끈다");
	}
	
	public void volumeUp() {
		speaker.volumeUp();
	}

	public void volumeDown() {
		speaker.volumeDown();
	}
}
