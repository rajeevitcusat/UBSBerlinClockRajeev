package com.ubs.interview.model;

public class Lamp {

	private Colour colour;
	private boolean on;
	
	public Lamp(Colour colour) {
		this.colour = colour;
		this.on = false;
	}
	public Colour getColour() {
		return colour;
	}
	public void setColour(Colour colour) {
		this.colour = colour;
	}
	public boolean isOn() {
		return on;
	}
	public void turnOn() {
		this.on = true;
	}
	
	public void turnOff() {
		this.on = false;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if(this.on)
		{
			return colour.toString();
		}
		else{
			return	"O";
		}
	}
	
	
	
}
