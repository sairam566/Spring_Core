package com.tsr.primary;

public class DigitalBell implements Bell {
	@Override
	public void ring() {
		System.out.println("ringing digital bell");
	}
}