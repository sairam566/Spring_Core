package com.tsr.bean;

public class GeoLocation {
	
	private double latitude;
	private double longitude;
	
	public GeoLocation() {
		super();
	}

	public GeoLocation(double latitude, double longitude) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	@Override
	public String toString() {
		return "GeoLocation [latitude=" + latitude + ", longitude=" + longitude + "]";
	}
	
}
