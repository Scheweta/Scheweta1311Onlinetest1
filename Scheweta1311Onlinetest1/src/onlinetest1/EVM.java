package onlinetest1;

public class EVM {

	BallotUnit bu ;
	ControlUnit cu = new ControlUnit();
	
	EVM(int no_of_candidates){
		bu = new BallotUnit(no_of_candidates);
	}
}
