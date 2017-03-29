import java.util.*;

public class HelloWorld{

     public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        
        String s = scan.nextLine();
        
        String[] stringArr = s.split("");
        
        char[] charArr = s.toCharArray();
        
        int numChars = 0;
        
        for (int i = 0; i < stringArr.length; i++){
            if (charArr[i] == '!'){
                System.out.println();
                numChars = 0;
            }
            if (Character.isDigit(charArr[i])){
                numChars += Integer.parseInt("" + charArr[i]);
            }
            else if (charArr[i] == 'b'){
                for (int j = 0; j < numChars; j++){
                    System.out.print(" ");
                }
                numChars = 0;
            }
            else{
                for (int j = 0; j < numChars; j++){
                    System.out.print(charArr[i]);
                }
                numChars = 0;
            }
        }
     }
}
