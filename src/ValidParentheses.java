public class ValidParentheses {
    /*
Problem 1: Valid Parentheses
Description:
    Given a string only containing the characters '(' and ')', determine if the input string is valid.
    The brackets must close in the correct order.
*/
    /**
     * Approach 1: Traverse the String
     * Algorithm:
     * This question is very easy. We only need to check the number of '(' and ')' whether equals to each other or not.
     * So we use a number: status to represent the difference between '(' and ')'.
     * When it encounters '(' status++, otherwise status--.
     * if the character is ')' and --status- < 0 then return false.
     * At the end, we just need to check status equals to 0 or not.
     * (if a character is illegal, return false directly.)
     *
     * Complexity Analysis:
     *  Time complexity  : O(n). Single traversal of string.
     *  Space complexity : O(1). Only a variable status is need.
     */
    public class Solution {
        /*
         * @param s: A string
         * @return: whether the string is a valid parentheses
         */
        public boolean isValidParentheses(String str) {
            if (str == null || str.length() == 0) {
                return false;
            }
            int status = 0;
            for (char c : str.toCharArray()) {
                // character is '(' then status++
                if (c == '(') {
                    status++;
                    // character is ')' then status--
                    // if status < 0 return false
                } else if (c == ')') {
                    if (--status < 0) {
                        return false;
                    }
                    // illegal character
                } else {
                    return false;
                }
            }
            return status == 0;
        }
    }
    /**
     * Approach 2: Using Stack
     * Algorithm:
     * Every time we encounter a ‘(’, we push it onto the stack.
     * For every ‘)’ encountered, we pop a ‘(’ from the stack.
     * If ‘(’ is not available on the stack for popping at anytime or
     * if stack contains some elements after processing complete substring,
     * the substring of parentheses is invalid.
     * Complexity Analysis:
     *  Time complexity  : O(n). Single traversal of string.
     *  Space complexity : O(n). A size of stack is n.
     */
    public class Solution {
        /*
         * @param s: A string
         * @return: whether the string is a valid parentheses
         */
        public boolean isValidParentheses(String str) {
            if (str == null || str.length() == 0) {
                return false;
            }
            Stack<Character> stack = new Stack<Character>();
            for (char c : str.toCharArray()) {
                if (c == '(') {
                    stack.push(c);
                } else if (c == ')' && !stack.empty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            }
            return stack.empty();
        }
    }
/**************************************** Problem 2 -  Valid Parentheses ****************************************/
    Secondly, we do a little change based on Problem 1.
    Look at the question below.
/*
Problem 2: Valid Parentheses
Description:
    Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
    determine if the input string is valid.
    The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
*/
    /**
     * Approach : Using Stack
     * Algorithm:
     * In this question, there are three types of parentheses. "()","[]" and "{}".
     * So we need to use a Data Structure - Stack. It can help us to solve this problem easily.
     * This method is the same as Problem 1's Solution 2.
     * Traverse the String, push any open parentheses onto stack.
     * When encounters right parentheses, check the peek of stack.
     * If they could close in the correct order then pop the topmost element,
     * otherwise return false.
     *
     * Complexity Analysis:
     *  Time complexity  : O(n). Single traversal of string.
     *  Space complexity : O(n). A size of stack is n.
     *
     * Note:
     * Stack is also used in Postfix Expression.
     * Actually, this problem is a sub-question of How to calculate the Postfix Expression.
     */
    class Solution {
        /*
         * @param s: A string
         * @return: whether the string is a valid parentheses
         */
        public boolean isValid(String s) {
            if (s == null || s.length() == 0) {
                return false;
            }

            Stack<Character> stack = new Stack<>();
            // Iterate through string until empty
            for (char c : s.toCharArray()) {
                // Push any open parentheses onto stack
                if (c == '(' || c == '[' || c == '{') {
                    stack.push(c);
                    // Check stack for corresponding closing parentheses, false if not valid
                } else if (c == ')' && !stack.empty() && stack.peek() == '(') {
                    stack.pop();
                } else if (c == ']' && !stack.empty() && stack.peek() == '[') {
                    stack.pop();
                } else if (c == '}' && !stack.empty() && stack.peek() == '{') {
                    stack.pop();
                } else {
                    return false;
                }
            }

            // return true if no open parentheses left in stack
            return stack.empty();
        }
    }

}
