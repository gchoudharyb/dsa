
public class SplitTEst {
public static void main(String[] args) {
	String s = "Bank_Branch_Code";
	
	if(s.contains("_"))
	{
		String [] sarr = s.split("\\_");
		System.out.println(sarr[sarr.length-1]);
	}
	else
	{
		System.out.println(s);
	}
}
}
