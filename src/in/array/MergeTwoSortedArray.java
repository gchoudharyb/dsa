package in.array;

public class MergeTwoSortedArray {
	
public static int[] merge(int [] arr1 , int [] arr2) 
{
	int [] result = new int[arr1.length+arr2.length];
	int k=0;
	for (int i = 0,j=0; i <= ((arr1.length)-1) ; i++,j++) {
		
		if(arr1[i] > arr2[j])
		{
			result[k] =  arr2[j];
			result[k+1] = arr1[i];
			k++;
			k++;
		}
		else
		{
			result[k] =  arr1[i];
			result[k+1] = arr2[j];
			k++;
			k++;
		}
		
	}
	
	return result;
}	
public static int[] merge1(int [] arr1 , int [] arr2) 
{
	int [] result = new int[arr1.length+arr2.length];
	int k=0;
	int i = 0,j=0;
	while (i+j<=(arr1.length+arr2.length)-2) {
		
		if(arr1[i] > arr2[j])
		{
			result[k] =  arr2[j];
			k++;
			j++;
		}
		else
		{
			result[k] =  arr1[i];
			k++;
			i++;
		}
		
	}
	
	return result;
}		
public static void main(String[] args) {
	int[] inputArr1 = new int[] { 1, 2, 20, 91, 100, 151, 180, 260, 311 };
	int[] inputArr2 = new int[] { 1, 2, 21, 90, 91, 151, 179, 180, 310 };

	int [] result = merge1(inputArr1,inputArr2);

	for (int i = 0; i < result.length; i++) {
		System.out.println(result[i]);
	}
}
}
