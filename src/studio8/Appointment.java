package studio8;

import java.util.HashSet;
import java.util.Objects;

public class Appointment {
	private Date date;
	private Time time;
	
	public Appointment(Date date, Time time) {
		this.date= date;
		this.time = time;
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}
	
	public String toString() {
		return date.toString() + " " + time.toString();
	}



	public static void main(String[] args) {
		//dates
		Date sophiasBDay = new Date(1, 10, 2003, true);
    	Date ameliasBDay = new Date(11, 2, 2002, true);
    	Date jovankasBDay = new Date(10, 21, 2002, true);
    	Date aprilFools = new Date(4, 1, 1985, true);
    	Date theBite = new Date(11, 14, 1987, true);
    	Date other = new Date(4, 1, 1985, true);
		
		//times
    	Time ameliasFav = new Time(14, 38, true);
		Time jovankasFav = new Time(0, 0, false);

		//appointments
		Appointment a1 = new Appointment(sophiasBDay, ameliasFav);
		Appointment a2 = new Appointment(ameliasBDay, ameliasFav);
		Appointment a3 = new Appointment(jovankasBDay, jovankasFav);
		Appointment a4 = new Appointment(aprilFools, jovankasFav);
		
		HashSet<Appointment> calendar = new HashSet<Appointment>();
		calendar.add(a1);
		calendar.add(a2);
		calendar.add(a3);
		calendar.add(a4);    	
    	System.out.println(calendar);

	}

}
