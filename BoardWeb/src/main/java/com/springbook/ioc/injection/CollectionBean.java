package com.springbook.ioc.injection;

import java.util.List;
import java.util.Set;
import java.util.Map;

public class CollectionBean {
	private List<String> addressList;
	private Set<String> addressSet;
	private Map<String, String> addressMap;

	public void setAddressList(List<String> addressList) {
		this.addressList = addressList;
	}

	public List<String> getAddressList() {
		return addressList;
	}

	public void setAddressSet(Set<String> addressSet) {
		this.addressSet = addressSet;
	}	

	public Set<String> getAddressSet() {
		return addressSet;
	}

	public void setAddressMap(Map<String, String> addressMap) {
		this.addressMap = addressMap;
	}
	
	public Map<String, String> getAddressMap() {
		return addressMap;
	}
}
