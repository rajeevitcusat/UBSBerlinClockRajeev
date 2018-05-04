package com.ubs.interview.test;

import junit.framework.Assert;

import org.junit.Test;

import com.ubs.interview.model.BerlinClock;
import com.ubs.interview.service.TimeConverter;
import com.ubs.interview.serviceImpl.BerlinClockTimeConverter;

public class BerlinClockTimeConverterTest {
	@Test
	public void testMidNight(){
		TimeConverter berlinClockTimeConverter = new BerlinClockTimeConverter();
		BerlinClock berlinClock =berlinClockTimeConverter.convertTimeToBerlinClock("00:00:00");
		Assert.assertEquals("Y\nOOOO\nOOOO\nOOOOOOOOOOO\nOOOO", berlinClock.toString());
	}

	@Test
	public void testMiddleOfAfternoon(){
		TimeConverter berlinClockTimeConverter = new BerlinClockTimeConverter();
		BerlinClock berlinClock = berlinClockTimeConverter.convertTimeToBerlinClock("13:17:01");
		Assert.assertEquals("O\nRROO\nRRRO\nYYROOOOOOOO\nYYOO", berlinClock.toString());
	}

	@Test
	public void testJustBeforeMidnight(){
		TimeConverter berlinClockTimeConverter = new BerlinClockTimeConverter();
		BerlinClock berlinClock = berlinClockTimeConverter.convertTimeToBerlinClock("23:59:59");
		Assert.assertEquals("O\nRRRR\nRRRO\nYYRYYRYYRYY\nYYYY", berlinClock.toString());
	}

	@Test
	public void testMidNightWith24Hour(){
		TimeConverter berlinClockTimeConverter = new BerlinClockTimeConverter();
		BerlinClock berlinClock = berlinClockTimeConverter.convertTimeToBerlinClock("24:00:00");
		Assert.assertEquals("Y\nRRRR\nRRRR\nOOOOOOOOOOO\nOOOO", berlinClock.toString());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidTimeWithNull(){
		TimeConverter berlinClockTimeConverter = new BerlinClockTimeConverter();
		berlinClockTimeConverter.convertTimeToBerlinClock(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidTimeWithEmptyString(){
		TimeConverter berlinClockTimeConverter = new BerlinClockTimeConverter();
		berlinClockTimeConverter.convertTimeToBerlinClock("");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidTimeWithWrongFormat(){
		TimeConverter berlinClockTimeConverter = new BerlinClockTimeConverter();
		berlinClockTimeConverter.convertTimeToBerlinClock("wrongtime");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidHours(){
		TimeConverter berlinClockTimeConverter = new BerlinClockTimeConverter();
		berlinClockTimeConverter.convertTimeToBerlinClock("27:16:00");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidMinutes(){
		TimeConverter berlinClockTimeConverter = new BerlinClockTimeConverter();
		berlinClockTimeConverter.convertTimeToBerlinClock("23:75:00");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testInvalidSeconds(){
		TimeConverter berlinClockTimeConverter = new BerlinClockTimeConverter();
		berlinClockTimeConverter.convertTimeToBerlinClock("23:45:70");
	}
}

