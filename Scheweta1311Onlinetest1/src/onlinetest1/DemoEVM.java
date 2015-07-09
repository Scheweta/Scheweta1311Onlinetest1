package onlinetest1;

public class DemoEVM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EVM e = new EVM(7);
		e.requestVote(1);
		e.requestVote(1);
		e.requestVote(1);
		e.requestVote(3);
		e.getCandidateCount(1);
		e.getCandidateCount(2);
		e.getCandidateCount(3);
	}

}
