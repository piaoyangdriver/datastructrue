package sort;

public class DataSort {
	//下面是插入排序
	/**
	 * 直接插入排序
	 * 是将第i位插入到前面i-1位已经排序好的序列中
	 * i从1开始
	 * @param array
	 * @return
	 */
	public static int[] insertSort(int array[]){
		for(int i = 1; i< array.length; i++){
			
			int temp = array[i];
			//这里用的是顺序查找方法
			/*int j = 0;
			for(j = i - 1; j > -1 && array[j] > temp; j--){、、直到小于
				array[j+1] = array[j];				
			}
			array[j+1] = temp;
			*/
			
			/*while(j >=0 && temp < array[i]){
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = temp;*/
			
			//下面用二分查找方法(非递归,0-j),升序
			int mid = 0;
			int end = i - 1;
			int start = 0;
			while(start <= end){
				mid = (end + start)/2;
				
				if(array[mid] <= temp){
					start = mid + 1;
				}
				if(array[mid] > temp){
					end = mid - 1;
				}
			}
			for(int k = i; k > mid; k--){
				array[k] = array[k - 1];
			}

			array[start] = temp;
			
			System.out.println();
			System.out.print("第" + i +"轮排序 ");
			printArray(array);
		}
		return array;
	}
	
	/**
	 * 希尔排序,
	 * 将一个数组分成若干组，每组由若干相隔一段距离的元素组成，这段距离成为增量，
	 * 在一个数组内采用直接插入排序的算法进行排序
	 * 
	 * @param array
	 * @return
	 */
	public static int[] shellSort(int array[]){
		for(int delta = array.length/2; delta >= 1; delta /= 2){
			
			for(int i = delta; i < array.length; i++){
				int temp = array[i];
				int j = i - delta;				
				while(j >=0 && temp < array[j]){
					array[j+delta] = array[j];
					j-=delta;
				}
				array[j+delta] = temp;
			}
		}
		return array;		
	}
	
	//下面是交换排序
	/**
	 * 冒泡排序
	 * 比较相邻两个元素的关键字值，如果反序则交换
	 * 每一趟将最大的元素交换到
	 * @param array
	 * @return
	 */
	public static int[] bubbleSort(int[] array){
		boolean flag = true;
		for(int i = 1; i < array.length && flag; i++){//遍历的趟数
			flag = false;
			
			for(int j = 0; j < array.length - i; j++){				
				if(array[j] > array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					flag = true;
				}
			}
		}
		return array;
	}
	
	/**
	 * 快速排序
	 * 在数据序列中选择一个作为基准值,每趟从数据序列的两端开始交替进行
	 * 将小于基准值的元素交换到序列前段,将大于基准值的元素交换到序列后端
	 * 介于两者之前的位置则成为基准值的最终位置
	 * @param array
	 * @return
	 */
	public static int[] quickSort(int[] array, int start, int end){
		if(start < end){//这个条件必须加上
			int i = start, j = end;
			int vot = array[start];
			while(i != j){
				while(i < j && array[j] >= vot){
					j--;
				}//直到array[j] <= vot
				
				if(i < j){//前面i位置为空的
					array[i] = array[j];//这时候j位置为空
					i++;
				}
				
				while(i < j && array[i] < vot){
					i++;
				}//直到array[i] >= vot
				if(i < j){
					array[j] = array[i];//i位置为空了
					j--;
				}			
			}
			array[i] = vot;
			System.out.print(start + ".." + end + ", vot = " + vot + " ");
			quickSort(array, start, j-1);//这里是j-1
			quickSort(array, i+1, end);
		}
		return array;
	}
	
	//选择排序
	/**
	 * 直接选择排序选择排序
	 * 
	 * @param array
	 * @return
	 */
	public static int[] selectionSort(int[] array){
		for(int i = 0; i < array.length - 1; i++){
			int min = i;
			for(int j = i + 1; j < array.length; j++){
				if(array[j] < array[min]){
					min = j;
				}
				System.out.println(" min " + min);
			}
			
			if(min != i){
				int temp = array[i];
				array[i] = array[min];
				array[min] = temp;
			}
			
		}
		return array;
	}
	
	public static void printArray(int array[]){
		System.out.println("数组排序:");
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
	}
}
