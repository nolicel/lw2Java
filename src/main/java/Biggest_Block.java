//Реализуйте метод, который принимает на вход строку и возвращает длину наиболее длинного «блока»
// символов в этой строке («блок» - множество одинаковых идущих подряд символов,
// например, в строке «aaBCS» - самый длинный блок «аа» длиной 2 символа);
public class Biggest_Block {
    public static int find_BiggestBlock (String string) {
        char c = string.charAt(0);
        int max = 0;
        int len = 1;
        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) == c) len++;
            else {
                c = string.charAt(i);
                len = 1;
            }
            if (len > max) max = len;
        }
        return max;
    }
}
