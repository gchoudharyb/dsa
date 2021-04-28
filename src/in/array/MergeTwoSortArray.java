package in.array;

public class MergeTwoSortArray {

	public  static Integer[] mergeArray(Integer []  sortedArr1,Integer [] sortedArr2)
	{
		Integer[] mergeArray = null;
		if(sortedArr1.length<=0 && sortedArr2.length<=0)
		{
			System.out.println("Both array are blank");
		}
		else if(sortedArr1.length<=0)
		{
			return sortedArr2;
		}
		else if(sortedArr2.length<=0)
		{
			return sortedArr1;
		}
		else
		{
			int sortedArr1Len = sortedArr1.length;
			int sortedArr2len= sortedArr2.length;
			mergeArray = new Integer[sortedArr1Len+sortedArr2len];
			if((sortedArr1Len > sortedArr2len) || (sortedArr1Len > sortedArr2len))
			{
				for (int i = 0; i < sortedArr1.length; i++) {
					if(i<sortedArr2len && sortedArr1[i]<sortedArr2[i])
					{
						mergeArray[i]=sortedArr1[i];
					}
					else if(i<sortedArr2len)
					{
						mergeArray[i]=sortedArr2[i];
					}
				}
			}
			else
			{
				for (int i = 0; i < sortedArr2.length; i++) {
					if(i<sortedArr1Len && sortedArr2[i]<sortedArr1[i])
					{
						mergeArray[i]=sortedArr2[i];
					}
					else if(i<=sortedArr1Len)
					{
						mergeArray[i]=sortedArr1[i];
					}
				}
			}
			
		}
		return mergeArray;
	}
	public static void main(String[] args) {
		Integer [] mergerArray = mergeArray(new Integer [] {0,3,4,31}, new Integer [] {4,6,30});
		for (int i = 0; i < mergerArray.length; i++) {
			System.out.println(mergerArray[i]);
		}
	}
}
