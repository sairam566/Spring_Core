package com.tsr.primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alarm {
	@Autowired
	private Bell bell;

	public void remind() {
		bell.ring();
	}
}