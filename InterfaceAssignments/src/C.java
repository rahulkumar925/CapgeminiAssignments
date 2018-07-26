//Define interface "A" with disp1() method. Derive from "A" interface "B" with 
//"disp2" method. Derive class "C" from "B". Instantiate class "C" and call its members
//as well as instantiate class "C" and call its members as well as derived from parent interfaces.

interface A {

	void disp1();

}

interface B extends A {

	void disp2();
}

public class C implements B {

	@Override
	public void disp1() {

		System.out.println("Disp1 of Interface A.");

	}

	@Override
	public void disp2() {

		System.out.println("Disp2 of Interface B.");
	}

	public static void main(String args[]) {

		C c = new C();
		c.disp1();
		c.disp2();

	}

}
