package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		// 1. Spring 컨테이너 구동
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2. Spring 컨테이너로부터 필요한 객체 생성 요청
//		TV tv1 = (TV)factory.getBean("SamsungTV");
//		TV tv2 = (TV)factory.getBean("SamsungTV");
//		TV tv3 = (TV)factory.getBean("SamsungTV");
		
		TV tv1 = (TV)factory.getBean("SamsungTV");
		tv1.powerOn();
		tv1.volumeUp();
		tv1.volumeDown();
		tv1.powerOff();

		// SamsungTV로만 실습을 위하여 주석 처리함(applicationContext.xml 부분 제거하면 LGTV 부분 사용 가능)
		/*
		TV tv2 = (TV)factory.getBean("LgTV");
		tv2.powerOn();
		tv2.volumeUp();
		tv2.volumeDown();
		tv2.powerOff();
		*/
		
		// 3. Spring 컨테이너 종료
		factory.close();
	}
}
