import java.util.Scanner;

public class wordGuess {
	
static String[] words = {"computer", "automobile", "university", "perscription", "california", "declaration", "windows"};

public static void main(String[] args)
{
	int x = words.length;
	int miss = 0,count = 0;
	Scanner input = new Scanner(System.in);
	boolean game = true;
	
	do{
	int r = (int) (Math.random() * (x+1));
	System.out.println("(Guess) Enter a letter in the word ");
	while(count < words[r].length()){
		System.out.print('*');
		count++;
	}
	
	String s = input.nextLine();
	char ch = s.charAt(0);
//	char ch = input.nextInLine(".").charAt(0);
	if(ch == '#')
		System.exit(0);
	if(!Character.isLetter(ch) && ch != '#'){
		System.err.println("Please enter alphabetic characters only!\n");
		s = input.nextLine();
		ch = s.charAt(0);
	}
	if(Character.isUpperCase(ch))
		ch = Character.toLowerCase(ch);
	String str = words[r];
	char[] cpy = str.toCharArray();
	
	for(int i =0; i < str.length();i++){
	if(ch == cpy[i]){
		
	for(int j =0; j < str.length();j++)
	if(cpy[j] != ch){
		cpy[i] = '*';
	}
	
	}
	
System.out.println("The word is: " + words[r] + ". You missed " + miss + " times.");
System.out.println("Do you want to guess another word? Enter y or n>");
s = input.nextLine();
ch = s.charAt(0);
if (ch == 'n' || ch == 'N')
	game = false;
}while(game);	

}
} 