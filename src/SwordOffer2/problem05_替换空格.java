/**
 * 将空格替换为%20
 */
package SwordOffer2;

public class problem05_替换空格 {
    public String replaceSpace(StringBuffer str) {
        //input check
        //null pointer
        if (str == null) {
            return null;
        }
        //empty str or not exist blank
        if (str.length() == 0 || str.indexOf(" ") == -1) {
            return str.toString();
        }

        char[] source = str.toString().toCharArray();
        int blankCount = 0;
        for (int i = 0; i < source.length; i++) {
            blankCount = (source[i] == ' ') ? blankCount + 1 : blankCount;
        }
        char[] dest = new char[source.length + blankCount * 2];
        for (int i = source.length - 1, j = dest.length - 1; i >= 0 && j >= 0; i--, j--) {
            if (source[i] == ' ') {
                dest[j--] = '0';
                dest[j--] = '2';
                dest[j] = '%';
                continue;
            } else {
                dest[j] = source[i];
            }
        }

        return new String(dest);
    }

    public String replaceSpace2(String str) {
        StringBuilder res = new StringBuilder();
        for (Character c : str.toCharArray()) {
            if (c == ' ') res.append("%20");
            else res.append(c);
        }
        return res.toString();
    }
}
