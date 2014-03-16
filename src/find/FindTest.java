/**
 * 
 */
package find;

/**
 * @author hp
 * 
 */
public class FindTest {
	public static void main(String[] args) {
		int array[] = {1,2,3,4,5,6,7,8,9};
		
		//二分查找要先排好序
		FindArray find = new FindArray(array);		
		int index = find.binarySearch(9, 0, array.length-1);
		System.out.println(index);
	}

}
