package onlinetest1;

import java.util.ArrayList;

public class BallotUnit {

	int total;
	BallotPaperScreen bps ;
	
	ArrayList <CandidateButton> cb = new ArrayList<CandidateButton>();
	ArrayList <CandidateLamp> cl = new ArrayList<CandidateLamp>();
	
	/*BallotUnit(int no_of_candidates){
		total=no_of_candidates;
		bps = new BallotPaperScreen(no_of_candidates);
		for(int i=0 ; i<no_of_candidates ; i++){
			CandidateButton b = new CandidateButton(i);
			cb.add(b);
			CandidateLamp l = new CandidateLamp();
			cl.add(l);
		}
	}*/

	public BallotUnit(ArrayList<Candidate> c) {
		total=c.size();
		bps = new BallotPaperScreen(c);
		for(int i=0 ; i<c.size() ; i++){
			CandidateButton b = new CandidateButton(i);
			cb.add(b);
			CandidateLamp l = new CandidateLamp();
			cl.add(l);
		}
	}

	public void castVote(int candidate) {
		for(int i=0 ; i<total ; i++){
			if(cb.get(i).getBID()==candidate){
				cl.get(i).glowLamp();
				bps.incrementVoteCount(i,total);
				System.out.println("Vote recorded successfully");
			}
		}
	}
}
