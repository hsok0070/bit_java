package day16;

public class Test02 {
	public static void main (String[] args) {
		System.out.println(" main start ");
		String msg = null;
		msg = "xmlsfd";
		
		try {
		System.out.println(msg.charAt(3));
		int num = Integer.parseInt(msg);
		} catch (NullPointerException e) {
			System.out.println(" 예외 처리" + e.getMessage()); //null
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(" 예외 처리" + e.getMessage()); // index
		} catch (NumberFormatException e) {
			System.out.println(" 예외 처리 + 정수로 입력해주세요."); // index
		}
		System.out.println(" main end ");
	}

}
