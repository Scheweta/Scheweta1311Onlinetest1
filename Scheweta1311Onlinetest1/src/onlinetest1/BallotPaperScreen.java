package onlinetest1;

import java.util.ArrayList;

public class BallotPaperScreen {

	ArrayList <Candidate> clist = new ArrayList<Candidate>();
	
	public BallotPaperScreen(ArrayList<Candidate> c2) {
		clist=c2;
   }

	public void incrementVoteCount(int id,int total) {
		for(int i=0 ; i<total ; i++){
			if(clist.get(i).getID()==id){
				clist.get(i).incrCount();
			}
		}
	}
}
