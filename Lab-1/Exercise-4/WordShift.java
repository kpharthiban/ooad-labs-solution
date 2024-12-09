import java.util.*;

public class WordShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word_input = input.next();

        String cap_input = String.format("%S", word_input);

        char [] word_list = cap_input.toCharArray();
        
        for (int i = 0; i < word_list.length; i++) {
            for (char word : word_list) {
                System.out.print(word);
            }
            System.out.println();
            char beginning_letter = word_list[0];
            char [] new_word_list = new char[word_list.length];
            for (int j = 0; j < word_list.length; j++) {
                if (j == word_list.length - 1) {
                    new_word_list[j] = beginning_letter;
                }
                else {
                    new_word_list[j] = word_list[j + 1];
                }
            }
            word_list = new_word_list;
        }
    }
}
