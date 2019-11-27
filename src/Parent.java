
public class Parent {
	
	public Parent(boolean f) {
		this(6789);
		System.out.println("hai"+ f);
	
	}
	public Parent(int s) {
		this(456,"chandru");
		System.out.println(s);
	}
	public Parent(int r,String e) {
		this(9002,"abi",143.1f);
		System.out.println(r+"\n"+e);
		
	}
	public Parent(int x,String y,float f) {
	System.out.println(x+"\n"+y+"\n"+f);
	
	}
	public static void main(String[] args) {
		Parent p = new Parent(true);

		
	}
}
	


