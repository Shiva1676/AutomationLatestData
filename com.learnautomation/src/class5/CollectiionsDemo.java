/**
 * 
 */
package class5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lenovo
 *This script is to handle dynamic Objects. 
 *Created By: Ganesh
 *Created On: 17-02-2019
 */
public class CollectiionsDemo {

	public static void main(String[] args) {
	
		
		List<String> allValues = new ArrayList<>();
		
		allValues.add("Mohan");
		
		allValues.add("Shiva");
		
		allValues.add("Ganesh");
		
		allValues.add("Kumar");
		
		allValues.add("Terapalli");
		
		allValues.add("Mohan");
		
		int count = allValues.size();
		
		System.out.println("The total number of values are:"+count);
		
		for(int i=0; i<count; i++){
			
		String text = allValues.get(i);
		
		System.out.println(text);
			
		}
		

	}

}
