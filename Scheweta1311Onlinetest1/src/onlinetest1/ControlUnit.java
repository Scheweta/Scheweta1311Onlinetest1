package onlinetest1;

public class ControlUnit {

	DisplaySection ds = new DisplaySection();
	CandidateSetSection css = new CandidateSetSection();
	BallotSection bs = new BallotSection() ;
	ResultSection rs = new ResultSection();
	
	
	
	public boolean permitVote(){
		bs.pressBallotButton();
		return true;
	}

	public void getCount(Candidate c) {
		
		ds.displayCount(bs.getCount(c),c.getID());
		
	}

	
}
