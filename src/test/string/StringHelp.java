package test.string;

public class StringHelp {
	
	public static void main(String[] args){
		//字符串反转
		String s = "A quick brown fox 实数jumps over the lazy dog中ss国国家aaa";
		
		//1:字符窜的charAt();
		for(int i = 0; i < s.length(); i++){
			System.out.print(s.charAt(s.length()- 1 - i));
		}
		
		//2 调用StringBuffer类的reverse();
		System.out.println();
		StringBuffer str = new StringBuffer(s);
		str.reverse();
		System.out.print(str);
		
		//采用递归算法
		System.out.println();
		System.out.println(reverseString(s));
	}
	
	 static String reverseString(String ss){
		 String rs = "";
		 if(ss.length() > 0){
			 rs = reverseString(ss.substring(1)) + ss.charAt(0);
		 }
		return rs;
	}

}
