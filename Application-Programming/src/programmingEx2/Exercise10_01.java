package programmingEx2;
import java.util.Scanner;

public class Exercise10_01 {
	public static void main(String[] args) {
		Time t1 = new Time();
		System.out.println("The hours, minutes, and seconds of t1 are " 
				+ t1.getHour() + ":" + t1.getMinute() + ":" + t1.getSecond());
		Time t2 = new Time(555550000);
		System.out.println("The hours, minutes, and seconds of t2 are " 
				+ t2.getHour() + ":" + t2.getMinute() + ":" + t2.getSecond());
		Time t3 = new Time(5, 23, 55);
		System.out.println("The hours, minutes, and seconds of t3 are " 
				+ t3.getHour() + ":" + t3.getMinute() + ":" + t3.getSecond());
	}
}

class Time {

	private long hour;
	private long remainderH;
	private long minute;
	private long remainderM;
	private long second;
	private long millis;
	private long remainder;
	
	public Time() {
		millis = System.currentTimeMillis();
		remainder = millis % (24 * 60 * 60 * 1000);
		
		hour = remainder / (3600 * 1000);
		remainderH = remainder % (3600 * 1000);
		minute = remainderH / (60 * 1000);
		remainderM = remainder % (60 * 1000);
		second = remainderM / 1000;
	}
	
	public Time(long millis) {
		this.millis = millis;
		remainder = millis % (24 * 60 * 60 * 1000);
		
		hour = remainder / (3600 * 1000);
		remainderH = remainder % (3600 * 1000);
		minute = remainderH / (60 * 1000);
		remainderM = remainder % (60 * 1000);
		second = remainderM / 1000;
	}
	
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public long getHour() {
		return hour;
	}
	
	public long getMinute() {
		return minute;
	}
	
	public long getSecond() {
		return second;
	}
	
	public void setTime(long elapsedTime) {
		millis = elapsedTime;
		remainder = millis % (24 * 60 * 60 * 1000);
		
		hour = remainder / (3600 * 1000);
		remainderH = remainder % (3600 * 1000);
		minute = remainderH / (60 * 1000);
		remainderM = remainder % (60 * 1000);
		second = remainderM / 1000;
	}
}