//Реализуйте метод, который принимает на вход две строки (А и Б) и возвращает строку,
// которая состоит поочередно из  i-ых символов каждой из строк.
// Например, сначала первый символ первой строки, потом первый символ второй строки,
// потом второй символ первой строки, потом второй символ второй строки и т.д.
// Если символы в одной из строк закончатся, оставшиеся символы другой строки дописываются в конец.
public class Sym_Of_Strings {
    public static String getMixOfTwoStrings(String first, String second) {
        String shorter = first;
        boolean isLongerSecond = true;
        if (first.length() > second.length()) {
            shorter = second;
            isLongerSecond = false;
        }
        StringBuilder builder = new StringBuilder();
        int i;
        for (i = 0; i < shorter.length(); i++) {
            builder.append(first.charAt(i)).append(second.charAt(i));
        }
        if (isLongerSecond)
            builder.append(second.substring(i));
        else builder.append(first.substring(i));
        return builder.toString();
    }

}
