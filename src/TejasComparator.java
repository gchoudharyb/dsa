import java.util.Comparator;
import java.util.TreeSet;

public class TejasComparator {
	public static void main(String[] args) {
		
	
	TreeSet<Integer> t=new TreeSet<>(new Comparator<Integer>()
			{
		@Override
		public int compare(Integer i1,Integer i2)
		{
			return i2-i1;	
			
		}
		});
	t.add(5);
	t.add(7);
	t.add(8);
	t.add(9);
System.out.println(t);
	}
}
