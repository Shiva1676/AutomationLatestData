/**
 * 
 */
package class5;

/**
 * @author Lenovo This script is used to know how the single dimension works and
 *         what are the drawback of the single dimensional
 * 
 *         To overcome the size we require concept called Collection and for to
 *         overcome the issue like data type. You have to use Object Class which
 *         is the parent/super class for all classes.
 * 
 *         What is Collection? Collection in java is framework that provide an
 *         architecture to store and manipulate the group of data objects. When
 *         i say data Objects it can be any data type.
 * 
 *         Colection is the combination of both interface(like list, set, quene,
 *         dequene etc) and classes like(ArrayList, LinkedList, HashMapList and
 *         etc)
 * 
 *         Created By: Ganesh Created On: 16-02-2019
 */
public class SingleDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[4];

		arr[0] = 123;

		arr[1] = 456;

		arr[2] = 789;

		arr[3] = 100;

		int size = arr.length;

		System.out.println("The size of the array is:" + size);

		for (int i = 0; i < size; i++) {

			System.out.println(arr[i]);
		}

	}

}
