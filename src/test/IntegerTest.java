package test;

public class IntegerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Integer i1 = -128;
		Integer i2 = -128;
		//LinkedList
		//ArrayList
		if (i1 == i2)
			System.out.println("i1 and i2 is equal");
		else
			System.out.println("i1 and i2 is not equal ");*/
		int[] array = new int[]{1, -2, 3, 10, -4, 7, 2, -5};
		int maxValue = -(1<<31);
		int sum = 0;
		for(int i = 0; i < array.length; i++){
			
			for(int j = i; j < array.length; j++){
				for(int k = j; k < array.length; k++){
					//sum = sum + arra[k];
				}
			}
		}
		
		
		System.out.print(maxValue);
	}
}
