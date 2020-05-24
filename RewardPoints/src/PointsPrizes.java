//the class that makes up the prizes for the points

public class PointsPrizes {

private int pointsReq;				//the points required to get the prize
private String prize;				//the name of the prize
private int value;					//the monetary value of the prize


//default constructor
public PointsPrizes (int points, String prz, int val) {
	
	 pointsReq = points;
	 
	 prize = prz;
	 
	 value = val;
	
    }
	
public int getPoints() {
	
	return this.pointsReq;
	
}	
	
public String getPrize(){
	
	return this.prize;
}	
	
public int getValue(){
	
	return this.value;
}
	
}
