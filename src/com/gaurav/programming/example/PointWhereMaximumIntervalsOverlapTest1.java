package com.gaurav.programming.example;

import java.util.Arrays;

public class PointWhereMaximumIntervalsOverlapTest1 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 10, 5, 5 };
		int dep[] = { 4, 5, 12, 9, 12 };
		getWhereMaximumIntervalsOverlap(arr, dep);maxOverlap(arr, dep);
	}

	public static void getWhereMaximumIntervalsOverlap(int[] arrivalTime, int[] exitTime) {
		Arrays.sort(arrivalTime);
		Arrays.sort(exitTime);

		int arraySize = arrivalTime.length;

		int time = arrivalTime[0];
		int maxGuest = 1;
		int guestIn = 1;// initialized 1 by considering first arrival time
		int i = 1;
		int j = 0;
		while (i < arraySize && j < arraySize) {

			if (arrivalTime[i] <= exitTime[j]) {
				guestIn++;
				if (guestIn > maxGuest) {
					maxGuest = guestIn;
					time = arrivalTime[i];
				}

				i++;
			} else {
				guestIn--;
				j++;
			}
		}
		System.out.println("Maximum Number of Guests = " + maxGuest + " at time " + time);
	}
	
	public static void maxOverlap(int []start,int [] end )
	{
		int n = start.length;
	    // Finding maximum starting time
	    int maxa = Arrays.stream(start).max().getAsInt();
	     
	    // Finding maximum ending time
	    int maxb = Arrays.stream(end).max().getAsInt();
	     
	    int maxc = Math.max(maxa,maxb);
	         
	    int []x = new int[maxc + 2];
	    Arrays.fill(x, 0);
	         
	    int cur=0,idx=0;
	 
	    // reating an auxiliary array
	    for(int i = 0; i < n; i++)
	    {
	        // Lazy addition
	        ++x[start[i]];
	        --x[end[i]+1];
	    }
	         
	    int maxy=Integer.MIN_VALUE;
	     
	    //Lazily Calculating value at index i
	    for(int i = 0; i <= maxc; i++)
	    {
	        cur+=x[i];
	        if(maxy < cur)
	        {
	            maxy = cur;
	            idx = i;
	             
	        }        
	    }
	        System.out.println("Maximum value is:"+
	                        maxy+" at position: "+idx+"");
	         
	}
}
