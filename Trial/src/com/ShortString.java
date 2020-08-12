package com;

import java.util.ArrayList;
import java.util.List;

public class ShortString {

	
	public static void main(String[] args) {		
		String s = "aabccaccdccccceabbccdeeeabbbccddeeaaa";
		System.out.println(getShortStringCount(s));		
	}
	
	private static int getShortStringCount(String s) {		
		int distCharCnt = 0;
		List distChar = new ArrayList();
		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			String val = String.valueOf(arr[i]);
			if (!distChar.contains(val)) {
				distChar.add(val);
			}
		}		
		distCharCnt = distChar.size();
		
		int shortStrCnt = arr.length;
		System.out.println(shortStrCnt);
		System.out.println(distCharCnt);
		int count = 0;
		distChar.clear();
		for (int i = 0; i < arr.length; i++) {	
			count = 0;
			for (int j = i; j < arr.length; j++) {
				String val = String.valueOf(arr[j]);
				if (!distChar.contains(val) || (j>i && (arr[j] == arr[j-1])) ) {
					++count;
					if (!distChar.contains(val)) {
						distChar.add(val);
						if (distCharCnt == distChar.size()) {
							break;
						}
					}
				}
			}
			if (distCharCnt == distChar.size() && shortStrCnt> count) {
				shortStrCnt = count;
			}
			distChar.clear();
		}		
		return shortStrCnt;		
	}
	
}
