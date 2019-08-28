import java.util.Scanner;
import java.util.Random;

public class Hangman {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		String[] words =
				{"apple", "banana", "watermelon", "guava", "orange",
				"dog", "cat", "elephant", "tiger", "bird",
				"indonesia", "france", "usa", "china", "japan", "korea"};
				
		boolean weArePlaying = true;
		String type = "";
		
		while(weArePlaying){
			System.out.println("Welcome to the game of Hangman");

			char[] randomWordToGuess = words[random.nextInt(words.length)].toCharArray();
			int amountOfGuesses = randomWordToGuess.length;
			char[] playerGuess = new char[amountOfGuesses];
			
			for(int i=0; i<playerGuess.length; i++){
				playerGuess[i] = '_';
			}
			
			boolean wordIsGuessed = false;
			int tries = 0;
			
			while(!wordIsGuessed && tries != amountOfGuesses){
				System.out.println("\n\nCurrent guesses: ");
				printArray(playerGuess);
				
				if(randomWordToGuess == words[0].toCharArray()){
					type = "Fruit";
				}else if(randomWordToGuess == words[1].toCharArray()){
					type = "Fruit";
				}else if(randomWordToGuess == words[2].toCharArray()){
					type = "Fruit";
				}else if(randomWordToGuess == words[3].toCharArray()){
					type = "Fruit";
				}else if(randomWordToGuess == words[4].toCharArray()){
					type = "Fruit";
				}else if(randomWordToGuess == words[5].toCharArray()){
					type = "Animal";
				}else if(randomWordToGuess == words[6].toCharArray()){
					type = "Animal";
				}else if(randomWordToGuess == words[7].toCharArray()){
					type = "Animal";
				}else if(randomWordToGuess == words[8].toCharArray()){
					type = "Animal";
				}else if(randomWordToGuess == words[9].toCharArray()){
					type = "Animal";
				}else if(randomWordToGuess == words[10].toCharArray()){
					type = "Country";
				}else if(randomWordToGuess == words[11].toCharArray()){
					type = "Country";
				}else if(randomWordToGuess == words[12].toCharArray()){
					type = "Country";
				}else if(randomWordToGuess == words[13].toCharArray()){
					type = "Country";
				}else if(randomWordToGuess == words[14].toCharArray()){
					type = "Country";
				}else if(randomWordToGuess == words[15].toCharArray()){
					type = "Country";
				}
				
				System.out.printf("Hint: %s\n", type);
				System.out.printf("Max = %d", randomWordToGuess.length);
				System.out.println("\nEnter a single character: ");
				char input = sc.nextLine().charAt(0);
				tries++;
				
				if(input == '-'){
					weArePlaying = false;
					wordIsGuessed = true;
				}else{
					for(int i=0; i<randomWordToGuess.length; i++){
						if(randomWordToGuess[i] == input){
							playerGuess[i] = input;
						}
					}
					
					if(isTheWordGuessed(playerGuess)){
						wordIsGuessed = true;
						System.out.println("Correct!\n");
					}
				}
					
			}
			
			if(!wordIsGuessed){
				System.out.println("Game over.\n");
				sc.nextLine();
			}
			
		}
		
		System.out.println("Game over.\n");
	}
	
	public static void printArray(char[] array){
		for(int i=0; i<array.length; i++){
			System.out.printf(array[i] + " ");
			
		}
		System.out.println();
	}

	public static boolean isTheWordGuessed(char[] array){
		for(int i=0; i<array.length; i++){
			if(array[i] == '_'){
				return false;
			}
		}
		return true;
	}

}
