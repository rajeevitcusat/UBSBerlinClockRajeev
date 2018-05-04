package com.ubs.interview.test;

import org.junit.Test;

import com.ubs.interview.model.Colour;
import com.ubs.interview.model.LampRow;
import static org.junit.Assert.assertEquals;
public class LampRowTest {


	@Test
	public void testNoLamps() {
		final LampRow LampRow = new LampRow(4, Colour.YELLOW);

		assertEquals("OOOO", LampRow.toString());
	}

	@Test
	public void testThreeYellowLamps() {
		final LampRow LampRow = new LampRow(4, Colour.YELLOW);
		LampRow.turnOn(3);

		assertEquals("YYYO", LampRow.toString());
	}

	@Test
	public void testThreeRedLamps() {
		final LampRow LampRow = new LampRow(4, Colour.RED);
		LampRow.turnOn(3);

		assertEquals("RRRO", LampRow.toString());
	}

	@Test
	public void testLampOverflow() {
		final LampRow LampRow = new LampRow(4, Colour.YELLOW);
		LampRow.turnOn(4);

		assertEquals("YYYY", LampRow.toString());

		LampRow.turnOn(1);

		assertEquals("YOOO", LampRow.toString());
	}

	@Test
	public void testChangeColour() {
		final LampRow LampRow = new LampRow(4, Colour.YELLOW);
		LampRow.turnOn(3);
		LampRow.changeColour(Colour.RED, 1,2);

		assertEquals("RRYO", LampRow.toString());
	}

}
