package week1.day1;

public class Learnmethodobj {
	public void browsername() { 
		System.out.println("chrome");
		
	}
	private void browserversion(int version) {
		System.out.println(version);

}
	void browserlogo(char logo) {
		System.out.println(logo);
		
	}
public int age(int a , int b) {
  return a+b;
  
}
public String name(int age, String name) {
  return null;
}

	public static void main(String[] args) {
		 Learnmethodobj bv = new Learnmethodobj();
         bv.browserversion(5);
		 Learnmethodobj bn = new Learnmethodobj();
		 bn.browsername();
		 Learnmethodobj bl = new Learnmethodobj();
		 bl.browserlogo('c');
		 Learnmethodobj ba = new Learnmethodobj();
		 ba.age(2,3);


         
         
	}

}
