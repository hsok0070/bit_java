package day14.tv;

	interface Tv {
		public void poweron();
		public void poweroff();
}

	
class STV implements Tv{
	public  void poweron() {
		System.out.println("STV poweron");
	}
	public void poweroff() {
		System.out.println("STV powerof");
	}
	
}


class LTV implements Tv{
		public void poweron() {
		System.out.println("LTV poweron");
		}
		public void poweroff(){
		System.out.println("LTV poweroff");
		}
 }
class ITV implements Tv{
	@Override
	public void poweron() {
		
	}
	
	@Override
	public void poweroff() {
		
	}
}

