//Реализуйте метод, который принимает на вход строку и выводит в консоль
// найденные слова в этой строке (слова отделяются пробелами,
// кроме случаев когда слово стоит в начале или в конце).
public class Word_Finder {
    public static void findWords(String string) {
        String[] words = string.split(" ");
        System.out.println("Знайдені слова:");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
