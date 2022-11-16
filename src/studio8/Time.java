package studio8;

import java.util.Objects;

public class Time {
	private int hour;
	private int minute;
	private boolean format;
	

	/**
	 * time constructor
	 * 
	 */
	public Time(int hour, int minute, boolean format) {
		this.hour = hour;
		this.minute = minute;
		this.format = format;
	}
	
	public String toString() {
		if (format) {
			if (hour>12) {
				hour -= 12;
			}
			return hour + ":" + minute;
		}
		else {
			return hour + ":" + minute;
		}
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}

	public static void main(String[] args) {
		Time ameliasFav = new Time(14, 38, true);
		System.out.println(ameliasFav.toString());
		Time jovankasFav = new Time(0, 0, false);
		System.out.println(ameliasFav.equals(jovankasFav));
		
 
    	
    }

	

}