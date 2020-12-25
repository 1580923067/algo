package SwordOffer2;

public class problem58_翻转单词的顺序Ⅰ {
    public String reverseWords(String s) {
        String[] strs = s.trim().split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = strs.length - 1; i >= 0; i--) {
            if (strs[i].equals("")) continue;
            res.append(strs[i] + " ");
        }
        return res.toString().trim();
    }

    public String reverseWords2(String s){
        s.trim();
        int j=s.length()-1,i=j;
        StringBuilder res=new StringBuilder();
        while (i>=0){
            while (i>=0&&s.charAt(i)!=' ') i--;
            res.append(s.substring(i+1,j+1)+" ");
            while (i>=0&&s.charAt(i)==' ') i--;
            j=i;
        }
        return res.toString().trim();

    }
}
