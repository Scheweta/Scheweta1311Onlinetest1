package onlinetest1;

public class Candidate {

	String name,symbol;
	int id;
	int count;
	
	public Candidate(int i) {
		id = i;
		count=0;
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
	
	public int getCount(){
		return count;
	}
	
	public void incrCount(){
		count++;
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
