package onlinetest1;

public class DisplaySection {

	LampON on = new LampON();
	LampBusy busy = new LampBusy();
	DisplayPannel dp = new DisplayPannel();
	public void displayCount(int count,int id) {
		dp.requestDisplay(count,id);
	}
}
