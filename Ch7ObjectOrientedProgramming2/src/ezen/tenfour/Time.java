package ezen.tenfour;

public class Time {
	
	private int hour = 0;
	private int minute = 0;
	private int second = 0;
	String setTime = "";
	
	public Time() {
		
	}
	
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public int getHour() {
		return hour;
	}
	
	public void setHour(int hour) {
		if (hour < 0 || hour > 23) {
			return;
		}
		this.hour = hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public void setMinute(int minute) {
		this.minute = minute;
	}
	
	public int getSecond() {
		return second;
	}
	
	public void setSecond(int second) {
		this.second = second;
		
	}
	
	public void timeInfo() {
		System.out.println("시간 표시");
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
	}
	
	

}
