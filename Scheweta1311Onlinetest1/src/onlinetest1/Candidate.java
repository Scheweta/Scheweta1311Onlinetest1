package onlinetest1;

public class Candidate {

	String name,symbol;
	int id;
	
	public Candidate(int i) {
		id = i;
	}

	public String getName(){
		return name;
	}
	
	public String getSymbol(){
		return symbol;
	}
	
	public int getID(){
		return id;
	}
	
	public void setName(String nm){
		name=nm;
	}
	
	public void setSymbol(String s){
		symbol=s;
	}
	
	public void setID(int id){
		this.id = id;
	}
}
