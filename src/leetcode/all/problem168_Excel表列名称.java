package leetcode.all;

public class problem168_Excel表列名称 {
    public String convertToTitle(int columnNumber) {
        StringBuffer sb = new StringBuffer();
        while (columnNumber != 0) {
            columnNumber--;
            sb.append(columnNumber % 26 + 'A');
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }
}
