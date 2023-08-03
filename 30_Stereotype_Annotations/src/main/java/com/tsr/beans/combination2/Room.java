package com.tsr.beans.combination2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//Have Source Code
// Dependent
@Component
public class Room {
	@Value("566")
	private int roomNo;
	@Value("20")
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
