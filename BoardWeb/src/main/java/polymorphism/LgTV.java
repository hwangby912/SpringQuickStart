package polymorphism;

public class LgTV implements TV {
	public LgTV() {
		System.out.println("===> LgTV 객체 생성");
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
		System.out.println("LgTV --- 소리 올린다");
	}

	public void volumeDown() {
		System.out.println("LgTV --- 소리 내린다");
	}
}
