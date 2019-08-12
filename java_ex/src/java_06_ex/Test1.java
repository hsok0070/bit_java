package java_06_ex;

public class Test1 {
	
	public static String leftPad(String str, int size, char padChar) { // 인스턴스 메소드
		if (str.length() > size) {
			return str;
		}
		int count = size-str.length();
		for(int i = 0 ; i<count ;i++) {
			str = padChar+str;
		}
		return str;
	}
	
	public static String rightPad(String str, int size, char padChar) { // 인스턴스 메소드
		if (str.length() > size) {
			return str;
		}
		int count = size-str.length();
		for(int i = 0 ; i<count ;i++) {
			str = str+padChar;
		}
		return str;
	}

	
	public static void main (String[] args) { 
		Test1 t = new Test1(); // 위 인스턴스 메소드 이기때문에 메모리 생성후 사용 할 수 있다.
		
		System.out.println(t.leftPad("bit", 6, '#')); // ###bit
		System.out.println(t.rightPad("bit", 6, '#')); // ###bit
		System.out.println(t.leftPad("bit", 5, '$')); // &&bit
		System.out.println(t.leftPad("bit", 2, '&')); // bit
	}
}
