/*
 * @lc app=leetcode id=415 lang=java
 *
 * [415] Add Strings
 */

// @lc code=start
class Solution {
    public String addStrings(String num1, String num2) {
        int len = Math.max(num1.length(), num2.length());
        int i = num1.length()-1;
        int j = num2.length()-1;
        String ret = "";
        int carry = 0;
        while(i >= 0 | j >= 0){
                int sum = 0;
                if(i>=0) sum += num1.charAt(i--) - '0';
                if(j>=0) sum += num2.charAt(j--) - '0';
                sum += carry;
                carry = sum / 10;
                ret = Integer.toString(sum % 10) + ret;
        }
        if(carry > 0)
            ret = Integer.toString(carry) + ret;
        return ret;
    }
}
// @lc code=end

