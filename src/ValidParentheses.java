/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.

Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false
 */

public class ValidParentheses {

	/************************ 1 Solution - String ****************************************/
	public static boolean checkBack(String str, char ch, int index) {
		if (index == 0) return false;
		if (ch == ']' && str.charAt(index-1) == '[') return true;
		if (ch == ')' && str.charAt(index-1) == '(') return true;
		if (ch == '}' && str.charAt(index-1) == '{') return true;
		return false;
	}

	public static boolean isValid(String str) {
		for(int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ')' || str.charAt(i) == '}' || str.charAt(i) == ']') {
				if(checkBack(str, str.charAt(i), i)) {
					str = str.substring(0, i - 1) + str.substring(i+1, str.length());
					i = 0;
				}
			}
		}
		if (str.length() > 0) return false;
		return true;
	}

	public static void main(String[] args) {
		String str = "()[]{}";
		System.out.println(isValid(str));
	}
}
