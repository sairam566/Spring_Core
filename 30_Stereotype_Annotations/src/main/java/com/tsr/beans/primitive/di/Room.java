package com.tsr.beans.primitive.di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//Have Source Code
// Target
@Component
public class Room {
	@Value("#{prop.roomNo}")
	private int roomNo;
	@Value("#{prop.roomCapacity}")
	private int seatingCapacity;
	
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public int getSeatingCapacity() {
		return seatingCapacity;
	}
	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}
	@Override
	public String toString() {
		return "Room [roomNo=" + roomNo + ", seatingCapacity=" + seatingCapacity + "]";
	}
	
}
