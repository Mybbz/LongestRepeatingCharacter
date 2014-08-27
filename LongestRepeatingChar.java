/*This is a interview question from Bloomberg
 *  Find the longest repeating character in a sorted string 
 */

package com.bloomberg.coding;

public class LongestRepeatingChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaaaabbbccccccccccdddddeffffggghhiiiiijkkkkk";
		System.out.print(findLongest(str));
	}
	
	public static Character findLongest(String str){
		char[] s = str.toCharArray();
		char curChar = s[0];
		char longestChar = s[0];
		int curCount = 1;
		int longestCount = 0;
		for(int i=1; i<s.length && (longestCount < s.length - i + curCount); i++){
			if(s[i] == curChar){
				curCount ++;
			}else{
				if(curCount > longestCount){
					longestCount = curCount;
					longestChar = curChar;
				}
				curCount = 1;
				curChar = s[i];
			}
		}
		return new Character(longestChar);
	}

}
