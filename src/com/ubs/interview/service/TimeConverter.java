package com.ubs.interview.service;

import com.ubs.interview.model.BerlinClock;
import com.ubs.interview.model.Time;

public interface TimeConverter {

	BerlinClock convertTimeToBerlinClock(String timeStr);
	
}
