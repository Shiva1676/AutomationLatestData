/**
 * 
 */
package class5;

/**
 * @author Lenovo
 *This script is to know what is Interface? How to use Interface
 *Created By: Ganesh
 *Created On: 16-02-2019
 */
public class InterfaceDemo implements CreatingInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Creating child reference with child class Object
		
		System.out.println("Creating child reference with child class Object");
		
		InterfaceDemo demo = new InterfaceDemo();
		
		demo.abc();
		
		demo.def();
		
		demo.ghi();
		
		demo.testing();
		
		
		// Scenario 2: Creating interface ref with child class Object
		
		System.out.println("======Creating interface ref with child class Object========");
		
		CreatingInterface demo1 = new InterfaceDemo();
		
		demo1.abc();
		
		demo.def();
		
		demo.ghi();
		
		
		
	}
	
	
	
	public void testing(){
		
		System.out.println("This is child class property");
	}

	public void abc(){
		
		System.out.println("We are accessing abc method from interface");
		
	}
	
	public void def(){
		
		System.out.println("We are accessing def method from interface");
	}
	
	
	public void ghi(){
		
		System.out.println("We are accessing ghi method from interface");
	}
}
