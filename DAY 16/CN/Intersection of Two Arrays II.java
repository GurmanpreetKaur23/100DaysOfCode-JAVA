// https://www.naukri.com/code360/problems/array-intersection_625161?interviewProblemRedirection=true&search=inter&leftPanelTabValue=PROBLEM

import java.util.Arrays;
public class Solution{  
    
    public static void intersections(int arr1[], int arr2[]) {
    	//Your code goes here
        
        for(int i=0 ; i<arr1.length ;i++ ) {
            for(int j=0 ; j<arr2.length ;j++) {
                if(arr1[i]==arr2[j]) {
                    System.out.print(arr1[i]+" ");
                    arr2[j] = -1;
                    break ;
                }
            }
        }
    }
}

