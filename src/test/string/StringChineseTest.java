package test.string;

import java.io.UnsupportedEncodingException;

public class StringChineseTest {

	/**
	 * 中文标示 
	 * 字节数：3;编码：UTF-8
	 * @param args
	 * @throws UnsupportedEncodingException 
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s ="ABC汉DEF";
		char[] schar = s.toCharArray();
		
		byte[] sbyte = s.getBytes("GBK");
		
		System.out.println("s.lenght:" + s.length());
		System.out.println("sbyte.lenght:" + sbyte.length);
		
		//System.out.println(s.substring(0,3));
		for(int i = 0; i < schar.length; i++){
			System.out.println("-" + schar[i]);
		}
		
	}
	
	//static String subCut(String str, int )

}
