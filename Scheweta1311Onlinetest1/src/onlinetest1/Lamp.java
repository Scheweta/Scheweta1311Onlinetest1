package onlinetest1;

public abstract class Lamp {

   // int lid;
	String status; //on or off
	
	
/*	public int getLID(){
		return lid;
	}*/
	
	public String getStatus(){
		return status;
	}
	
	public void setStatus(String s){
		status = s;
	}
	
	public  abstract void handleLamp(LampContext c);
}
