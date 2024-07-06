// https://www.naukri.com/code360/problems/star-pattern_893204?interviewProblemRedirection=true&search=patter&leftPanelTabValue=PROBLEM

import java.util.* ;
import java.io.*; 
public class Solution {
	public static void printPattern(int n){
		// Write your code here.
		for(int i=0 ;i<n ;i++ ) {
		for(int j=1 ; j<n-i ; j++) {
			System.out.print(" ");
		}
		for(int j=0 ;j<=2*i ;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	}
}
