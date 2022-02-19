/*Good morning! Here's your coding interview problem for today.

This problem was recently asked by Google.

Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

Bonus: Can you do this in one pass? */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    Boolean solve(Set<Integer> set, Integer k)
    {
         for(Integer e : set)
	    {
	        if(set.contains(k-e))
	        {
	                 return true;
	        }
	            
	    }
	    return false;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    	
	   Codechef cf = new Codechef();
	    Set <Integer> set= new HashSet<Integer>();
	    BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        String[] strNums;
        strNums = bi.readLine().split(" ");
        for (int i = 0; i < strNums.length; i++) {
            set.add(Integer.parseInt(strNums[i]));
        }
	    int k = Integer.parseInt(bi.readLine());
	    System.out.println(cf.solve(set,k));
	   
	
	    
		// your code goes here
	}
}
