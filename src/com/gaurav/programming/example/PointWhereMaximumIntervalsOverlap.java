package com.gaurav.programming.example;

import java.util.HashMap;
import java.util.Map;

public class PointWhereMaximumIntervalsOverlap {
	public static Integer getMaximumIntervalsOverlap(int [] arrivalTime , int [] existTime)
	{
		Map<String,Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < existTime.length; i++) {
			
			if(check(map,arrivalTime[i],existTime[i]))
			{
				String exKey = map.get
			}
			else
			{
				map.put(arrivalTime[i]+"_"+existTime[i], 1);
			}
			
			
			
		}
		
		
		
		return 0;
	}
	
	public static boolean check(Map<String,Integer> map , Integer arrivalTime , Integer existTime) 
	{
		for (Map.Entry<String,Integer> entry : map.entrySet()) {
			String exKey = entry.getKey();
		
			Integer existArrivalTime = Integer.parseInt(exKey.split("_")[0]);
			Integer eExistTimee = Integer.parseInt(exKey.split("_")[1]);
			
			if(arrivalTime == existArrivalTime || arrivalTime==eExistTimee || (arrivalTime > existArrivalTime && arrivalTime < eExistTimee))
			{
				return true;
			}
			else if (existTime == existArrivalTime || existTime==eExistTimee || (existTime > existArrivalTime && existTime < eExistTimee)) {
				return true;
			}
			else
			{
				return false;
			}
		}
		return false;
	}
	
public static void main(String[] args) {
	
}
}
