package sort;

public class MyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// 查找test
		/*
		 * int[] array = {0,1,2,3,4,5,6,7,8,9}; int index =
		 * MyTest.binarySearch2(array, 90, 0, array.length - 1);
		 * System.out.println(index);
		 */

		// 排序test
		int[] array = { 4, 5, 8, 1, 2, 7, 3, 6 };
		// MyTest.insertOrder(array);
		MyTest.selectSort(array);

		System.out.println();
		for (int i : array) {
			System.out.print(i + " ");
		}

	}
	
	//选择排序
	public static void selectSort(int[] array){
		for(int i = 0; i < array.length - 1; i++){
			int min = i;
			for(int j = i + 1; j < array.length; j++){
				if(array[j] < array[min]){
					min = j;
				}
			}
			//将本趟最小的元素交换到最前边
			if(min != i){
				int temp = array[i];
				array[i] = array[min];
				array[min] = temp;
			}
		}
	}

	// 交换排序:
	// 冒泡排序:相邻的两两交换,每一趟将数据序列中最大的元素交换到最后的位置
	public static void bubbleSort(int array[]) {
		for (int i = 1; i < array.length; i++) {
			boolean flag = true;
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] >= array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					flag = false;
				}
			}
			System.out.print(i + "趟:");
			for (int data : array) {
				System.out.print(" " + data);
			}
			System.out.println();

			if (flag) {
				break;
			}
		}
	}

	// 交换排序:快速排序
	public static void quickSort(int[] array, int low, int high) {
		int i = low;
		int j = high;
		if (i < j) {
			int temp = array[i];
			while (i != j) {
				while (i < j && array[j] >= temp) {
					j--;
				}
				if (i < j) {
					array[i] = array[j];
					i++;
				}
				while (i < j && array[i] <= temp) {
					i++;
				}
				if (i < j) {
					array[j] = array[i];
					j--;
				}
			}
			array[i] = temp;
			System.out.print( i + ".." + j + "..,temp=" + temp);
			quickSort(array, low, j-1);
			quickSort(array, i+1, high);
		}
	}

	// 插入排序,第i位排序到前面i-1个有序序列中
	public static void insertOrder(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int j = 0;
			int temp = array[i];
			for (j = i - 1; j > -1; j--) {
				if (array[j] >= temp) {
					array[j + 1] = array[j];
				} else {
					System.out.println("当前跳出的j是" + j);
					break;
				}
			}
			array[j + 1] = temp;
		}
	}

	// 二分查找
	public static int binarySearch(int[] array, int key) {
		int low = 0;
		int high = array.length - 1;
		int mid = 0;
		while (low <= high) {
			mid = (low + high) / 2;
			if (array[mid] < key) {
				low = mid + 1;
			} else if (array[mid] > key) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	public static int binarySearch2(int[] array, int key, int low, int high) {

		if (low > high) {
			return -1;
		}

		int mid = (low + high) / 2;
		if (array[mid] < key) {
			return binarySearch2(array, key, mid + 1, high);
		} else if (array[mid] > key) {
			return binarySearch2(array, key, low, mid - 1);
		} else {
			return mid;
		}
	}
}
