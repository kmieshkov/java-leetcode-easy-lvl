/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"
E
xample 2:
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

 */

public class LongestCommonPrefix {

	public static int minString(String[] strs) {
		int l = 0;
		int index = 0;
		for (int i = 0; i < strs.length; i++) {
			if (l < strs[i].length()) {
				l = strs[i].length();
				index = i;
			}
		}
		return index;
	}

	public static String longestCommonPrefix(String[] strs) {
		String prefix = strs[minString(strs)];

		for(int i = 0; i < strs.length; i++) {
			while(strs[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
			}
		}
		return prefix;
	}

	public static void main(String[] args) {
//		String[] strs = {"flower","flow","flight"};
//		String[] strs = {"dog","racecar","car"};
//		String[] strs = {"ab","a"};
//		String[] strs = {""};
		String[] strs = {"a"};

		System.out.println(longestCommonPrefix(strs));
	}
}
