  
public class Employee extends Parent {
public Employee() {
	super(90);
	System.out.println("nothing is imposible");
	
}
public Employee(String name,int id,char initial){
	super(false);
	System.out.print(name  +"\n"   +   id   +"\n"+  initial);
	}
public static void main(String[] args) {
	//Employee n = new Employee();
	Employee o = new Employee("soundar",1234,'s');
	
	
}


}


