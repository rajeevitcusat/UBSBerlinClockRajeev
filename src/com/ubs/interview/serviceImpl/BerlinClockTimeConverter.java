package com.ubs.interview.serviceImpl;

import com.ubs.interview.model.BerlinClock;
import com.ubs.interview.model.Time;
import com.ubs.interview.model.TimeParser;
import com.ubs.interview.service.TimeConverter;

public class BerlinClockTimeConverter implements TimeConverter{
	 @Override
	     public BerlinClock convertTimeToBerlinClock(String timeStr) {
	         Time time = TimeParser.parse(timeStr);
	         BerlinClock berlinClock = new BerlinClock();
	         berlinClock.setHours(time.getHour()).setMinutes(time.getMinutes()).setSeconds(time.getSeconds());
	         return berlinClock;
	     }

}
