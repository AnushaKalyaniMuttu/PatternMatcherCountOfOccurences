package com.bean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherCountOfSubStringInAString {
    public static void main(String[] args) {
    	 String input = "anushanusha";
         String pattern = "(\\w+)\\1+";
         Pattern regexPattern = Pattern.compile(pattern);
         Matcher matcher = regexPattern.matcher(input);
         while(matcher.find()) {        	
        	 printCountOfOccurences(matcher.group(),matcher.group(1));
         }
    }

	private static void printCountOfOccurences(String group, String group2) {
	        int count = 0;
	        int lastIndex = 0;
	        while (lastIndex != -1) {
	            lastIndex = group.indexOf(group2, lastIndex);
	            if (lastIndex != -1) {
	                count++;
	                lastIndex += group2.length();
	            }
	        }
	        System.out.println("Count of occurrences for "+group2 +" is :" + count);
	}
         
      

    }


