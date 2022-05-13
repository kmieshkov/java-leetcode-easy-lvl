/*
Implement strStr().

Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
Clarification:
What should we return when needle is an empty string? This is a great question to ask during an interview.
For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().

Example 1:
Input: haystack = "hello", needle = "ll"
Output: 2

Example 2:
Input: haystack = "aaaaa", needle = "bba"
Output: -1
 */

public class ImplementStrStr {

	public static int strStr(String haystack, String needle) {
		if (needle.length() > haystack.length()) {
			return -1;
		}
		for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
			int j = 0;
			while (haystack.charAt(i + j) == needle.charAt(j)) {
				if (j == needle.length() - 1) {
					return i;
				}
				j++;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
//		String haystack = "hello";
//		String needle = "ll";

//		String haystack = "mississippi";
//		String needle = "issipi";

		String haystack = "abc";
		String needle = "c";

		System.out.println(strStr(haystack, needle));
	}
}
