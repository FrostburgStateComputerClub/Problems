import java.util.Scanner;

public class Mazes {
	
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		
		String hold = "";
		int distance = 0;
		
		while (scan.hasNextLine()){
			hold = scan.nextLine();
			char[] g = hold.toCharArray();
			for ( int i = 0; i < g.length; i++){
				//Check for number
				if (Character.getNumericValue(g[i]) > 0 && Character.getNumericValue(g[i]) <= 9){
					distance += Character.getNumericValue(g[i]);
				}
				//else we have a letter
				else{
					switch(g[i]){
						case 'b':
							for(int k = 0; k < distance; k++){
								System.out.print(" ");
							}
							distance = 0;
							break;
						case '!':
							System.out.println("");
							distance = 0;
							break;
						default:
							for (int k = 0; k < distance; k++){
								System.out.print(g[i]);
								
							}
							distance = 0;
							break;
					}
				}
				
				
			}
		}
		
	}
}
