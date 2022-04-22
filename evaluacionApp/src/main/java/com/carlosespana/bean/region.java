package com.carlosespana.bean;

public class region {
	private Long id;
	private String region;
	private int tarifa;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public int getTarifa() {
		return tarifa;
	}
	public void setTarifa(int tarifa) {
		this.tarifa = tarifa;
	}
	
	@Override
	public String toString() {
		return "region [id=" + id + ", region=" + region + ", tarifa=" + tarifa + "]";
	}
}
