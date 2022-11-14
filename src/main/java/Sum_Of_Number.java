//Реализуйте метод, который принимает на вход строку и возвращает сумму цифр,
// которые были найдены в этой строке (если цифр нет – возвращается 0);
public class Sum_Of_Number {
    public static int GetSumOfNumbers(String string) {
        int sum = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) <= '9' && string.charAt(i) >= '0') {
                sum += string.charAt(i) - 48;
            }
        }
        return sum;
    }
}
