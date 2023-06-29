package com.tsr.editors;

import java.beans.PropertyEditorSupport;

import com.tsr.bean.GeoLocation;

public class GeoLocationPropertyEditor extends PropertyEditorSupport{

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		
		String[] tokens = text.split(",");
		GeoLocation geoLocation = new GeoLocation();
		geoLocation.setLatitude(Double.valueOf(tokens[0]));
		geoLocation.setLongitude(Double.valueOf(tokens[1]));
		
		super.setValue(geoLocation);
	}
	
}
