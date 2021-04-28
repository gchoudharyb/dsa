
 class A extends Ovrriding {
	
	  public void marry() 
	  {
		  System.out.println("other men");
		  
	  }
	 
public static void main(String[] args) {
	A a=new A();
	a.marry();
	Ovrriding o=new Ovrriding();
	o.marry();
	Ovrriding o1=new A();
	o1.marry();
}
}

/*
 * class Ovrriding { public void m1() { System.out.println("aai"); }
 * 
 * public void marry() { System.out.println("gaurav"); } }
 */
