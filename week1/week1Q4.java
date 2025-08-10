import java.util.*;
public class week1Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();
        String[] words = sentence.split("\\s+");
        for (String word : words) {
            System.out.println(word);
        }
    }
}