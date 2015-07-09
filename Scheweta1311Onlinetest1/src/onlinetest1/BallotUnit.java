package onlinetest1;

import java.util.ArrayList;

public class BallotUnit {

	BallotPaperScreen bps ;
	
	ArrayList <CandidateButton> cb = new ArrayList<CandidateButton>();
	ArrayList <CandidateLamp> cl = new ArrayList<CandidateLamp>();
	
	BallotUnit(int no_of_candidates){
		bps = new BallotPaperScreen(no_of_candidates);
		for(int i=0 ; i<no_of_candidates ; i++){
			CandidateButton b = new CandidateButton(i);
			cb.add(b);
			CandidateLamp l = new CandidateLamp();
			cl.add(l);
		}
	}
}
