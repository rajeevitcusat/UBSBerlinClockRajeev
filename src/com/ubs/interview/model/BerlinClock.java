package com.ubs.interview.model;

public class BerlinClock {

	private Lamp secondsLamp;
	private LampRow fiveHoursLampRow;
	private LampRow oneHourLampRow;
	private LampRow fiveMinutesLampRow;
	private LampRow oneMinuteLampRow;

	public BerlinClock() {
		secondsLamp = new Lamp(Colour.YELLOW);
		secondsLamp.turnOn();

		fiveHoursLampRow = new LampRow(4, Colour.RED);
		oneHourLampRow = new LampRow(4, Colour.RED);
		fiveMinutesLampRow = new LampRow(11, Colour.YELLOW);
		fiveMinutesLampRow.changeColour(Colour.RED, 3, 6, 9);
		oneMinuteLampRow = new LampRow(4, Colour.YELLOW);
	}



	public BerlinClock setSeconds(int seconds) {
		if (seconds % 2 == 0) {
			secondsLamp.turnOn();
		} else {
			secondsLamp.turnOff();
		}

		return this;
	}

	public BerlinClock setHours(int hours) {
		int fiveHours = hours / 5;
		int rest = hours % 5;

		fiveHoursLampRow.turnOn(fiveHours);
		oneHourLampRow.turnOn(rest);

		return this;
	}

	public BerlinClock setMinutes(int minutes) {
		int fiveMinutes = minutes / 5;
		int rest = minutes % 5;

		fiveMinutesLampRow.turnOn(fiveMinutes);
		oneMinuteLampRow.turnOn(rest);

		return this;
	}

	public Lamp getSecondsLamp() {
		return secondsLamp;
	}

	public LampRow getFiveHoursLampRow() {
		return fiveHoursLampRow;
	}

	public LampRow getOneHourLampRow() {
		return oneHourLampRow;
	}

	public LampRow getFiveMinutesLampRow() {
		return fiveMinutesLampRow;
	}

	public LampRow getOneMinuteLampRow() {
		return oneMinuteLampRow;
	}

	@Override
	public String toString() {
		return getSecondsLamp().toString() + "\n" +
				getFiveHoursLampRow().toString() + "\n"+
				getOneHourLampRow().toString()+  "\n"+
				getFiveMinutesLampRow().toString() + "\n"+
				getOneMinuteLampRow().toString();
	}
}

