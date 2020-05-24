
public class PointsRedeemer {

private int remainPoints = 0;

ArrayList<PointsPrizes> prizeList = new ArrayList<PointsPrizes>;				//array list to hold all of the prizes

public void readPrizes(Scanner fileScanner){
	
	String text = null;
	int points;
	string prize = null;
	int monVal;
	
	int prizeCount = 0;															//prize counter 
	
	PointsComparator comparator;												//the comparator to compare the points 
	
	comparator = new PointsComparator();
	
	//read the file and assign values to the variables
	while (fileScanner.hasNextLine)
		{
			text = fileScanner.nextLine();
			
			String [] parsedString = text.split([";-"]);
			
			points = parsedString[];											
			
			prize = parsedString[];
			
			monVal = parsedString[];
			
			prizeList.add(new PointsPrizes(points, prize, monVal));
			
			prizeList.sort(comparator);
			
			prizeCount++;			
		}
	
	}
	
	class PointsComparator implements Comparator<PointsPrizes>{
		public int compare(PointsPrizes p1, PointsPrizes p2){
			return (p2.getPoints() - p1.getPoints());
		}
	}
	
	
}
