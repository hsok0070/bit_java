package day19;

@FunctionalInterface // 추상메소드가 하나만 존재할 경우 해당.
public interface Command {
	
	void exec();
	default public void print() {
		System.out.println("================");
	}

}

class DeleteCommand implements Command{
	public void exec() {
		System.out.println("DeleteCommand   수행");
	}
}
class UpdateCommand implements Command{
	public void exec() {
		System.out.println("UpdateCommand   수행");
	}
}
class InsertCommand implements Command{
	public void exec() {
		System.out.println("InsertCommand   수행");
	}
}
class SelectCommand implements Command{
	public void exec() {
		System.out.println("SelectCommand   수행");
	}
}


