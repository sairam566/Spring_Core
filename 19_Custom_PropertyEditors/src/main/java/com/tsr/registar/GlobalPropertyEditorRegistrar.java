package com.tsr.registar;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

import com.tsr.bean.GeoLocation;
import com.tsr.editors.GeoLocationPropertyEditor;

public class GlobalPropertyEditorRegistrar implements PropertyEditorRegistrar{

	@Override
	public void registerCustomEditors(PropertyEditorRegistry registry) {
		registry.registerCustomEditor(GeoLocation.class, new GeoLocationPropertyEditor());
	}

}
