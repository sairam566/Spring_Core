package com.tsr.beans.combination2;

//No Source Code
//Target
public class Meeting {
	private int id;
	private String agenda;
	private Room room;
	
	public Meeting(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAgenda() {
		return agenda;
	}

	public void setAgenda(String agenda) {
		this.agenda = agenda;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	@Override
	public String toString() {
		return "Meeting [id=" + id + ", agenda=" + agenda + ", room=" + room + "]";
	}
	
}
