import java.util.Scanner;

public class My_Program {
    public static void main(String[] args) {
        Scanner textString1 = new Scanner(System.in);
        System.out.println("(Exercise_1) Введіть слово:");
        String userPhrase1 = textString1.next();
        System.out.println("Закінчується на ed?:");
        System.out.println(Ed_Finder.isEd(userPhrase1) );


        Scanner textString2 = new Scanner(System.in);
        System.out.println("(Exercise_2) Введіть фразу:");
        String userPhrase2 = textString2.nextLine();
        System.out.println("Ваша фраза: " + userPhrase2);

        System.out.println("Цифрова сума: " + Sum_Of_Number.GetSumOfNumbers(userPhrase2) );

        System.out.println("(Exercise_3) Введіть строку:");
        String userPhrase3 = new Scanner(System.in).nextLine();
        System.out.println("Довжина блоку: " + Biggest_Block.find_BiggestBlock(userPhrase3));

        System.out.println("(Exercise_4) Введіть слова:");
        Word_Finder.findWords(new Scanner(System.in).nextLine() );

        System.out.println("(Exercise_5) Введіть першу строку:");
        String userPhrase5 = new Scanner(System.in).nextLine();
        System.out.println("(Exercise_5) Введіть другу строку:");
        String userPhrase6 = new Scanner(System.in).nextLine();

        System.out.println("Результат:");
        System.out.println(Sym_Of_Strings.getMixOfTwoStrings(userPhrase5, userPhrase6));
    }
}
