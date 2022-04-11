package leetcode.Structure;

import java.util.Arrays;

public class Playground {
    // 字符串转数组
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return new int[0];
        }

        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }
    // 字符串生成链表
    public static ListNode stringToListNode(String input){
        int[] nodeValues = stringToIntegerArray(input);
        ListNode dummyRoot = new ListNode(0);
        ListNode ptr = dummyRoot;
        for (int nodeValue : nodeValues) {
            ptr.next = new ListNode(nodeValue);
            ptr = ptr.next;
        }
        return dummyRoot.next;
    }

    // 数组转字符串
    public static String integerArrayToString(int[] nums){
        return integerArrayToString(nums, nums.length);
    }

    public static String integerArrayToString(int[] nums, int length) {
        if (length == 0) {
            return "[]";
        }
        String result = "";
        for (int i = 0; i < length; i++) {
            int number = nums[i];
            result += Integer.toString(number) + ",";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }

    public static void main(String[] args) {
        // String input = "[1,2,3,4,5]";
        String input = "[1]";
        System.out.println(Arrays.toString(stringToIntegerArray(input)));
    }
}
