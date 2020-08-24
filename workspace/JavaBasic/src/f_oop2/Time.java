package f_oop2;

public class Time {

	private int hour;
	private int minute;
	private int second;
	
	//private는 접근할수 없어서 get, set으로 접근할수있게 만들어준다.
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
		if(this.hour <= 0){
			this.hour = 0;
		}/*else if(this.hour > 23){
			this.hour = 23;
		}*/
		
		if(this.hour >= 24){
			this.hour  = this.hour % 24;
		}
	}
	
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
		if(this.minute <= 0){
			this.minute = 0;
		}/*else if(this.minute > 59){
			this.minute = 59;
		}*/
		if(minute >= 60 ){
			this.minute  = this.minute % 60;
			setHour(this.hour + minute / 60); 
		}
	}
	
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
		if(this.second <= 0){
			this.second = 0;
		}/*else if(this.second > 59){
			this.second = 59;
		}*/
		
		if(second >= 60 ){
			this.second  = this.second % 60;
			setMinute(this.minute + second / 60); 
		}
	}

	@Override
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}
	
	
}
