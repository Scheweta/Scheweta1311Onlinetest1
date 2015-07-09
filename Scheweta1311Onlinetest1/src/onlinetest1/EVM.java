package onlinetest1;

import java.util.ArrayList;

public class EVM {

	BallotUnit bu ;
	Cable connectionCable = new Cable();
	ControlUnit cu;
	ArrayList <Candidate> c = new ArrayList <Candidate>();
	int total;
	EVM(int no_of_candidates){
		total=no_of_candidates;
		cu = new ControlUnit();
		for(int i=0 ; i<no_of_candidates ; i++){
			Candidate cd = new Candidate(i);
			c.add(cd);
		}
		bu = new BallotUnit(c);
	}
	
	public void requestVote(int candidate){
		if(cu.permitVote()){
			bu.castVote(candidate);
		}
	}
	
	public void getCandidateCount(int candidate){
		for(int i=0 ; i<total ; i++){
			if(c.get(i).getID()==candidate){
				cu.getCount(c.get(i));
			}
		}
	}
}
