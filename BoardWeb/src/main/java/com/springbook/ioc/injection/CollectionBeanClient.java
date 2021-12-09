package com.springbook.ioc.injection;

import java.util.List;
import java.util.Set;
import java.util.Map;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import com.springbook.ioc.injection.CollectionBean;

public class CollectionBeanClient {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		CollectionBean bean = (CollectionBean) factory.getBean("collectionBean"); 
		List<String> addressList = bean.getAddressList();
		System.out.println("===> List 시작");
		for(String address : addressList) {
			System.out.println(address.toString());
		}
		
		Set<String> addressSet = bean.getAddressSet();
		System.out.println("===> Set 시작");
		for(String address : addressSet) {
			System.out.println(address.toString());
		}
		
		Map<String, String> addressMap = bean.getAddressMap();
		System.out.println("===> Map 시작");
		for(String key : addressMap.keySet()) {
			System.out.println(key + "의 집 주소는 " + addressMap.get(key));
		}
		
		factory.close();
	}
}
