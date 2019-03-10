/**
 * 
 */
package class4;

/**
 * @author Lenovo
 *This script is all about how to handle the runtime polymorphism
 *Created By: Ganesh
 *Created On: 14-02-2019
 *
 *
 */
public class RuntimePolymorphismChildClass extends RuntimePolymorphismBaseClass {

	public void testing(){
		
		System.out.println("Hello this is child class properties");
		
		System.out.println("===========We are happy to welcome base class properties========");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RuntimePolymorphismBaseClass base = new RuntimePolymorphismChildClass();
		
		base.testing();
		
	}

}
