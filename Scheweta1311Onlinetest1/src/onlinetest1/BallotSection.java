package onlinetest1;

import java.util.ArrayList;

public class BallotSection {

	BallotButton bb = new BallotButton();
	TotalButton tb = new TotalButton();
	
	/*ArrayList <TotalButton> tb = new ArrayList<TotalButton>();
	
	BallotSection(int total){
		for(int i=0;i<total;i++){
			TotalButton t = new TotalButton();
			tb.add(t);
		}
	}
*/
	public int getCount(Candidate c) {
		// TODO Auto-generated method stub
		return tb.requestCount(c);
	}
	
	
}
