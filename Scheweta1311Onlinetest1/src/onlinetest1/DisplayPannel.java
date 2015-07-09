package onlinetest1;

public class DisplayPannel {

	DisplayPannel_2digit twodigit = new DisplayPannel_2digit();
	DisplayPannel_4digit fourdigit = new DisplayPannel_4digit();
	public void requestDisplay(int count, int id) {
		twodigit.displayCandidateID(id);
		fourdigit.displayCount(count);
		
	}
	
	
}
