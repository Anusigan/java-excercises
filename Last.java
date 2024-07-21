import java.util.Scanner;
public class Last {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word: ");
        String word=sc.nextLine();
        char letter=word.charAt(word.length()-1);
        System.out.println(letter);
        sc.close();
    }
    
}
