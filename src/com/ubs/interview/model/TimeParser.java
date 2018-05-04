package com.ubs.interview.model;

import java.util.regex.Pattern;

public class TimeParser {
	/**
	 * Parses given string as a {@link Time}.
	 * @param aTime time string in HH:mm:ss format
	 */
	public static Time parse(String time){
		if(time == null)
		{
			throw new IllegalArgumentException("Time cannot be Empty or null")  ; 
		}
		if(Pattern.matches("\\d\\d:\\d\\d:\\d\\d",time))
		{
			String[] parts = time.split(":");
			int hour = Integer.valueOf(parts[0]);
			int minutes = Integer.valueOf(parts[1]);
			int seconds = Integer.valueOf(parts[2]);
			return new Time(hour, minutes, seconds);
		}
		else{
			throw new IllegalArgumentException("Time should be in HH:mm:ss format")  ; 
		}

	}

}
