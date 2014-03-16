package classloader;

import java.util.Map;

public class ClassLoaderTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Object, Object> map = System.getProperties();
		for(Map.Entry<Object, Object> entry : map.entrySet()){
			 System.out.println(entry.getKey()+"\t"+entry.getValue()); 
		}
	}

}
