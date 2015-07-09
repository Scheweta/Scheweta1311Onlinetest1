package onlinetest1;

public class BallotButton extends Button{

	public BallotButton() {
		super(0);
		// TODO Auto-generated constructor stub
	}
	
	public void pressBallotButton(){
		this.status="press";
	}
	
	public void releaseBallotButton(){
		this.status="release";
	}

}
