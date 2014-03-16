package find;

public class FindArray {

	private int[] array;

	public FindArray(int[] array) {
		super();
		this.array = array;
	}

	/**
	 * 从排好序的数组中查找,二分查找
	 * 
	 * @param key
	 * @return
	 */
	public int binarySearch(int key, int start, int end) {
		int index = -1;
		if (start <= end) {
			int mid = (start + end) / 2;
			if (array[mid] == key) {
				index = mid;
			} else if (array[mid] < key) {
				index = binarySearch(key, mid + 1, end);
			} else if (array[mid] > key) {
				index = binarySearch(key, start, mid - 1);
			}
			return index;
		}
		return -1;
	}

	/**
	 * 非递归
	 * 
	 * @param key
	 * @param start
	 * @param end
	 * @return
	 */
	public int binarySearch2(int key, int start, int end) {
		while (start <= end) {
			int mid = (start + end) / 2;
			if (array[mid] == key) {
				return mid;
			} else if (key > array[mid]) {
				start = mid + 1;
			} else if (key < array[mid]) {
				end = mid - 1;
			}
		}
		return -1;
	}
}
