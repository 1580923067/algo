package SwordOffer2;

public class problem58_左旋转字符串Ⅱ {
    public String reverseLeftWords(String s, int n) {
        return s.substring(n, s.length()) + s.substring(0, n);
    }
}
