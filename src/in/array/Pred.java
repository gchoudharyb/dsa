package in.array;

import java.util.function.Predicate;

public class Pred {
public static void main(String[] args) {
	Predicate<String> p=s->s.length()>5;
	System.out.println(p.test("n"));
	//System.out.println(p.test(99999999));
	}
}
