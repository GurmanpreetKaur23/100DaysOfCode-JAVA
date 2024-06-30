// https://www.geeksforgeeks.org/problems/reverse-a-string/1?page=1&difficulty%255B%255D=-1&category%255B%255D=Strings&sortBy=submissions

//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- >0)
        {
            String str = read.readLine();
            System.out.println(new Reverse().reverseWord(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        String rev = "" ;
        int n = str.length() ;
        for(int i=n-1 ; i>=0 ; i--) {
            rev += str.charAt(i) ;
        }
        return rev ;
    } 
}
