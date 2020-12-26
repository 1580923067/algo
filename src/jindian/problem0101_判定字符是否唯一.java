package jindian;

public class problem0101_判定字符是否唯一 {
    public boolean kisUnique(String astr) {
        long bits = 0;
        int size = astr.length();
        for (int i = 0; i < size; i++) {
            int move = astr.charAt(i) - 'A';
            if ((bits & (1 << move)) != 0) {
                return false;
            } else {
                bits |= (1 << move);
            }
        }
        return true;
    }
}
