package com.ubs.interview.model;

public class Time {
	private final int hour;
	private final int minutes;
	private final int seconds;

	public Time(int hour, int minutes, int seconds){
		validateHour(hour);
		this.hour = hour;
		validateMinutesOrSecond(minutes, "minutes");
		this.minutes = minutes;
		validateMinutesOrSecond(seconds, "seconds");
		this.seconds = seconds;
	}

	private void validateHour(int hour) {
		if (hour < 0)
		{
			throw new IllegalArgumentException("Hour should be positive number");
		}
		else if(hour> 24)
		{
			throw new IllegalArgumentException("Hour can not be more than 24");
		}
	}

	private void validateMinutesOrSecond(int minOrSecond, String minutesOrSeconds) {
		if (minOrSecond < 0)
		{
			throw new IllegalArgumentException(minutesOrSeconds +"should be positive number");
		}
		else if(minOrSecond> 59)
		{
			throw new IllegalArgumentException(minutesOrSeconds +" can not be more than 59");
		}
	}

	public int getHour() {
		return hour;
	}

	public int getMinutes() {
		return minutes;
	}

	public int getSeconds() {
		return seconds;
	}
}