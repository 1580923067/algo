package leetcode.all;

import java.util.ArrayList;
import java.util.List;

public class problem412_fizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        for (int num = 1; num <= n; num++) {
            boolean divisibleBy3 = (num % 3 == 0);
            boolean divisibleBy5 = (num % 5 == 0);

            if (divisibleBy3 && divisibleBy5) {
                ans.add("FizzBuzz");
            } else if (divisibleBy3) {
                ans.add("Fizz");
            } else if (divisibleBy5) {
                ans.add("Buzz");
            } else {
                ans.add(Integer.toString(num));
            }
        }

        return ans;
    }

    public List<String> fizzBuzz2(int n) {
        List<String> ans = new ArrayList<>();
        for (int num = 1; num <= n; num++) {
            boolean divisibleBy3 = (num % 3 == 0);
            boolean divisibleBy5 = (num % 5 == 0);

            String numAnsAtr = "";

            if (divisibleBy3) {
                numAnsAtr += "Fizz";
            }
            if (divisibleBy5) {
                numAnsAtr += "Buzz";
            }
            if (numAnsAtr.equals("")) {
                numAnsAtr += Integer.toString(num);
            }

            ans.add(numAnsAtr);
        }
        return ans;
    }
}
