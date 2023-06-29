package com.tsr.bean;

public class NavigationMap {
	
	private GeoLocation geoLocation;

	public NavigationMap() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NavigationMap(GeoLocation geoLocation) {
		super();
		this.geoLocation = geoLocation;
	}

	public GeoLocation getGeoLocation() {
		return geoLocation;
	}

	public void setGeoLocation(GeoLocation geoLocation) {
		this.geoLocation = geoLocation;
	}

	@Override
	public String toString() {
		return "NavigationMap [geoLocation=" + geoLocation + "]";
	}
}
