package binarytree;

public class BinarySortTreeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinarySortTree<Integer> bs = new BinarySortTree<Integer>();
		System.out.println("插入: ");
		int[] key = { 54, 18, 66, 87, 36, 12, 54, 81, 15, 76, 57, 6, 40, 99, 85 };
		for (int i = 0; i < key.length; i++) {
			if (bs.insert(new Integer(key[i]))) {
				System.out.print(key[i] + " ");
			}
		}

		System.out.println();
		Integer element = new Integer(12);
		System.out.println("查找" + element + "," + bs.search2(element));
	}

}
