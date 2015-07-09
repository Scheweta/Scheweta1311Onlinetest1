package onlinetest1;

import java.util.ArrayList;

public class BallotPaperScreen {

	ArrayList <Candidate> clist = new ArrayList<Candidate>();
	
	public BallotPaperScreen(int no_of_candidates) {
		for(int i=0 ; i<no_of_candidates ; i++){
			Candidate c = new Candidate(i);
			clist.add(c);
		
	}

	}
}
