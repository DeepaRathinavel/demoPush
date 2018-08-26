package week2day1;

public class Samsung implements TV {

	@Override
	public void changeChannel(int channelNumber) {
		System.out.println("Channel Changed to "+channelNumber);
		
	}

	@Override
	public void changeChannel(String channelName) {
		System.out.println("Channel Changed to "+channelName);
		
	}

	@Override
	public void childMode() {
		// TODO Auto-generated method stub
		
	}

}
