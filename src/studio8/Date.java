package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
	private int month;
	private int day;
	private int year;
	private boolean holiday;
	
	/**
	 * date constructor
	 * 
	 */
	public Date(int month, int day, int year, boolean holiday) {
		this.month = month;
		this.day = day;
		this.year = year;
		this.holiday = holiday;
	}

	public String toString() {
		return month + "/" + day + "/" + year;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}


    public static void main(String[] args) {
    	Date sophiasBDay = new Date(1, 10, 2003, true);
    	System.out.println(sophiasBDay.toString());
    	Date ameliasBDay = new Date(11, 2, 2002, true);
    	System.out.println(sophiasBDay.equals(ameliasBDay));
    	Date jovankasBDay = new Date(10, 21, 2002, true);
    	Date aprilFools = new Date(4, 1, 1985, true);
    	Date theBite = new Date(11, 14, 1987, true);
    	Date other = new Date(4, 1, 1985, true);
    	
    	LinkedList<Date> list = new LinkedList<Date>();
    	list.add(0, sophiasBDay);
    	list.add(1, ameliasBDay);
    	list.add(2, jovankasBDay);
    	list.add(3, aprilFools);
    	list.add(4, theBite);
    	list.add(5, other);
    	list.add(aprilFools);
    	System.out.println(list);
    	
    	HashSet<Date> set = new HashSet<Date>();
    	set.add(aprilFools);
    	set.add(other);
    	set.add(aprilFools);
    	System.out.println(set);

    }

}
