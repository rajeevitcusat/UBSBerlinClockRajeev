package com.ubs.interview.test;

import static org.junit.Assert.assertEquals;
import junit.framework.Assert;

import org.junit.Test;

import com.ubs.interview.model.BerlinClock;
import com.ubs.interview.model.Colour;

public class BerlinClockTest {
	 @Test
	     public void testCreateBerlinClockWithDefaultValues(){
	         BerlinClock berlinClock = new BerlinClock();
	         Assert.assertTrue(berlinClock.getSecondsLamp().isOn());
	         Assert.assertTrue(berlinClock.getSecondsLamp().getColour() == Colour.YELLOW);
	         Assert.assertTrue(berlinClock.getFiveHoursLampRow().getLamps().size() == 4);
	         Assert.assertTrue(berlinClock.getOneHourLampRow().getLamps().size() == 4);
	         Assert.assertTrue(berlinClock.getFiveMinutesLampRow().getLamps().size() == 11);
	         Assert.assertTrue(berlinClock.getOneMinuteLampRow().getLamps().size() == 4);
	     }
	 
	 
	     @Test
	     public void testSecondsLampBeOnForEvenSeconds() {
	         BerlinClock berlinClock = new BerlinClock();
	         berlinClock.setSeconds(2);
	         assertEquals("Y", berlinClock.getSecondsLamp().toString());
	     }
	 
	     @Test
	     public void testSecondsLampBeOffForOddSeconds() {
	         BerlinClock berlinClock = new BerlinClock();
	         berlinClock.setSeconds(33);
	         assertEquals("O", berlinClock.getSecondsLamp().toString());
	     }
	 
	     @Test
	     public void testFiveHoursRowDisplayCorrectlyForGivenHours() {
	         BerlinClock berlinClock = new BerlinClock();
	         berlinClock.setHours(15);
	 
	         assertEquals("RRRO", berlinClock.getFiveHoursLampRow().toString());
	     }
	 
	     @Test
	     public void testOneHoursRowDisplayCorrectlyForGivenHours() {
	         BerlinClock berlinClock = new BerlinClock();
	         berlinClock.setHours(2);
	 
	         assertEquals("RROO", berlinClock.getOneHourLampRow().toString());
	     }
	 
	     @Test
	     public void testFiveMinutesRowDisplayCorrectlyForGivenMinutes() {
	         BerlinClock berlinClock = new BerlinClock();
	         berlinClock.setMinutes(20);
	 
	         assertEquals("YYRYOOOOOOO", berlinClock.getFiveMinutesLampRow().toString());
	     }
	 
	     @Test
	     public void testOneMinutesRowDisplayCorrectlyForGivenMinutes() {
	         BerlinClock berlinClock = new BerlinClock();
	         berlinClock.setMinutes(2);
	 
	         assertEquals("YYOO", berlinClock.getOneMinuteLampRow().toString());
	     }
	 
	     @Test
	     public void testThreeOclock() {
	         BerlinClock berlinClock = new BerlinClock();
	         berlinClock.setHours(3);
	 
	         assertEquals("RRRO", berlinClock.getOneHourLampRow().toString());
	     }
	     @Test
	     public void testElevenOclock() {
	         BerlinClock berlinClock = new BerlinClock();
	         berlinClock.setHours(11);
	 
	         assertEquals("RROO", berlinClock.getFiveHoursLampRow().toString());
	         assertEquals("ROOO", berlinClock.getOneHourLampRow().toString());
	     }
	 
	     @Test
	     public void testAQuarterPastNine() {
	         BerlinClock berlinClock = new BerlinClock();
	         berlinClock.setHours(9).setMinutes(15);
	 
	         assertEquals("ROOO", berlinClock.getFiveHoursLampRow().toString());
	         assertEquals("RRRR", berlinClock.getOneHourLampRow().toString());
	         assertEquals("YYROOOOOOOO", berlinClock.getFiveMinutesLampRow().toString());
	     }
	 }
