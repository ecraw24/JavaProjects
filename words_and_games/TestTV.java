
public class TestTV {

	public static void main(String[] args) {
		TV tv1 = new TV();
		tv1.turnOn();
		System.out.println("channel = " + tv1.channel);
		tv1.channelUp();
		System.out.println("channel = " + tv1.channel);
		tv1.setChannel(30);
		System.out.println("channel = " + tv1.channel);
		tv1.setChannel(3000);
		System.out.println("channel = " + tv1.channel);
		tv1.turnOff();
		System.out.println("channel = " + tv1.channel);
		tv1.channelDown();
		System.out.println("channel = " + tv1.channel);
		
	}

}
