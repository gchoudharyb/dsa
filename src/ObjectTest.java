import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ObjectTest {
public static void main(String[] args) {
	/*Integer i1 = 50;
	Integer i2 = i1;
	i1=null;
	System.out.println(i1);
	System.out.println(i2);
	
	String s = "GAURAVHghtytytytyt KUMAR";
	String y = s.replaceAll("^.{0,3}", "*");
	System.out.println(y);
	System.out.println(s);*/
	CharSequence inputStr = "abbabcd";
    String patternStr = "^[\\p{L}\\s.’\\-,]+$";
	
	String stringToSearch = "gchoudharyb@gmail.com";
	String content =    "some string with 'the data i want' inside";
             
String regex    =   "end$";
   // Pattern p = Pattern.compile("^[a-zA-Z0-9]{4}"); 
    Pattern p = Pattern.compile("^(.+?)@");  // the pattern to search for
    Matcher matcher = p.matcher(stringToSearch);
    String theGroup = "";
    Map<Integer, Integer> map = new HashMap<>();
    // if we find a match, get the group 
    if (matcher.find())
    {
    	 for (int i = 0; i <= matcher.groupCount(); i++) {
    	        // Get the group's captured text
    	        String groupStr = matcher.group(i);

    	        // Get the group's indices
    	        int groupStart = matcher.start(i);
    	        int groupEnd = matcher.end(i);
    	        map.put(groupStart, groupEnd);

    	        
     }
    	 String finalStr="";
    StringBuilder builder = new StringBuilder(stringToSearch);
    	 for (Map.Entry m : map.entrySet()) {
			builder.replace((int)m.getKey(), (int)m.getValue(), getReplaceValue("*", ((int)m.getValue()-(int)m.getKey())));
		}
    	System.out.println(builder.toString());
    	 
      // we're only looking for one group, so get it
    	//System.out.println(m.replaceAll("*"))
    	//;
      // theGroup = m.group(0).sta;
     //  m.start();
      // System.out.println(m.start(0));
     //  System.out.println(m.end());
       //System.out.println(m.groupCount());
      
      // print the group out for verification
     // System.out.println(theGroup);
    }
  //  String y = stringToSearch.replaceAll("^[a-zA-Z0-9]{4}", "***");
	//System.out.println(y);
}
public static String getReplaceValue(String r , Integer in)
{
	String r1="";
	 if(in > 0)
	 {
		 for (int i = 0; i < in; i++) {
			r1+=r;
		}
	 }
	 return r1;
}
}
