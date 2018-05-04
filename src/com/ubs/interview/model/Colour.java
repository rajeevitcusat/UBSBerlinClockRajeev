package com.ubs.interview.model;

public enum Colour {
	RED("R"),
	YELLOW("Y");

	private String charColour;
	private Colour(String charColour) {
		this.charColour = charColour;
	}


	@Override
	public String toString() {
		return charColour;
	}

}
