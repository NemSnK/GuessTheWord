import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String word = "javalove";
        StringBuilder maskWord = new StringBuilder("-".repeat(word.length()));
        char letter;

        System.out.println("Guess the word");
        System.out.println(maskWord);
        do {

            System.out.println("Enter your letter");
            letter = console.next().charAt(0);
            System.out.println("Your letter are " + letter);

            for(int i=0; i < word.length(); i++){
                int index = word.indexOf(letter, i);
                if(index == -1){
                    if(i == 0){
                        System.out.println("no such letter in this word");
                        break;
                    }
                    System.out.println("there is such a letter");
                    System.out.println(maskWord);
                    break;
                }
                maskWord.setCharAt(index, letter);
                if(i == (word.length() - 1 )){
                    System.out.println(maskWord);
                    System.out.println("there is such a letter");
                }
            }

        }while (maskWord.indexOf("-") != -1);
        System.out.println("You win!!!");
        console.close();
    }
}