import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String word = "javalove";
        String maskWord = "-".repeat(word.length());
        char[] chr_word = word.toCharArray();
        char[] chr_maskWord = maskWord.toCharArray();
        char letter;

        System.out.println("Guess the word");
        System.out.println(maskWord);

        do {
            System.out.println("Enter your letter");
            letter = console.next().charAt(0);
            System.out.println("Your letter are " + letter);
            for(int i=0; i < word.length(); i++){
                if(letter==chr_word[i]){
                    chr_maskWord[i]=letter;
                }
            }
            maskWord=new String(chr_maskWord);
             System.out.println(maskWord);
        }while (!word.equals(maskWord));
        console.close();
    }
}