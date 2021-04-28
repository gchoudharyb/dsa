package com.gaurav.linked.list.collection;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
public static void main(String[] args) {
	Comparator<String> comparator = new Comparator<String>() {
		
		@Override
		public int compare(String o1, String o2) {
			
			if(o1.length()==o2.length())
			{
				return o2.compareTo(o1);
			}	
			else
			return o1.length()-o2.length();
		}
	};
	Set<String> stringSet = new TreeSet<>((o1,o2)-> o1.length()-o2.length());
	
	stringSet.add("gaurav");
	stringSet.add("saurab");
	stringSet.add("aauravkkk");
	stringSet.add("nauravsdsdsd");
	stringSet.add("xauravsdsdsdsd");
	stringSet.add("zauravsdsdsdsdssd");
	stringSet.add("yauravsdsdsdsdsdsdsd");
	stringSet.add("gauravsdsdsdsdsdsdsdsdsdsd");
	stringSet.add("gauravsdsdsdsdsdsdsdsdsdsdsdsd");
	stringSet.add("gauravsdsdsdsdsdsdsdsdsdsdsdsdsdsdsdsd");
	System.out.println(stringSet);
	Set<Integer> intSet = new TreeSet<>(new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {
		int diff= 	o2-o1;
		if(diff==0)
		{
			return 0;
		}
		else if(diff>0)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}});
	intSet.add(10);
	intSet.add(20);
	intSet.add(5);
	intSet.add(910);
	intSet.add(110);
	intSet.add(100);
	intSet.add(101);
	intSet.add(102);
	System.out.println(intSet);
	
	System.out.println("A".equals(null));
	System.out.println("A".compareTo(null));
	
	
}
}
