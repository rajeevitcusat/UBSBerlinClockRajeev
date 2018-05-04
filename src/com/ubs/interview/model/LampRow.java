package com.ubs.interview.model;

import java.util.ArrayList;
import java.util.List;

public class LampRow {

	private List<Lamp> lamps;
	
	public LampRow(int numOfLamps,Colour colour) {
		this.lamps = new ArrayList<>(numOfLamps);

		for (int i = 0; i < numOfLamps; i++) {
			lamps.add(new Lamp(colour));
		}
	}
	
	/**
	 * Turn on these lamps from left and off the rest
	 * @param lampNumber
	 */
	public void turnOn(int lampNumber) {
		if (lampNumber >= 0 && lampNumber <= lamps.size()) {
			for (int i = 0; i < lamps.size(); i++) {
				if (i < lampNumber) {
					lamps.get(i).turnOn();
				} else {
					lamps.get(i).turnOff();
				}
			}
		}
	}
		 
		     @Override
		     public String toString() {
		         StringBuilder sb = new StringBuilder();
		         for (Lamp lamp : lamps) {
		             sb.append(lamp.toString());
		         }
		 
		         return sb.toString();
		     }
		 
		     public void changeColour(Colour colour, int... lampNumbers) {
		         for (int lampNumber : lampNumbers) {
		             if (lampNumber > 0 && lampNumber < lamps.size()) {
		                 lamps.get(lampNumber - 1).setColour(colour);
		             }
		         }
		     }
		 
		     public List<Lamp> getLamps() {
		         return lamps;
		     }
	
}
