import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**********************************************************************************
 * 
 * @author Marco Martinez
 * 
 * Date : April 15, 2019
 * 
 * Purpose:  To implement the RewardPoints class. Handles user input
 *
 *********************************************************************************/

public class RewardPoints {

	public static void main(String[] args) {

		//providing args to the program maybe
		if (args.length > 0 && args.length < 2)
		{
			File file = new File(args[0]); 
		
		
			try
			{
				//read the file to provide the names of the prizes
				Scanner sc = new Scanner(file);
			
				PointsRedeemer redeemer = new PointsRedeemer(); 
				
				redeemer.readPoints(sc);
				
				String [] array = new String [redeemer.prizeCount];
				
				array = redeemer.getPrize();

					
			}
		}
	}

}
