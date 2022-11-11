
public class TV {
	int channel;
	int volumeLevel;
	boolean isOn;
	
	public TV() {
		channel = 1;
		volumeLevel = 5;
		isOn = false;
	}
	
	public TV(int ch) {
		isOn = true;
		volumeLevel = 5;
		channel = ch;
	}
	
	public void turnOn() {
		isOn = true;
	}
	
	public void turnOff() {
		isOn = false;
	}
	
	public void setChannel(int ch) {
		if (isOn && ch > 1 && ch < 850)
			channel = ch;
	}
	
	public void channelUp() {
		if (isOn && channel < 850)
			channel++;
	}
	
	public void channelDown() {
		if (isOn && channel > 1)
			channel--;
	}
}
