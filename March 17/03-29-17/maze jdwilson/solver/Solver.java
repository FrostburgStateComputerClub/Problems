package solver;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Program that solves the programs
 * @author jdwilson
 *
 */
public class Solver {
	
	/**
	 * Runs the maze generator
	 * @throws IOException 
	 */
	public void run() throws IOException{
		//read input line by line from a file
		BufferedReader br = new BufferedReader(new FileReader("maze.txt"));
		String line;
			while((line = br.readLine()) != (null)){
				System.out.print("\n");
				if(line.isEmpty()){
					//move onto next maze
					System.out.print("\n");
				}
				//need to split this up based on every char
				String[] lineArray = line.split("");
				//loop over and check our cases
				int numToPrint = 0;
				for(int x = 0; x < lineArray.length; ++x){
					if(lineArray[x].matches("[0-9]")){//its a number
						numToPrint += Integer.parseInt(lineArray[x]);
					}else{//its a letter
						switch(lineArray[x]){
							case "b":
								for(int i = 0; i < numToPrint; ++i){
									System.out.print(" ");
								}
								numToPrint = 0;
								break;
							case "!":
								//shouldn't ever have a number in front of it
									System.out.print("\n");
									break;
							default:
								for(int i = 0; i < numToPrint; ++i){
									System.out.print(lineArray[x]);
								}
								numToPrint = 0;
								break;
							
						}
					}
				}
		}
	}
	
	

}
